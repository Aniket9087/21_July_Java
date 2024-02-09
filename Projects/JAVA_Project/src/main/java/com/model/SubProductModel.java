package com.model;

public class SubProductModel 
{
	private int sproductid,mproductid;
	private String sproductname,content,simage,price;
	public int getSproductid() {
		return sproductid;
	}
	public void setSproductid(int sproductid) {
		this.sproductid = sproductid;
	}
	public int getMproductid() {
		return mproductid;
	}
	public void setMproductid(int mproductid) {
		this.mproductid = mproductid;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSproductname() {
		return sproductname;
	}
	public void setSproductname(String sproductname) {
		this.sproductname = sproductname;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSimage() {
		return simage;
	}
	public void setSimage(String simage) {
		this.simage = simage;
	}
}
