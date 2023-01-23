package com.service.com;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.T_IFO_MEMBERS;
import com.mapper.com.COMMAP0001;

/*
 *  login 기능을 담당하는 service
 */

@Service
public class COM0001Servicelmpl {

    COMMAP0001 mappers;
    
    
    @Autowired
    public COM0001Servicelmpl(COMMAP0001 mappers) {
		this.mappers = mappers;
	}

    
	public T_IFO_MEMBERS loginfind(String id, String passwd) throws Exception {
		return mappers.loginfind(id, passwd);
	}
	
}
