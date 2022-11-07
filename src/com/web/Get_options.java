package com.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_options {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arshad\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		
		WebDriver Driver=new ChromeDriver();
		
		Driver.get("https://demoqa.com/select-menu");
		Driver.manage().window().maximize();
		
		
		WebElement web=Driver.findElement(By.xpath("//select[@name='cars']"));
		Select s =new Select(web);
		s.selectByIndex(2);
		s.selectByValue("volvo");
		s.selectByVisibleText("Saab");
		Thread.sleep(2000);
		
		List <WebElement> opt=s.getOptions();
		for (int i=0;i<opt.size();i++) {
			System.out.println(opt.get(i).getText());
		}
		
		List<WebElement> opt1=s.getAllSelectedOptions();
		
			for (WebElement a:opt1){
				System.out.println(a.getText());
			}
			
			WebElement opt2 =s.getFirstSelectedOption();
			System.out.println(opt2.getText());
			
			Driver.close();		
		
		
		
		
	}
}
