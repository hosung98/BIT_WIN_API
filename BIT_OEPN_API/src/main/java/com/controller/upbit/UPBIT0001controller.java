package com.controller.upbit;

import com.service.upbit.UPBITServicelmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
@CrossOrigin(origins = "http://localhost:8080") // 컨트롤러에서 설정
public class UPBIT0001controller {
	
	
	UPBITServicelmpl upbitservice;
	
	@Autowired
	public UPBIT0001controller(UPBITServicelmpl upbitservice) {
		this.upbitservice = upbitservice;
	}
	
	/*
	 * 전체 계좌를 조회하는 api
	 */
	
	@RequestMapping(value="/search", method=RequestMethod.GET)
    public String accountList(@RequestParam("id") String id,@RequestParam("div") String div) {
		String msg = null;
		try {
			msg = upbitservice.getApikey(id, div);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
    }

}
