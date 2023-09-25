package com.test.zubair;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {
public static void main(String[] args) throws Exception {
	Map<String, String> validateBanks = validateBanks();
	System.out.println(validateBanks);
	
	
}
public static Map<String, String> validateBanks()
		throws Exception {

	

	RestTemplate rt = null;

	Map<String, String> responseMap = Collections.emptyMap();

	StringBuffer checksum = new StringBuffer();

	

	

	
		// logger.info("Concat String: " + checksum.toString());

		
		BankValidateBean bankValidateBean = new BankValidateBean();
		bankValidateBean.setRequestId(""+ Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000);
		bankValidateBean.setAccountNo("123456789");
			
		bankValidateBean
				.setIfscCode("HDFC0000001");
		ObjectMapper mapper = new ObjectMapper();
		String writeValueAsString = mapper.writeValueAsString(bankValidateBean);
		String encryptData = encryptstring(writeValueAsString,
				"oIc3jwrw2P9CPCS4xWpTVpx5uRHX6FNQm5zpyvrvVhiK4Z9a5BO7DvRswDEV9VOQeIvuLA4hDK9BB8DolMVfms6idRb6dAf7tWT4mZDStC1WgqkkKCnMSWq537UpDEa7sRMFNuXHKsWoarZ468uYHIfeXkG8ROQKVFBpKk9WmQ4yJB9qsH2nHjubDvECM0sradM3IxMSW14AMhhDRUcVEpy9Q1fIan23bYiWicqfhQH6HA9DbYwmUupKHcfoza8r");
		System.out.println(encryptData);
		Map<String, String> bankRequestedData = new HashMap<>();
		bankRequestedData.put("appid", "com.indipaisa.nsdl");
		bankRequestedData.put("channelid", "ElxvUGaBniUlBJtMWdcG");
		bankRequestedData.put("partnerid", "c377bbe133c18bab6360b3f3ed5d8f3f");
		bankRequestedData.put("servicetype", "BENEVALIMPSP2A");
		bankRequestedData.put("encdata", encryptData);
		HttpHeaders requestHeader = new HttpHeaders();
		requestHeader.setContentType(MediaType.APPLICATION_JSON);
		requestHeader.set("channelid", "ElxvUGaBniUlBJtMWdcG");
		requestHeader.set("partnerid", "c377bbe133c18bab6360b3f3ed5d8f3f");
		requestHeader.set("servicetype", "BENEVALIMPSP2A");
		requestHeader.set("requestid", "AFKSVLTB18291");
		requestHeader.set("Cookie",
				"Path=/; NL014ddb17=01e02e5d4a8a0a1b34f862d91e1d2a6a10ce7523d934aaa8443e0bba79e63ba3f632fb3175f75dda0a38801eecdfe9bd013419a49f");

		HttpEntity<?> requestEntity = new HttpEntity<>(bankRequestedData, requestHeader);
				rt = new RestTemplate();

		// logger.info("Request: " + npciRequestBean.toString());

		/*
		 * responseMap =
		 * rt.postForObject("https://jiffyuat.nsdlbank.co.in/jarvisdmt/impspennyless",
		 * requestEntity, HashMap.class);
		 */
		
	
		// logger.info("Response from NPCI : " + responseMap.toString());

	



	return responseMap;
}

public void createXmlForDL(String content, String path) throws IOException {

        
	Files.write(Paths.get(path), content.getBytes("ISO-8859-1"));
}

public static String encryptstring(String value, String password) {
    try {
           SecretKey originalKey = new SecretKeySpec(password.substring(0, 32).getBytes("UTF-8"), "AES");
           IvParameterSpec iv = new IvParameterSpec(password.substring(0, 16).getBytes("UTF-8"));
           Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
           cipher.init(Cipher.ENCRYPT_MODE, originalKey, iv);
           byte[] encrypted = cipher.doFinal(value.getBytes());
           return new String(Base64.getEncoder().encodeToString(encrypted));
    } catch (Exception ex) {
           ex.printStackTrace();
    }
    return null;
}



}
