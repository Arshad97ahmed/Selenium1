package com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Multiple_Dropdown {
			
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arshad\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
			
			WebDriver Driver=new ChromeDriver();
			
			Driver.get("https://demoqa.com/select-menu");
			Driver.manage().window().maximize();
			Thread.sleep(2000);
			
		WebElement web=Driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select s =new Select(web);
		s.selectByValue("1");
		boolean b=s.isMultiple();
		System.out.println(b);
		
		WebElement web1=Driver.findElement(By.xpath("//select[@name='cars']"));
		Select s1=new Select(web1);
		s1.selectByIndex(0);
		s1.selectByVisibleText("Audi");
		s1.deselectByIndex(0);
		boolean b1=s1.isMultiple();
		System.out.println(b1);	
		
			
		Driver.close();
					
		
		
	}

}
