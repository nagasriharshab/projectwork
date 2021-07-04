package com.abc.healthcare.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "admin_table")
public class AdminEntity {
	@Id
	@Column(name="admin_id")
	private int adminId;
	
	@Column(name="name")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@OneToMany(mappedBy="admin",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<NewsEntity> news;
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
