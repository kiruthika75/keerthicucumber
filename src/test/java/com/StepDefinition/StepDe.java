package com.StepDefinition;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.TestRunner.AmazonRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDe {

	public static WebDriver driver = AmazonRunner.driver;
	

	@Given("search the music in dropdown")
	public void search_the_music_in_dropdown() {
	  
		
	}
	@Then("enter the cd in search box")
	public void enter_the_cd_in_search_box() {
	    
		
	}
	@Then("choose the cd from list")
	public void choose_the_cd_from_list() {
	  
	}



	
}
