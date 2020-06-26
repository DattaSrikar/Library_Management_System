package com.dxc.pojos;

public class Admin 
{
	private int bId;
	private String bName;
	private String bAuthor;
	private int bQuantity;
	private String bStatus;
	
	public Admin() {}
	

	public Admin(int bId, String bName, String bAuthor, int bQuantity, String bStatus) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.bAuthor = bAuthor;
		this.bQuantity = bQuantity;
		this.bStatus = bStatus;
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


	public String getbStatus() {
		return bStatus;
	}


	public void setbStatus(String bStatus) {
		this.bStatus = bStatus;
	}
	

}
