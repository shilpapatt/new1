package com.org.test.MavenFirstProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class Parameter {
	WebDriver driver;

	@Parameters("browser")
	@BeforeTest
	public void beforeTest(String bro) {
		String variable=bro;
		System.out.println("Before Test "+variable);  

		if (variable.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","Resource/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		
		}
		else if(variable.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","Resource/geckodriver.exe");
			driver=new FirefoxDriver();	
		}
		driver.get("https://dev.tracko.co.in/");		
	
	}

	@Test (priority=1)
	public void callsignup() throws InterruptedException
	{
		SignUp obj1=new SignUp(driver);  //calling constructor
		obj1.signup();

		SignIn obj2=new SignIn(driver);     
		obj2.signin();
	}

	@AfterTest public void afterTest() 
	{
		System.out.println("After Test");
		driver.quit();
	}
}
