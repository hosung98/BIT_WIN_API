package com.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.dto.T_IFO_MEMBERS;

/*
 *  회원가입 기능을 담당하는 mapper
 */

@Mapper
public interface COMMAP0002 {
	
	void insertMembers(T_IFO_MEMBERS members) throws Exception;
	
}


