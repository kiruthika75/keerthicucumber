package com.TestRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\featurefile\\amazon.feature",
glue="com.StepDefinition.FlipkartStep.java")
public class AmazonRunner {
	
	public static WebDriver driver = null;
	
	@BeforeClass
	public static void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	@AfterClass
	public static void tearDown() {
		driver.close();

	}

}
