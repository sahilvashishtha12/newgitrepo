package com.apitest.testcases;

import com.apitest.pojo.Components;
import com.apitest.pojo.Fields;
import com.apitest.pojo.Payload;
import com.apitest.pojo.userifo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ObjectMaptest {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		
		Components comp = new Components("India`", "Delhi");
		userifo uinfo = new userifo(25);
		Payload payload = new Payload("Male", 27, comp, uinfo);
		Fields fields =new Fields(payload);
		
	ObjectMapper obm= new ObjectMapper();
	String fullpayload =obm.writerWithDefaultPrettyPrinter().writeValueAsString(fields);
	
	System.out.println(fullpayload);
	

	}

}
