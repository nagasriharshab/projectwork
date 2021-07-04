package com.abc.healthcare.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "news_table")
public class NewsEntity {

	@Id
	@Column(name="header")
	private String newsHeader;
	
	@Column(name="body")
	private String newsBody;
	
	@Column(name="contact")
	private String newsContact;
	
	@Column(name="date")
	private LocalDate newsDate;
	
	@ManyToOne
	@JoinColumn(name="admin_id")
	private AdminEntity admin;

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

	public AdminEntity getAdmin() {
		return admin;
	}

	public void setAdmin(AdminEntity admin) {
		this.admin = admin;
	}
	
}
