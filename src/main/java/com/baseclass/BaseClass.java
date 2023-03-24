package com.baseclass;

import org.openqa.selenium.WebElement;

public class BaseClass {
	 public static  void inputValue( WebElement element,String value) {
		 element.sendKeys(value);
	}
	 
	 public void clickOnElement(WebElement element) {
		  element.click();
		    }
	 
	 public static void cleartext(WebElement element) {
		 element.clear();
		 }
	 public static void sendkeys(WebElement element,String value) {
		 element.sendKeys(value);
	 }
	 public static void ElementPresent(WebElement element) {
		 boolean display = element.isDisplayed();
		 System.out.println(display);
		}
	 public static void isSelected(WebElement element) {
		 boolean select = element.isSelected();
		 System.out.println("check whether it is selected or not"+select);
	 }
	 public static void isEnabled(WebElement element) {
		 boolean enabled = element.isEnabled();
		 System.out.println("check whether it is enabled or not"+enabled);
		
	}
	 public static void navigateTo  (WebElement element,String value) {
		 String attribute = element.getAttribute(value);
		 System.out.println(attribute);
		
	}
	 public static void getplaceholder (WebElement element,String value) {
	 }
		 
		
	 }
	 
		

	


