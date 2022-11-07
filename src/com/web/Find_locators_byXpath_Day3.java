package com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Find_locators_byXpath_Day3 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arshad\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement web=driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']"));
	Thread.sleep(3000);
	
	web.click();
	Thread.sleep(2000);
	
	WebElement web1=driver.findElement(By.xpath("//input[@data-type='text']"));
	web1.sendKeys("Arshad");
	Thread.sleep(3000);
	
	WebElement web2=driver.findElement(By.xpath("//input[@name='lastname']"));
	web2.sendKeys("Ahmed");
	Thread.sleep(2000);
	
	WebElement web3=driver.findElement(By.xpath("//input[@name='reg_email__']"));
	web3.sendKeys("1234567890");
	Thread.sleep(2000);
	
	WebElement web4=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	web4.sendKeys("greens@13344");
	Thread.sleep(2000);	
	
	WebElement web5=driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select s=new Select (web5);
	s.selectByIndex(16);
	Thread.sleep(2000);	
	
	WebElement web6=driver.findElement(By.xpath("//select[@aria-label='Month']"));
	Select s1=new Select(web6);
	s1.selectByValue("6");
	Thread.sleep(2000);	
	
	WebElement web7=driver.findElement(By.xpath("//select[@aria-label='Year']"));
	Select s2=new Select(web7);
	s2.selectByVisibleText("1998");
	
	Thread.sleep(2000);	
	
	driver.close();
	Thread.sleep(3000);	
	
}
}
