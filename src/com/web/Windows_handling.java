package com.web;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_handling {
	
	public static void main(String[] arggs) throws InterruptedException, AWTException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arshad\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		
		WebDriver Driver=new ChromeDriver();
				Driver.get("https://www.amazon.in/");
				Driver.manage().window().maximize();
				
				Actions S=new Actions(Driver);
				
				WebElement web= Driver.findElement(By.xpath("//a[@href='/deals?ref_=nav_cs_gb']"));
				Thread.sleep(3000);
		        S.contextClick(web).build().perform();
		       
		        Robot R1=new Robot();
		        
		        R1.keyPress(KeyEvent.VK_DOWN);
				R1.keyRelease(KeyEvent.VK_DOWN);
				Thread.sleep(3000);
				R1.keyPress(KeyEvent.VK_ENTER);
			R1.keyRelease(KeyEvent.VK_ENTER);
				
			WebElement FE = Driver.findElement(By.xpath("//a[text()='Best Sellers']"));
			S.contextClick(FE).build().perform();
			Thread.sleep(3000);
					
			Robot R=new Robot();
						
		    R.keyPress(KeyEvent.VK_DOWN);
			R.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		
		String ww = Driver.getWindowHandle();
		System.out.println(ww);
		
		Set<String> w1 = Driver.getWindowHandles();
		
		for (String string : w1) {
			String title = Driver.switchTo().window(string).getTitle();
			System.out.println(title);
			
			String s="Amazon.in Bestsellers: The most popular items on Amazon";
			
           Set<String> ss = Driver.getWindowHandles();
           for (String st : ss) {
        	   if (Driver.switchTo().window(st).getTitle().equals(s)) {
        		   break;
        	   }
        	   
           }
           
           for (String s1 : ss) {
        	   if (!s1.equals(w1)) {
        		   Driver.switchTo().window(string);
        		   Driver.close();
        	   }
        	   
			
		}
			
	
			
			
			
			
			
		}
		}
				
		
		
}
