package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class SampleTest {
	public static WebDriver driver;
	@Given("open browser")
	public void open_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\eclipse-workspace\\pearson\\ExtentReport\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();    
	}

	@Given("load url")
	public void load_url() {
	driver.get("https://www.facebook.com/");    
	}

}
