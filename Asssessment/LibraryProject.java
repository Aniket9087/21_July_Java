package com.logic;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class library
{
	ArrayList<String> books=new ArrayList<String>();
	int choice = 0;
	Scanner sc=new Scanner(System.in);
	public void displaymenu()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Main Menu");
		System.out.println();
		System.out.println("1. Add Books");
		System.out.println("2. Delete Books");
		System.out.println("3. Search Books");
		System.out.println("4. View Book List");
		System.out.println("5. Edit Book Record");
		System.out.println("6. Change Password");
		System.out.println("7. Close Application");
	}
	public void addbooks()
	{
			System.out.println("Categories: ");
			System.out.println();
			System.out.println("1. Computer");
			System.out.println("2. Electronics");
			System.out.println("3. Electrical");
			System.out.println("4. Civil");
			System.out.println("5. Mechanical");
			System.out.println("6. Architecture");
			System.out.println("7. Back to Main Menu");
			System.out.println();
			System.out.println("Enter Category: ");
			int category=sc.nextInt();
			sc.nextLine();
			int id=0;
			
			if(category==1)
			{
				System.out.println("Category: Computer");
				System.out.println("Book ID: 1");
				System.out.println("Enter the Book Name: ");
				String book=sc.nextLine();
				System.out.println("Enter the Author Name: ");
				String name=sc.nextLine();
				System.out.println("Enter the Quantity: ");
				int qty=sc.nextInt();
				System.out.println("Enter the Price: ");
				double price=sc.nextDouble();
				books.add(book);
				id=1;
			}
			else if(category==2)
			{
				System.out.println("Category: Electronics");
				System.out.println("Book ID: 2");
				System.out.println("Enter the Book Name: ");
				String book=sc.nextLine();
				System.out.println("Enter the Author Name: ");
				String name=sc.nextLine();
				System.out.println("Enter the Quantity: ");
				int qty=sc.nextInt();
				System.out.println("Enter the Price: ");
				double price=sc.nextDouble();
				books.add(book);
				id=2;
				
			}
			else if(category==3)
			{
				System.out.println("Category: Electrical");
				System.out.println("Book ID: 3");
				System.out.println("Enter the Book Name: "); 
				String book=sc.nextLine();
				System.out.println("Enter the Author Name: ");
				String name=sc.nextLine();
				System.out.println("Enter the Quantity: ");
				int qty=sc.nextInt();
				System.out.println("Enter the Price: ");
				double price=sc.nextDouble();
				books.add(book);
				id=3;
			}
			else if(category==4)
			{
				System.out.println("Category: Civil");
				System.out.println("Book ID: 4");
				System.out.println("Enter the Book Name: ");
				String book=sc.nextLine();
				System.out.println("Enter Author Name: ");
				String name=sc.nextLine();
				System.out.println("Enter the Quantity: ");
				int qty=sc.nextInt();
				System.out.println("Enter the Price: ");
				double price=sc.nextDouble();
				books.add(book);
				id=4;
			}
			else if(category==5)
			{
				System.out.println("Category: Mechanical");
				System.out.println("Book ID: 5");
				System.out.println("Enter the Book Name: ");
				String book=sc.nextLine();
				System.out.println("Enter the Author Name: ");
				String name=sc.nextLine();
				System.out.println("Enter the Quantity: ");
				int qty=sc.nextInt();
				System.out.println("Enter the Price: ");
				double price=sc.nextDouble();
				books.add(book);
				id=5;
			}
			else if(category==6)
			{
				System.out.println("Category: Architecture");
				System.out.println("Book ID: 6");
				System.out.println("Enter the Book Name: ");
				String book=sc.nextLine();
				System.out.println("Enter the Author Name: ");
				String name=sc.nextLine();
				System.out.println("Enter the Quantity: ");
				int qty=sc.nextInt();
				
				System.out.println("Enter the Price: ");
				double price=sc.nextDouble();
				books.add(book);
				id=6;
			}
			else if(category==7)
			{
				displaymenu();
			}
			else 
			{
				System.out.println("invalid value");
			}
			System.out.println();
			String name=sc.nextLine();
			
			books.add(name);
			
			System.out.println("Books Added Successfully....");	
			System.out.println();
	}
	public void deletebooks()
	{
		System.out.println(books);
		System.out.println();
		System.out.println("Enter the Book ID to Delete: ");
		Scanner sc1=new Scanner(System.in);
		int book1=sc.nextInt();
		book1=book1-1;
		books.remove(book1);
		
		System.out.println("Book Deleted Successfully...");
		
		System.out.println();
	}
		public void searchbooks()
		{
			Scanner scc=new Scanner(System.in);
			Scanner scc2=new Scanner(System.in);
			
			System.out.println("How do You Want to Search Book..?  By ID Or By Name..?");
			System.out.println("1. By ID");
			System.out.println("2. By Enter the Name");
			int search=scc.nextInt();
			
			if(search==1)
			{
				System.out.println("Enter the book Id: ");
				String bookid=sc.nextLine();
				if(bookid==bookid)
				{
					System.out.println("Book Founded..");
					System.out.println(books);
				}
				else
				{
					System.out.println("Book Not Found..");
				}
				
			}
			else if(search==2)
			{
				System.out.println("Enter the Book Name: ");
				String bookname=sc.nextLine();
				if(bookname==bookname)
				{
					System.out.println("Book Founded..");
					System.out.println(books);
				}
				else
				{
					System.out.println("Book Not Found..");
				}
			}
			else
			{
				System.out.println("Invalid value..");
			}
		}
	
		public void viewbook()
		{
			System.out.println(books);
			System.out.println();
		}
		public void editbook()
		{
			System.out.println("Enter the Book name to Edit: ");
			String oldbookname=sc.nextLine();
			
			System.out.println("Enter the New book Name: ");
			String newbookname=sc.nextLine();
			
			int i = 0;
			books.indexOf(oldbookname);
			if(i !=-1)
			{
				books.set(i, newbookname);
				
				System.out.println("Book Record Updated Successfully...");
			}
			else
			{
				System.out.println("Book not Found...");
			}
			System.out.println();
		}
}		
public class LibraryProject
{
	 
	public static void main(String[] args) 
	{
		int password,choice;
		Scanner sc=new Scanner(System.in);
		library lg=new library();
		System.out.println("Enter Password..");
		password=sc.nextInt();
		System.out.println("Your Password Save Successfully");
		
		System.out.println();
		System.out.println("Enter password for entry...");
		int enteredpassword=sc.nextInt();
		
		if(password==enteredpassword)
		{
			System.out.println("......Welcome to the Library Management System......");
			System.out.println();
			boolean BB=true;
			while (BB) 
			{
				
				lg.displaymenu();
				System.out.println();
				System.out.println("Enter Your Choice..");
				choice=sc.nextInt();
				if(choice==1)
				{
					lg.addbooks();
				}
				else if(choice==2)
				{
					lg.deletebooks();
				}
				else if(choice==3)
				{
					lg.searchbooks();
				}
				else if(choice==4)
				{
					lg.viewbook();
				}
				else if(choice==5)
				{
					lg.editbook();
				}
				else if(choice==6)
				{
					Scanner se=new Scanner(System.in);
//					
					
					System.out.println("Enter Old Password: ");
					int oldpassword=se.nextInt();
						if(oldpassword==password)
						{	
							System.out.println("Enter the New Password: ");
							int newpassword=se.nextInt();
							System.out.println("Password Successfully Changed...");
							
							System.out.println();			
						}
						else
						{
							System.out.println("Incorrect Password..!");
						}
				}
				else if(choice==7)
				{
					try 
					{
						Thread.sleep(30000);
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
					System.out.println("Thanks For Visit...");
					BB=false;
				}
			}					
		}
		else
		{
			System.out.println("Incorrect Password....");
		}
	}
}
