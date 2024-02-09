package com.controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.dao.AdminDao;
import com.model.MainProductsModel;
import com.model.SubProductModel;
@WebServlet("/AdminController")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 512, // 512MB
maxFileSize = 1024 * 1024 * 512, // 512MB
maxRequestSize = 1024 * 1024 * 512) // 512MB
public class AdminController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    public AdminController() {
        super();
        // TODO Auto-generated constructor stub
    }
    private String extractfilename(Part file) {
	    String cd = file.getHeader("content-disposition");
	    System.out.println(cd);
	    String[] items = cd.split(";");
	    for (String string : items) {
	        if (string.trim().startsWith("filename")) {
	            return string.substring(string.indexOf("=") + 2, string.length()-1);
	        }
	    }
	    return "";
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("login"))
		{
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			
			if(email.equals("admin@gmail.com") && password.equals("admin123"))
			{
				response.sendRedirect("Admin/deshboard.jsp");
			}
			else 
			{
				response.sendRedirect("Admin/login.jsp");
			}
		}
		else if(action.equalsIgnoreCase("addmainproducts"))
		{
			String savePath = "C:\\Users\\master-49\\eclipse-workspace\\New_JAVA_Project\\src\\main\\webapp\\ProductImage";
			File fileSaveDir=new File(savePath);
			if (!fileSaveDir.exists()) {
				fileSaveDir.mkdir();
				
			}
			Part file=request.getPart("mimage");
		 	String fileName=extractfilename(file);
		    file.write(savePath+File.separator+fileName);
		    
		    String filePath=savePath+File.separator+fileName;
			System.out.println(filePath);
		    MainProductsModel mpm=new MainProductsModel();
			mpm.setMproductname(request.getParameter("mproductname"));
			mpm.setMimage(fileName);
			
			int x=new AdminDao().AddMProducts(mpm);
			if(x>0)
			{
				response.sendRedirect("Admin/deshboard.jsp");
			}
			else
			{
				response.sendRedirect("Admin/addmainproducts.jsp");
			}
		}
		else if(action.equalsIgnoreCase("addsubproducts"))
		{
			String savePath = "C:\\Users\\master-49\\eclipse-workspace\\New_JAVA_Project\\src\\main\\webapp\\ProductImage";
			File fileSaveDir=new File(savePath);
			if (!fileSaveDir.exists()) {
				fileSaveDir.mkdir();
			}
			Part file=request.getPart("simage");
		 	String fileName=extractfilename(file);
		    file.write(savePath+File.separator+fileName);
		    
		    String filePath=savePath+File.separator+fileName;
		    System.out.println(filePath);
			
		    SubProductModel spm=new SubProductModel();
		    
		    try {
		    spm.setMproductid(Integer.parseInt(request.getParameter("mproductid")));
		    }catch (NumberFormatException e)
		    {
		    	
		    }
			spm.setSproductname(request.getParameter("sproductname"));
			spm.setSimage(fileName);
			spm.setPrice(request.getParameter("price"));
			spm.setContent(request.getParameter("content"));
			int x=new AdminDao().AddSProducts(spm);
			if(x>0)
			{
				response.sendRedirect("admin/deshboard.jsp");
			}
			else
			{
				response.sendRedirect("admin/addsubproducts.jsp");
			}
		}
	}
}
