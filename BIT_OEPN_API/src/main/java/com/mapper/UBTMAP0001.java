package com.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.dto.T_IFO_APIKEY;

/*
 *  로그인 한 사람의 업비트 계좌정보 조회 
 */

@Mapper
public interface UBTMAP0001 {
	
    T_IFO_APIKEY getApikey(String membersId, String divCode) throws Exception;
}


