package com.dxc.presentation;

import java.util.*;

import com.dxc.pojos.Admin;
import com.dxc.pojos.*;
import com.dxc.services.*;

public class Test 
{
	public static void main(String[] args)
	{
		int choice,ch,ch1;
		 
		Scanner sc  = new Scanner(System.in);
		
		IAdminServices adminService = new IAdminServicesImpl();
		IUserServices  userService = new IUserServicesImpl();
		Users u1 = new Users();
		Book book = new Book();

		adminService.adminConnect(); 

		while(true)
		{
			
			System.out.println("Enter your category:");
			System.out.println("1.Admin\n2.User");
			
			switch(choice = sc.nextInt())
			{
				case 1 : 
					
							System.out.println("Enter username:");
							String username = sc.next();
							System.out.println("Enter password:");
							String password = sc.next();
							 
							boolean b = adminService.authenticate(username, password);
							if(b)
								System.out.println("Admin login successfull");
							else
								System.out.println("Incorrect login credentials");
							
						while(b)
						{
							System.out.println("Enter option:");
							System.out.println("--------------");
							
							System.out.println("1.Add Books\n2.Remove books\n3.Get list of books issued by particular user");
							System.out.println("4.Get balance amount of particular user\n5.Close (Delete) user account from library system");
							System.out.println("6.Terminate");
								switch(ch=sc.nextInt())
								{
							 		case 1:   System.out.println("Enter-Bookid,bookname,author,quantity:"); 
											  adminService.addBook(sc.nextInt(),sc.next(), sc.next(), sc.nextInt());
											  System.out.println();
											  break;
												
									case 2: System.out.println("Enter book id to remove:");
										    adminService.removeBook(sc.nextInt());
											System.out.println();
										    break;			    
										    
									case 3:
											System.out.println("Enter username to get details:");
											List<Users> list= adminService.getListOfBooks(sc.next());
										     for(Users u:list)
										     {
										    	 u.display();
										     }
											 System.out.println();
										     break;		    
										     
									case 4 :
											System.out.println("Enter username to get balance:");
											 List<Users> l = adminService.getBalance(sc.next());
											 for(Users u:l)
										     {
										    	 u.show();
										     }
											 System.out.println();
											 break;
											 
									case 5 : System.out.println("Enter userid to delete account:");
										     adminService.deleteAcc(sc.nextInt());
										     System.out.println();
										     break;
										  
									case 6 : adminService.closeConnection();
									System.out.println("Connection disconnected");
									System.exit(0);
									
									
								}
						}
						
						break;
						
				case 2:  userService.userConnect();
						System.out.println("Enter username:");
						String uName = sc.next();
						System.out.println("Enter password:");
						String uPassword = sc.next();
						 
						   boolean b1 = userService.authenticate(uName,uPassword);
						   if(b1)
							   System.out.println("User login successfull!!");
						   else
							   System.out.println("Invalid login credentails");
							while(b1)
							{
								System.out.println("Enter option:");
								System.out.println("--------------");
								
								System.out.println("1.Issue books from library\n2.Get list of books by particular author");
								System.out.println("3.Check available balance in library account");
								System.out.println("4.Terminate");
								
									switch(ch1=sc.nextInt())
									{
									  case 1 :
										       userService.issueBook();
										       System.out.println();
										       break;
										       
									  case 2:  System.out.println("Enter author name:");
									  		   List<Book> l1 = userService.getBookList(sc.next());
									  		   for(Book bo:l1)
									  		   {
									  			  bo.show();
									  		   }
									  		   System.out.println();
									  		   break;
									  		   
									  case 3:   System.out.println("Enter username to get balance:");
									  			userService.getUserBalance(sc.next());
									  			System.out.println();
									  			break;
									  			
									  
									  		
									  case 4 : userService.closeConnection();
									           System.out.println("Connection disconnected");
									           System.exit(0);									  
									}
								
								
							}
							
				default: System.out.println("Choose correct option");
				break;
						
				
			
						
			
			}
			
		}
	}
}
		