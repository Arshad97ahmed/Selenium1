package com.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arshad\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		
		WebDriver Driver=new ChromeDriver();
				Driver.get("https://www.w3schools.com/html/html_tables.asp");
				Driver.manage().window().maximize();
				
				List<WebElement> M = Driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr/td"));
				
				for (int i=0; i<M.size();i++) {
					System.out.println(M.get(i).getText()); 			
				}
			
				
				for (WebElement M1:M) {
				System.out.println(M1.getText());
				
					
			
}
}
}
