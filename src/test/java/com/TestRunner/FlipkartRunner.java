package com.TestRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\featurefile\\Flipkart.feature", glue = "com.StepDefinition")

public class FlipkartRunner {
	public static WebDriver driver;

	@BeforeClass
	public static void SetUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDown() {
	//	driver.quit();

	}
}