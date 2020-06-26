package com.dxc.services;

import java.util.List;

import com.dxc.dao.IUserDao;
import com.dxc.dao.IUserDaoImpl;
import com.dxc.pojos.Book;

public class IUserServicesImpl implements IUserServices
{
	IUserDao udao = new IUserDaoImpl();
	
	public void userConnect()
	{
		udao.userConnect();
	}
	
	public boolean authenticate(String uName,String uPassword)
	{
		return udao.authenticate(uName, uPassword);
	}
	
	public void issueBook()
	{
		udao.issueBook();
	}
	
	public List<Book> getBookList(String s)
	{
		return udao.getBookList(s);
	}
	public void getUserBalance(String s)
	{
		udao.getUserBalance(s);
	}
	public void closeConnection()
	{
		udao.closeConnection();
	}


}
