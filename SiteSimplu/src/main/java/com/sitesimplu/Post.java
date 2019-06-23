package com.sitesimplu;

public class Post {
	private String titlu;
	private String continut;
	public String getTitlu() {
		return titlu;
	}
	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	public String getContinut() {
		return continut;
	}
	public void setContinut(String continut) {
		this.continut = continut;
	}
	public Post(String titlu, String continut) {
		super();
		this.titlu = titlu;
		this.continut = continut;
	}
	
	
}
