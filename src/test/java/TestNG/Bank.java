package TestNG;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bank {


	@org.testng.annotations.BeforeClass
	
	
	
	private void Age() {
		
		System.out.println("Age - 18<");


	}
	
	@Test(priority = 1)
	private void createAccount() {
		System.out.println("Account Create");

	}
	@Test(priority = 2)
	private void Deposite() {
		System.out.println("Deposite 500/-");

	}
	@Test(priority = 3)
	private void getPassBook() {
		System.out.println("Account Create");

	}
	@Test(priority = 4)
	private void applyATM() {
		System.out.println("Apply ATM");

	}
	@Test(priority = 5)

	private void Withdraw() {
		System.out.println("Apply ATM");

	}
	
	
	
//
//	@BeforeSuite
//			@BeforeTest
//						@BeforeClass
//						
//						///browser
//								@BeforeMethod
//									@Test
//								System.out.println("Apply ATM");
//
//									@Test
//								@AfterMethod
//								
//								
//						@AfterClass
//						//screenshot
//						
//			@AfterTest
//		@AfterSuite
//		
//		
		
	 

}
