package com.dxc.pojos;

public class Book 
{
	private int bId;
	private String bName;
	private String  bAuthor;
	private int bQuantity;
	
	public Book() {}

	public Book(int bId, String bName, String bAuthor, int bQuantity) 
	{
		this.bId = bId;
		this.bName = bName;
		this.bAuthor = bAuthor;
		this.bQuantity = bQuantity;
	}
	
	public Book(int bId, String bName,String bAuthor) 
	{
		this.bId = bId;
		this.bName = bName;
		this.bAuthor = bAuthor;
	}
	
	

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbAuthor() {
		return bAuthor;
	}

	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}

	public int getbQuantity() {
		return bQuantity;
	}

	public void setbQuantity(int bQuantity) {
		this.bQuantity = bQuantity;
	}
	
	public void display()
	{
		System.out.println(bId+"  "+bName+"  "+bAuthor+"  "+bQuantity);
	}
	
	public void show()
	{
		System.out.println(bId+"\t"+bName+"\t\t"+bAuthor);
	}
    
	
	
}
