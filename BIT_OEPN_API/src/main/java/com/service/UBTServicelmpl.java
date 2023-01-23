package com.service;
import java.io.IOException;
import java.util.UUID;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.dto.T_IFO_APIKEY;
import com.mapper.UBTMAP0001;

/*
 *  login 기능을 담당하는 service
 */

@Service
public class UBTServicelmpl {
    
    
	UBTMAP0001 mappers;
	
    @Autowired
    public UBTServicelmpl(UBTMAP0001 mappers) {
		this.mappers = mappers;
	}

    
	public String getApikey(String memberId, String divCode) throws Exception {
		
		T_IFO_APIKEY apikey = mappers.getApikey(memberId, divCode);
		
		
        String accessKey = apikey.getACCESS_KEY();
        String secretKey = apikey.getSECRET_KEY();
        String serverUrl = "https://api.upbit.com";
        
        
        Algorithm algorithm = Algorithm.HMAC256(secretKey);
        String jwtToken = JWT.create()
                .withClaim("access_key", accessKey)
                .withClaim("nonce", UUID.randomUUID().toString())
                .sign(algorithm);

        String authenticationToken = "Bearer " + jwtToken;
        try {
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet(serverUrl + "/v1/accounts");
            request.setHeader("Content-Type", "application/json");
            request.addHeader("Authorization", authenticationToken);

            HttpResponse response = client.execute(request);
            HttpEntity entity = response.getEntity();

            String json = EntityUtils.toString(entity, "UTF-8");
            json = json.replace("[", "").replace("]", "");
            return json;
        } catch (IOException e) {
            e.printStackTrace();
        }
		return null;
	}
	
}
