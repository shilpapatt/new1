package com.org.test.MavenFirstProject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SignUp {
	
	        WebDriver driver;
	        public SignUp(WebDriver driver2) 
	        {
		    driver=driver2;
		    }	
			public void signup() {
		  //  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    driver.findElement(By.xpath("//a[text()='Sign Up Free']")).click();
			driver.findElement(By.xpath("//input[@id='name'][@placeholder='Your name']")).sendKeys("shilpaPatt");
			driver.findElement(By.xpath("//*[@id='email'][@placeholder='Your email']")).sendKeys("shilpaalisha@gmail.com");
			driver.findElement(By.id("mobile")).sendKeys("9347690777");
			driver.findElement(By.id("sub_btn_signup")).click();  
		    driver.findElement(By.xpath("//input[@id='otp']")).sendKeys("1244");
			driver.findElement(By.cssSelector("button#sub_btn_verify")).click();
		    driver.findElement(By.cssSelector("button.confirm")).click();
	        }
			  
	}


