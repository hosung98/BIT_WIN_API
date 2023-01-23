package com.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/*
 * T_IFO_MEMBERS(회원정보)
 */

@ToString
public class T_IFO_MEMBERS {
	public String ID;
	public String PASSWD;
	public String PHONE;
	public String NAME;
	public String ADDRESS;
	public String ACCESS_KEY;
	public String SECRET_KEY;
	public String ACCESS_IP;
	public String ENDDATE;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPASSWD() {
		return PASSWD;
	}
	public void setPASSWD(String pASSWD) {
		PASSWD = pASSWD;
	}
	public String getPHONE() {
		return PHONE;
	}
	public void setPHONE(String pHONE) {
		PHONE = pHONE;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
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
