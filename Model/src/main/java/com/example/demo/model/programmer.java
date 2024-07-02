package com.example.demo.model;

public class programmer {
	
	private int pId;
	private String pName;
	private String pLang;
	
	public programmer() {
		super();
	}

	public programmer(int pId, String pName, String pLang) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pLang = pLang;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpLang() {
		return pLang;
	}

	public void setpLang(String pLang) {
		this.pLang = pLang;
	}

	@Override
	public String toString() {
		return "programmer [pId=" + pId + ", pName=" + pName + ", pLang=" + pLang + "]";
	}
	
}
