package com.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/*
 * T_IFO_MEMBERS(회원정보)
 */


@ToString
@Getter
@Setter
public class T_IFO_MEMBERS {
	public String id;
	public String passwd;
	public String phone;
	public String name;
	public String address;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
