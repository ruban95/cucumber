package com.telecom.stepdefintion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Addcustmersteps {
	static WebDriver driver;
	@Given("user launches telecom application")
	
	public void user_launches_telecom_application() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.demo.guru99.com/telecom/");
		driver.manage().window().maximize();
		
	    
	}

	@Given("user click on add customer option")
	public void user_click_on_add_customer_option() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		
	    
	}

	@When("user need to fill up all the fields")
	public void user_need_to_fill_up_all_the_fields() {
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys("ruban");
		driver.findElement(By.id("lname")).sendKeys("kumar");
		driver.findElement(By.id("email")).sendKeys("rubankumar95@gmail.com");
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("thiruvallur");
		driver.findElement(By.id("telephoneno")).sendKeys("9176284382");
		
		
	    
	}

	@When("user click on submit")
	public void user_click_on_submit() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	   
	}

	@Then("user verifys the custemer id is generated")
	public void user_verifys_the_custemer_id_is_generated() {
		String text = driver.findElement(By.xpath("(//td[@align='center'])[2]")).getText();
		System.out.println(text);
	    		
	}



}
