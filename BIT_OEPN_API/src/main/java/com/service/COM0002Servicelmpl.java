package com.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.T_IFO_MEMBERS;
import com.mapper.COMMAP0001;
import com.mapper.COMMAP0002;

/*
 *  회원가입 기능을 담당하는 service
 */

@Service
public class COM0002Servicelmpl {

    COMMAP0002 mappers;
    
    
    @Autowired
    public COM0002Servicelmpl(COMMAP0002 mappers) {
		this.mappers = mappers;
	}

	public void insertMembers(T_IFO_MEMBERS members) throws Exception {
		mappers.insertMembers(members);
	}
	
	public int selectMembers(String id) throws Exception{
		return mappers.selectMembers(id);
	}
	
}
