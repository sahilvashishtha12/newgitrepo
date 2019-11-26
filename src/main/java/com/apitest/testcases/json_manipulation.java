package com.apitest.testcases;

import org.testng.annotations.Test;

import com.apitest.base.BaseClass;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;

public class json_manipulation extends BaseClass {
	
	@Test
	void postrestTest()
	{
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		rs=RestAssured.given();

		rs.headers("Content-Type","application/json");
		
		resp=rs.request(Method.GET,"/employees");
		JsonPath jpath=resp.jsonPath();
		
		String empid=jpath.get("[0].id");
		System.out.println(empid);
		System.out.println(resp.getBody().asString());
		
		//resp=rs.request(Method.DELETE,"/delete/"+empid);
		//System.out.println(resp.getBody().asString());
		
	//	System.out.println(resp.getBody().asString());
		 
	}
	
}
