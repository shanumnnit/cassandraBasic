/**
 * 
 */
package com.learn.cassandra.entity;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

/**
 * @author Shanu.Gupta
 *
 */
@Table("user_basic")
public class UserBasic {
	  
    @PrimaryKey("user_id")
    private long id;    
    
    @Column("user_name")
    private String username;    
    
    @Column("user_email")
    private String email;    
    
    @Column(value ="user_gender")
    private String gender;
    
    @Column(value ="user_password")
    private String password;
    
    @Column(value ="user_phone")
    private int phone;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
    
    
}
