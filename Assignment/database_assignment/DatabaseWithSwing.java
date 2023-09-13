package com.database_assignment;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class data implements ActionListener
{
	JFrame frame;
	JLabel l1,l2,l3,l4,l5,l6,msg;
	JTextField t1,t2,t3,t4;
	JRadioButton r1,r2;
	JButton b1,b2,b3,b4,b5;
	JPanel p1;
	ButtonGroup bg;
	public data()
	{
		frame=new JFrame("REGISTRATION FORM");
		frame.setLayout(new GridLayout(8,2));
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1=new JPanel();
		
		bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		l2=new JLabel("ID:");
		t2=new JTextField(15);
		
		l3=new JLabel("Name:");
		t3=new JTextField(15);
		
		l4=new JLabel("Gender:");
		r1=new JRadioButton("Male");
		r2=new JRadioButton("Female");
		
		l5=new JLabel("Address:");
		t1=new JTextField(15);
		
		l6=new JLabel("Contact:");
		t4=new JTextField(15);
		
		b1=new JButton("Exit");
		b2=new JButton("Register");
		b3=new JButton("Delete");
		b4=new JButton("Update");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		p1.add(r1);
		p1.add(r2);
		
		frame.add(l2);
		frame.add(t2);
		
		frame.add(l3);
		frame.add(t3);
		
		frame.add(l4);
		frame.add(r1);
		frame.add(r2);
		
		frame.add(l5);
		frame.add(t1);
		
		frame.add(l6);
		frame.add(t4);
		
		frame.add(msg);
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		
		frame.add(p1);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			System.exit(0);
		}
		else if(e.getSource()==b2)
		{
			String gender="";
			if(r1.isSelected())
			{
				gender="Male";
			}
			else
			{
				gender="Female";
			}
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","");
				System.out.println("Connection Established");
				Statement st=cn.createStatement();
				String qry="insert into swing values("+t1.getText()+",'"+t2.getText()+"','"+gender+"','"+t3.getText()+"','"+t4.getText()+"')";
				int x=st.executeUpdate(qry);
				if(x>0) 
				{
					msg.setText("Record inserted");
				}
				else
				{
					msg.setText("Record  not inserted");
				}
			} catch (Exception e1) 
			{
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==b3)
		{
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","");
				System.out.println("Connection Established");
				Statement st=cn.createStatement();
				String qry="delete from swing where id=("+t1.getText()+")";
				int x=st.executeUpdate(qry);
				if(x>0) 
				{
					msg.setText("Record Deleted");
				}
				else
				{
					msg.setText("Record  not Deleted");
				}
			} catch (Exception e1) 
			{
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==b4)
		{
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","");
				System.out.println("Connection Established");
				Statement st=cn.createStatement();
				String qry="update swing set name='"+t2.getText()+"',address='"+t3.getText()+"',contact='"+t4.getText()+"' ";
				int x=st.executeUpdate(qry);
				if(x>0) 
				{
					msg.setText("Record Updated");
				}
				else
				{
					msg.setText("Record  not Updated");
				}
			} catch (Exception e1) 
			{
				e1.printStackTrace();
			}
		}
		
		
	}
}
public class DatabaseWithSwing 
{
	public static void main(String[] args)
	{
		new data();
	}
}
