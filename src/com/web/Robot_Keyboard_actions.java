package com.web;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Keyboard_actions {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arshad\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		
		WebDriver Driver=new ChromeDriver();
				Driver.get("https://www.amazon.in/");
				Driver.manage().window().maximize();
				
				Actions S=new Actions(Driver);
				
			WebElement FE = Driver.findElement(By.xpath("//a[text()='Best Sellers']"));
			S.contextClick(FE).build().perform();
			Thread.sleep(3000);
				
				
			Robot R=new Robot();
				
			    R.keyPress(KeyEvent.VK_DOWN);
				R.keyRelease(KeyEvent.VK_DOWN);
				Thread.sleep(3000);
				R.keyPress(KeyEvent.VK_ENTER);
			R.keyRelease(KeyEvent.VK_ENTER);
	
				R.keyPress(KeyEvent.VK_CONTROL);
				R.keyPress(KeyEvent.VK_T);
				R.keyRelease(KeyEvent.VK_T);
				R.keyRelease(KeyEvent.VK_CONTROL);
				
				
				
				
				
				
				
				
				
				
}
}
