package com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Elements_Day2 {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arshad\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.instagram.com/accounts/login/");
	Thread.sleep(3000);
	
	driver.manage().window().maximize();
	
	WebElement web= driver.findElement(By.name("username"));
	web.sendKeys("The_god_of_thunderrr");
	Thread.sleep(3000);
	
	WebElement web2=driver.findElement(By.name("password"));
	web2.sendKeys("12345678@");
	Thread.sleep(3000);
	
	WebElement log=driver.findElement(By.xpath("//div[@class='             qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    ']"));
    log.click();
    Thread.sleep(3000);
    
    driver.close();
	
	}

}
