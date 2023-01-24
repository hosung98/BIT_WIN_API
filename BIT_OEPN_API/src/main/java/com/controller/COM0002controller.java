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
import com.service.COM0002Servicelmpl;

import common.JwtTokenProvider;
import common.Utils;




/*
 * UICOM0002 - 회원가입 컨트롤러 
 */

@RestController
@CrossOrigin(origins = "http://localhost:8080") 
public class COM0002controller {
	
	
	COM0002Servicelmpl com0002service;
	
	@Autowired
	public COM0002controller(COM0002Servicelmpl com0002service) {
		this.com0002service = com0002service;
	}
	
	// 회원가입 
	@PostMapping("/sign")
	@ResponseBody
	public Map<String, Object> loginAction(@ModelAttribute T_IFO_MEMBERS member){
		Map<String, Object> data = null;
		
		try {
			int cnt = com0002service.selectMembers(member.getId());
			
			//중복 id 오류 
			if (cnt > 0) {
				data = Utils.sendAjax("401", "duplicate id fail", null,null);
				return data;
			}
			
			//회원가입 진행 
			com0002service.insertMembers(member);
		    data = Utils.sendAjax("200", "sign up success",member,null);
		} catch (Exception e) {
			data = Utils.sendAjax("400", "sign up fail", null,null);
			e.printStackTrace();
		}
		
	   return data;		
	}
}
