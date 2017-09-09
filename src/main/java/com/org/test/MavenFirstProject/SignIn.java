package com.org.test.MavenFirstProject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {
        WebDriver driver;
        public SignIn(WebDriver driver2) 
	    	  {
	  		    driver=driver2;
	  		  }		

		public void signin() throws InterruptedException
	    {
         Thread.sleep(10000);
	  
		driver.findElement(By.cssSelector("input#password")).sendKeys("Stronger@2");
		driver.findElement(By.cssSelector("input#repassword")).sendKeys("Stronger@2");
		driver.findElement(By.cssSelector("button#sub_btn_setpass")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input#login-mobile")).sendKeys("9347690782");
		Thread.sleep(5000);
     	driver.findElement(By.cssSelector("//input[@id='login-password'][@type='password']")).sendKeys("Stronger@2");
     	driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
     	
		}

}
