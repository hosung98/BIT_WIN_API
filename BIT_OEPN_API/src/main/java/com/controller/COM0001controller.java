package com.controller;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.T_IFO_MEMBERS;
import com.service.COM0001Servicelmpl;

import common.JwtTokenProvider;
import common.Utils;




/*
 * UICOM0001 - 로그인 컨트롤러 
 */

@RestController
@CrossOrigin(origins = "http://localhost:8080") 
public class COM0001controller {
	
	
	COM0001Servicelmpl com0001service;
	
	@Autowired
	public COM0001controller(COM0001Servicelmpl com0001service) {
		this.com0001service = com0001service;
	}
	
	// Server check 
	@GetMapping("/status")
	public String checkStatus() {
		return "code: 200";
	}
	
	// login check 
	@PostMapping("/login.do")
	@ResponseBody
	public Map<String, Object> loginAction(@ModelAttribute T_IFO_MEMBERS member){
		Map<String, Object> data = null;

		try {
			T_IFO_MEMBERS obj = com0001service.loginfind(member.getId(),member.getPasswd());
			//Login success!!
		    if (obj != null) {
		    	JwtTokenProvider jwt = new JwtTokenProvider();
		    	String token = jwt.createToken(obj.getId());
		    	System.out.println("token : " + token);
		    	data = Utils.sendAjax("200", "login success", obj,token);
		    //Login Error!!
		    }else {
		    	data = Utils.sendAjax("400", "login fail", null,null);
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	   return data;		
	}
}
