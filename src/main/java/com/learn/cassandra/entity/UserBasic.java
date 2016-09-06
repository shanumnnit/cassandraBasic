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
    private int email;    
    
    @Column(value ="user_gender")
    private float gender;
    
    @Column(value ="user_password")
    private float password;
    
    @Column(value ="user_phone")
    private float phone;

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

	public int getEmail() {
		return email;
	}

	public void setEmail(int email) {
		this.email = email;
	}

	public float getGender() {
		return gender;
	}

	public void setGender(float gender) {
		this.gender = gender;
	}

	public float getPassword() {
		return password;
	}

	public void setPassword(float password) {
		this.password = password;
	}

	public float getPhone() {
		return phone;
	}

	public void setPhone(float phone) {
		this.phone = phone;
	}
    
    
}
