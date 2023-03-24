package com.RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Rest_Api {
	
		public static void SingleUser() {
			RestAssured.baseURI="https://reqres.in/";
			Response response = RestAssured.given().when().get("api/users/2").then().log().all().extract().response();
			int statusCode = response.getStatusCode();
			System.out.println("The Status code is"+ statusCode );
			String a = response.asPrettyString();
			System.out.println("The response is"+a);
			
		}
		public static void ListUser() {
			RestAssured.baseURI="https://reqres.in/";
			Response response = RestAssured.given().when().get("api/users?page=2").then().log().all().extract().response();
			int statusCode1 = response.getStatusCode();
			System.out.println("The Status code is "+statusCode1);
			String b = response.asPrettyString();
			System.out.println("The response is"+b);

		}
		public static void SingleUserNotFound() {//https://reqres.in/api/users/23
			RestAssured.baseURI="https://reqres.in/";
			Response response = RestAssured.given().when().get("api/users/23").then().log().all().extract().response();
			int statusCode2 = response.getStatusCode();
			System.out.println("The Status code is "+statusCode2);
			String c = response.asPrettyString();
			System.out.println("The response is"+c);


		}
		public static void ListResource() {
			RestAssured.baseURI="https://reqres.in/";
			Response response = RestAssured.given().when().get("api/unknown").then().log().all().extract().response();
			int statusCode3 = response.getStatusCode();
			System.out.println("The Status code is "+statusCode3);
			String d = response.asPrettyString();
			System.out.println("The response is"+d);


		}
		public static void SingleResource() {
			RestAssured.baseURI="https://reqres.in/";
			Response response = RestAssured.given().when().get("api/unknown/2").then().log().all().extract().response();
			int statusCode4 = response.getStatusCode();
			System.out.println("The Status code is "+statusCode4);
			String e = response.asPrettyString();
			System.out.println("The response is"+e);



		}
		public static void SingleResourceNotFound() {
			RestAssured.baseURI="https://reqres.in/";
			Response response = RestAssured.given().when().get("api/unknown/2").then().log().all().extract().response();
			int statusCode4 = response.getStatusCode();
			System.out.println("The Status code is "+statusCode4);
			String f = response.asPrettyString();
			System.out.println("The response is"+f);
		}
			public static void DelayedResponse() {
				RestAssured.baseURI="https://reqres.in/";
				Response response = RestAssured.given().when().get("api/users?delay=3").then().log().all().extract().response();
				int statusCode5 = response.getStatusCode();
				System.out.println("The Status code is "+statusCode5);
				String g = response.asPrettyString();
				System.out.println("The response is"+g);

			}
			public static void create() {
				RestAssured.baseURI="https://reqres.in/";
				Response response = RestAssured.given().body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"leader\"\r\n"
						+ "}").when().post("api/users").then().log().all().extract().response();
				int statusCode6 = response.getStatusCode();
				System.out.println("The Status code is "+statusCode6);
				String h = response.asPrettyString();
				System.out.println("The response is"+h);

			}
			public static void UpdatePut() {
				RestAssured.baseURI="https://reqres.in/";
				Response response = RestAssured.given().body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"zion resident\"\r\n"
						+ "}").when().post("api/users/2").then().log().all().extract().response();
				int statusCode7 = response.getStatusCode();
				System.out.println("The Status code is "+statusCode7);
				String i = response.asPrettyString();
				System.out.println("The response is"+ i);
			}
			public static void UpdatePatch() {
				RestAssured.baseURI="https://reqres.in/";
				Response response = RestAssured.given().body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"zion resident\"\r\n"
						+ "}").post("api/users/2").then().log().all().extract().response();
				int statusCode8 = response.getStatusCode();
				System.out.println("The Status code is "+statusCode8);
				String i = response.asPrettyString();
				System.out.println("The response is"+ i);
			}
			
			

			public static void registerSuccessful() {

				RestAssured.baseURI = "https://reqres.in/";

				Response response4 = RestAssured.given()
						.body("{\r\n" + "    \"email\": \"eve.holt@reqres.in\",\r\n" + "    \"password\": \"pistol\"\r\n" + "}")
						.when().post("api/register").then().log().all().extract().response();

				int statusCode4 = response4.getStatusCode();

				System.out.println("the status code is " + statusCode4);
				String sPrettyString4 = response4.asPrettyString();

				System.out.println("the response is " + sPrettyString4);

			}

			public static void registerUnsuccessful() {
				RestAssured.baseURI = "https://reqres.in/";

				Response response5 = RestAssured.given().body("{\r\n" + "    \"email\": \"sydney@fife\"\r\n" + "}").when()
						.post("api/register").then().log().all().extract().response();

				int statusCode5 = response5.getStatusCode();

				System.out.println("the status code is " + statusCode5);
				String sPrettyString5 = response5.asPrettyString();

				System.out.println("the response is " + sPrettyString5);

			}

			public static void delete() {
				RestAssured.baseURI = "https://reqres.in/";
				Response response6 = RestAssured.given().when().get("api/users/2").then().log().all().extract().response();
				int statusCode6 = response6.getStatusCode();
				System.out.println("the status code is " + statusCode6);
				String asPrettyString6 = response6.asPrettyString();

				System.out.println("the response is " + asPrettyString6);

			}

			public static void loginSuccessful() {

				RestAssured.baseURI = "https://reqres.in/";

				Response response7 = RestAssured
						.given().body("{\r\n" + "    \"email\": \"eve.holt@reqres.in\",\r\n"
								+ "    \"password\": \"cityslicka\"\r\n" + "}")
						.when().post("api/login").then().log().all().extract().response();

				int statusCode7 = response7.getStatusCode();

				System.out.println("the status code is " + statusCode7);
				String sPrettyString7 = response7.asPrettyString();

				System.out.println("the response is " + sPrettyString7);

			}

			public static void loginUnSuccessful() {

				RestAssured.baseURI = "https://reqres.in/";

				Response response8 = RestAssured.given().body("{\r\n" + "    \"email\": \"peter@klaven\"\r\n" + "}").when()
						.post("api/login").then().log().all().extract().response();

				int statusCode8 = response8.getStatusCode();

				System.out.println("the status code is " + statusCode8);
				String sPrettyString8 = response8.asPrettyString();

				System.out.println("the response is " + sPrettyString8);

			}
			

		
		
		
		public static void main(String[] args) {
			SingleUser();
			ListUser();
			SingleUser();
			SingleResource();
			ListUser();
			SingleResourceNotFound();
			DelayedResponse();
			create();
			UpdatePut();
			UpdatePatch();
			registerSuccessful();
			registerUnsuccessful();
			delete();
			loginSuccessful();
			loginUnSuccessful();

			
			
			
		}
		
	}
//registerUnsuccessful();
//delete();
//loginSuccessful();
//loginUnSuccessful();


