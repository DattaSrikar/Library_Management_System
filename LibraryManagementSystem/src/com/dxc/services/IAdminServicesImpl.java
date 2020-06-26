package com.dxc.services;

import java.util.List;

import com.dxc.dao.*;
import com.dxc.pojos.*;

public class IAdminServicesImpl implements IAdminServices
{
		IAdminDao dao = new IAdminDaoImpl();
	
		public void adminConnect()
		{
			dao.adminConnect();
		}
		
	
		public boolean authenticate(String u, String p)
		{
			return dao.authenticate(u, p);
		}
		
		public void addBook(int i, String n, String a, int q)
		{
			dao.addBook(i, n, a, q);
		}
		
		public void removeBook(int i)
		{
			dao.removeBook(i);
		}
		
		public List<Users> getListOfBooks(String s) 
		{
			return dao.getListOfBooks(s);
		}
		
		public List<Users> getBalance(String s)
		{
			return dao.getBalance(s);
		}
		
		public void deleteAcc(int i)
		{
			dao.deleteAcc(i);
		}
		public void closeConnection()
		{
			dao.closeConnection();
		}






	
}
