package com.StepDefinition;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.TestRunner.FlipkartRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartStep {
	public static WebDriver driver = FlipkartRunner.driver;
	public static String phname="APPLE iPhone 14 (Purple, 128 GB)";

	@Given("user Launch the application UrL and search the product")
	public void user_launch_the_application_ur_l_and_search_the_product() {
//		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='Request OTP']//ancestor::form[@autocomplete='on']//ancestor::div[4]//parent::div//child::button[1]")).click();
		WebElement search = driver.findElement(By.xpath("//input[@autocomplete='off']"));
		search.sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> phnames = driver.findElements(By.xpath("//div[@class='_13oc-S']//descendant::div[@class='_4rR01T']"));
		for (WebElement phonenames : phnames) {
			String text = phonenames.getText();
			System.out.println(text);
			if (text.equalsIgnoreCase(phname)) {
				phonenames.click();
				
			}
			
		}

		// driver.findElement(By.)

	}

	@Given("Add product to the cart")
	public void add_product_to_the_cart() throws InterruptedException {
		String parent = driver.getWindowHandle();
		Set<String> childs= driver.getWindowHandles();
		for (String child : childs) {
			if (!parent.equals(child)) {
				driver.switchTo().window(child);
				
			}
			
		}
		Thread.sleep(2000);
	
		WebElement addtocart = driver.findElement(By.xpath("//ul[@class='row']//descendant::button[2]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",addtocart);
		
		
		addtocart.click();
		

	}

	@When("User enter the Login credentials")
	public void user_enter_the_login_credentials() {

	}

	@When("User can  enter proceed to buy")
	public void user_can_enter_proceed_to_buy() {

	}

	@When("User can enter the Delivery address of the product")
	public void user_can_enter_the_delivery_address_of_the_product() {

	}

	@Then("User place the order to cash on delivery")
	public void user_place_the_order_to_cash_on_delivery() {

	}

	@Then("cancel the product")
	public void cancel_the_product() {

	}

}
