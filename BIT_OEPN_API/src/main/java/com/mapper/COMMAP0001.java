package com.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.dto.T_IFO_MEMBERS;

/*
 *  login 기능을 담당하는 mapper
 */

@Mapper
public interface COMMAP0001 {
	
	T_IFO_MEMBERS loginfind(String id, String passwd) throws Exception;
	
}


