package com.api.baseclass;

import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HTTPSMethods {
	
	private  Response doGetcall(Map<String,String>headers,String endpoints) {
	Response response = RestAssured.given().headers(headers).when().get(endpoints).then().log().all().extract().response();
	return response;
		
	}
	private void doPostCallWithBody(Map<String,String>headers,String endpoints) {
		RestAssured.given().headers(headers).body()p

	}
	private void doPostCallWithoutBody() {
		

	}
	private void doPutCallWithBody() {
		
	}
	private void doPutCallWithoutBody() {
		
	}private void doPatchCAllWithBody() {
		
	}private void doPatchCallWithoutBody() {
		
	}
	}