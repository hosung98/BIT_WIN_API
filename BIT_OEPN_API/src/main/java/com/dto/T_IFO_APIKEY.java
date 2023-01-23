package com.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/*
 * T_IFO_APIKEY(OPEN API KEY 정)
 */

@ToString
@Getter
@Setter
public class T_IFO_APIKEY {
	public String ACCESS_KEY;
	public String SECRET_KEY;
	public String ACCESS_IP;
	public String ENDDATE;
	public String getACCESS_KEY() {
		return ACCESS_KEY;
	}
	public void setACCESS_KEY(String aCCESS_KEY) {
		ACCESS_KEY = aCCESS_KEY;
	}
	public String getSECRET_KEY() {
		return SECRET_KEY;
	}
	public void setSECRET_KEY(String sECRET_KEY) {
		SECRET_KEY = sECRET_KEY;
	}
	public String getACCESS_IP() {
		return ACCESS_IP;
	}
	public void setACCESS_IP(String aCCESS_IP) {
		ACCESS_IP = aCCESS_IP;
	}
	public String getENDDATE() {
		return ENDDATE;
	}
	public void setENDDATE(String eNDDATE) {
		ENDDATE = eNDDATE;
	}
	
	
}
