package com.dxc.pojos;

public class Users 
{
	private String uName;
	private int uId;
	private String uPassword;
	private String uBookIssued;
	private int uBalance;
	private int days;
	
	public Users() {}

	
	public Users(String uName, int uId, String uBookIssued, int uBalance, int days)
	{
		super();
		this.uName = uName;
		this.uId = uId;
		this.uBookIssued = uBookIssued;
		this.uBalance = uBalance;
		this.days = days;
	}
	
	


	public Users(String uName, String uBookIssued) {
		super();
		this.uName = uName;
		this.uBookIssued = uBookIssued;
	}
	
	public Users(String uName, int uBalance) {
		super();
		this.uName = uName;
		this.uBalance = uBalance;
	}


	public String getuName() {
		return uName;
	}


	public void setuName(String uName) {
		this.uName = uName;
	}


	public int getuId() {
		return uId;
	}


	public void setuId(int uId) {
		this.uId = uId;
	}


	public String getuPassword() {
		return uPassword;
	}


	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}


	public String getuBookIssued() {
		return uBookIssued;
	}


	public void setuBookIssued(String uBookIssued) {
		this.uBookIssued = uBookIssued;
	}


	public int getuBalance() {
		return uBalance;
	}


	public void setuBalance(int uBalance) {
		this.uBalance = uBalance;
	}


	public int getDays() {
		return days;
	}


	public void setDays(int days) {
		this.days = days;
	}


	public void display()
	{
		System.out.println(uName+"\t\t"+uBookIssued);
	}
	
	public void show()
	{
		System.out.println(uName+"\t\t"+uBalance);
	}
	
}
