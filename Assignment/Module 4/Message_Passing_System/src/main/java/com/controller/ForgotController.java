package com.controller;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.ForgotDao;
import com.model.Usermodel;


@WebServlet("/ForgotController")
public class ForgotController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ForgotController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		
		if(action.equalsIgnoreCase("submit"))
		{
			String email=request.getParameter("email");
			Usermodel u=new Usermodel();
			ForgotDao dao=new ForgotDao();
			u=dao.checkemail(email);
			
			if(u==null)
			{
				request.setAttribute("msg", "Invalid Email Address....");
				request.getRequestDispatcher("forgot.jsp").forward(request, response);
			}
			else
			{
				String emailid=u.getEmail();
				String username=u.getFname()+""+u.getLname();
				
				final String senderid = "male.fashion024@gmail.com";
				final String password = "flgvegxszjezfszf";
				
				Properties props = new Properties();
				
				String host = "smtp.gmai.com";
				
				props.put("mail.smtp.socketFactory.port", "465");
				props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
				props.put("mail.smtp.socketFactory.fallback", "true");
				props.put("mail.smtp.password", password);
			
				
				Session session = Session.getInstance(props, new Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(senderid, password);
					}
				});
				
				try {
					Random rand = new Random();
					int otp = rand.nextInt(900000) + 100000;
					Message msg = new MimeMessage(session);
					msg.setFrom(new InternetAddress(senderid));
					msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailid));
					
					msg.setSubject("OTP Request");
					String msg1 = "<!DOCTYPE html><html><head></head><body><center><div style='background-color:#f8f8f8; width:500px; height:200px'><div style='background-color:#00e58b; width:500px; height:50px'><h3 style='color:white; padding-top:10px;'>EmailDemo.com </h3></div><p style='color:gray; margin-left:-300px;'>Dear "
							+ username + ",</p><br><p style='color:gray; margin-top:-10px;'>" + otp
							+ "  is your One Time Password.Do NOT share this code with anyone for security reasons.this is valid for 10 minutes.</p><div></center></body></html>";
					msg.setContent(msg1, "text/html; charset=utf-8");
					
					Transport.send(msg);
					HttpSession otpsession = request.getSession();
					otpsession.setAttribute("otp", otp);
					otpsession.setMaxInactiveInterval(10 * 60);
					otpsession.setAttribute("Userdata", u);
					request.getRequestDispatcher("sendotp.jsp").forward(request, response);
				} catch (Exception e) {
					// TODO: handle exception
					request.setAttribute("Otp Error", "OTP Not Send...");
					request.getRequestDispatcher("forgot.jsp").forward(request, response);
					e.printStackTrace();
				
				}
			}
		}
		
		else if(action.equalsIgnoreCase("verify"))
		{
			HttpSession session=request.getSession(false);
			String G_otp=String.valueOf(session.getAttribute("otp"));
			String E_otp=request.getParameter("Enterotp");
			
			if(G_otp.equalsIgnoreCase(E_otp))
			{
				request.setAttribute("otpmatch", "OTP Match");
				request.getRequestDispatcher("changepassword.jsp").forward(request, response);
			}
			else
			{
				request.setAttribute("notmatch", "OTP Not Match");
				request.getRequestDispatcher("sendotp.jsp").forward(request, response);
			}
		}
		
		else if(action.equalsIgnoreCase("save changes"))
		{
			String pwd=request.getParameter("newpassword");
			Usermodel u=new Usermodel();
			HttpSession session=request.getSession(false);
			u=(Usermodel)session.getAttribute("Userdata");
			u.setPassword(pwd);
			u.setUid(u.getUid());
			
			ForgotDao dao=new ForgotDao();
			int r=dao.changepassword(u);
			if(r>0)
			{
				response.sendRedirect("Home.jsp");
				System.out.println("Password Recovery Success!...");
			}
			else
			{
				System.out.println("Error...");
			}

		}
	}

}
