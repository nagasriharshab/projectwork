package com.abc.healthcare.model;

import java.time.LocalDate;


public class News {
	private String newsHeader;
	
	private String newsBody;
	
	private String newsContact;
	
	private LocalDate newsDate;

	private int adminId;

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getNewsHeader() {
		return newsHeader;
	}

	public void setNewsHeader(String newsHeader) {
		this.newsHeader = newsHeader;
	}

	public String getNewsBody() {
		return newsBody;
	}

	public void setNewsBody(String newsBody) {
		this.newsBody = newsBody;
	}

	public String getNewsContact() {
		return newsContact;
	}

	public void setNewsContact(String newsContact) {
		this.newsContact = newsContact;
	}

	public LocalDate getNewsDate() {
		return newsDate;
	}

	public void setNewsDate(LocalDate newsDate) {
		this.newsDate = newsDate;
	}

}
