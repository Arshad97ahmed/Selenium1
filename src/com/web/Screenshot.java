package com.web;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arshad\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement web=driver.findElement(By.xpath("//input[@name='email']"));
		web.sendKeys("123456789");
		
		TakesScreenshot s=(TakesScreenshot)driver; //----Narrowing type casting 
		
		File f=s.getScreenshotAs(OutputType.FILE);
			
		File FL=new File("C:\\Users\\Arshad\\eclipse-workspace\\Selenium1\\Screenshot\\Facebook.png");
		
		FileUtils.copyFile(f,FL);
		
		
}
}
