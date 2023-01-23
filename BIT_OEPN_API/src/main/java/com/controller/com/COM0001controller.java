package com.controller.com;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dto.T_IFO_MEMBERS;
import com.service.com.COM0001Servicelmpl;

import common.Utils;



/*
 *  login 기능을 담당하는 컨트롤러 
 */

@RestController
@CrossOrigin(origins = "http://localhost:8080") // 컨트롤러에서 설정
public class COM0001controller {
	
	
	COM0001Servicelmpl com0001service;
	
	@Autowired
	public COM0001controller(COM0001Servicelmpl com0001service) {
		this.com0001service = com0001service;
	}
	
	// Server 통신 체크 
	@RequestMapping(value="/status", method=RequestMethod.GET)
	public String checkStatus() {
		return "code: 200";
	}
	
	
	// 로그인 조회 
	@RequestMapping(value="/find", method=RequestMethod.GET)
	public Map<String, Object> loginAction(@RequestParam("id") String id, @RequestParam("passwd") String passwd){
		Map<String, Object> data = null;
		try {
			T_IFO_MEMBERS obj = com0001service.loginfind(id,passwd);
		    //Login success!!
		    if (obj != null) {
		    	System.out.println("login success");
		    	data = Utils.sendAjax("200", "login success", obj);
		    //Login Error!!
		    }else {
		    	System.out.println("login error");
		    	data = Utils.sendAjax("400", "login fail", null);
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}
	   return data;		
	}
}
