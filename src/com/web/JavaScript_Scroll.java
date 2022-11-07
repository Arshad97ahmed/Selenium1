package com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Scroll {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arshad\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
	
	WebDriver drive=new ChromeDriver();
	drive.get("https://www.flipkart.com/");
	drive.manage().window().maximize();
	
	JavascriptExecutor js=(JavascriptExecutor)drive;
	
	drive.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(3000);
	
	WebElement Facebook=drive.findElement(By.className("_1arVWX"));
	Thread.sleep(3000);
	
	js.executeScript("arguments[0].scrollIntoView();",Facebook);
	Thread.sleep(3000);
	
	js.executeScript("window.scrollBy(0,-2000);");

	
	js.executeScript("alert('hello guys');"); 
	Thread.sleep(3000);
	
	drive.switchTo().alert().accept();
	Thread.sleep(3000);
		
}
}
