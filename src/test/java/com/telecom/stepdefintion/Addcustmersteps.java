package com.telecom.stepdefintion;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
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
	@When("user need to fill up all the data by using one dim list")
	public void user_need_to_fill_up_all_the_data_by_using_one_dim_list(DataTable datatable) {
		List<String> data = datatable.asList(String.class);
		
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(data.get(0));
		driver.findElement(By.id("lname")).sendKeys(data.get(1));
		driver.findElement(By.id("email")).sendKeys(data.get(2));
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(data.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(data.get(4));
		
		
	    
	}
	@When("user need to fill up all the data by using one dim map")
	public void user_need_to_fill_up_all_the_data_by_using_one_dim_map(DataTable datatable) {
		 Map<String,String> data = datatable.asMap(String.class,String.class);
		
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(data.get("fname"));
		driver.findElement(By.id("lname")).sendKeys(data.get("lname"));
		driver.findElement(By.id("email")).sendKeys(data.get("email"));
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(data.get("add"));
		driver.findElement(By.id("telephoneno")).sendKeys(data.get("mobile"));
		
		
	    
	}
	@When("user need to fill up all the data by using two dim list")
	public void user_need_to_fill_up_all_the_data_by_using_two_dim_list(DataTable datatable) {
		List<List<String>> data=datatable.asLists(String.class);
		
		
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(data.get(0).get(1));
		driver.findElement(By.id("lname")).sendKeys(data.get(1).get(2));
		driver.findElement(By.id("email")).sendKeys(data.get(2).get(2));
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(data.get(3).get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(data.get(2).get(2));
	}
	@When("user need to fill up all the data by using two dim map")
	public void user_need_to_fill_up_all_the_data_by_using_two_dim_map(DataTable datatable) {
		List<Map<String, String>> data = datatable.asMaps(String.class,String.class);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(data.get(1).get("fnmae"));
		driver.findElement(By.id("lname")).sendKeys(data.get(2).get("lname"));
		driver.findElement(By.id("email")).sendKeys(data.get(3).get("email"));
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(data.get(1).get("add"));
		driver.findElement(By.id("telephoneno")).sendKeys(data.get(4).get("mobile"));
		}

	@When("user click on submit")
	public void user_click_on_submit() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	   
	}

	@Then("user verifys the custemer id is generated")
	public void user_verifys_the_custemer_id_is_generated() {
		 WebElement d= driver.findElement(By.xpath("(//td[@align='center'])[2]"));
		 String text = d.getText();
		 System.out.println(text);
		 driver.close();
	
	    		
	}
	



}
