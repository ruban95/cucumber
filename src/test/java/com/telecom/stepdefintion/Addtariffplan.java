package com.telecom.stepdefintion;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Addtariffplan {
	static WebDriver driver;
	@Given("user launches the appplication")
	public void user_launches_the_appplication() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.demo.guru99.com/telecom/");
	   	}

	@Given("user selected add datatarif option")
	public void user_selected_add_datatarif_option() {
		driver.findElement(By.xpath("(//a[contains(text(),'Add Tariff Plan')])[2]")).click();
		
	  
	}

	@When("user need to fill up the plan details{string},{string},{string},{string},{string},{string},{string}")
	public void user_need_to_fill_up_the_plan_details(String MR, String FLM, String FIM , String FSP , String LPMC , String IMPC , String SPC ) {
		driver.findElement(By.id("rentall")).sendKeys(MR);
		driver.findElement(By.id("local_minutes")).sendKeys(FLM);
		driver.findElement(By.id("inter_minutes")).sendKeys(FIM);
		driver.findElement(By.id("sms_pack")).sendKeys(FSP);
		driver.findElement(By.id("minutes_charges")).sendKeys(LPMC);
		driver.findElement(By.id("inter_charges")).sendKeys(IMPC);
		driver.findElement(By.id("sms_charges")).sendKeys(SPC);
		
		
		
	    
	}

	@When("user select submit")
	public void user_select_submit() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	   
	}

	@Then("user verifys congratulation message")
	public void user_verifys_congratulation_message() {
	String text = driver.findElement(By.xpath("//h2[contains(text(),'Congratulation you add Tariff Plan')]")).getText();
	Assert.assertEquals("//h2[contains(text(),'Congratulation you add Tariff Plan')]",text);
	driver.close();
	   
	}


}
