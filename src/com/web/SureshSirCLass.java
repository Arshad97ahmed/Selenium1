package com.web;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SureshSirCLass {

	public static void productDetails() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arshad\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");

		WebDriver Driver= new ChromeDriver();
		
		Driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		Driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		Driver.manage().window().maximize();
						
		List<WebElement> products = Driver.findElements(By.xpath("//div[@class='product-productMetaInfo']"));
		
		int size=products.size();
		System.out.println("No of product: "+ size);
		
		
		List<WebElement> Name = Driver.findElements(By.xpath("//h3[@class='product-brand']"));	
		
		System.out.println("Product's name ");
		
		for (WebElement web : Name) {
			System.out.println(web.getText());
			
		}
	}
		
	public static void miniumValue() {
		
		WebDriver Driver= new ChromeDriver();
		
		Driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
			
		Driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		Driver.manage().window().maximize();
								
		List<WebElement> products = Driver.findElements(By.xpath("//div[@class='product-price']"));
		
		int size=products.size();
		System.out.println("No of price"+ size);
		
		System.out.println("All value");
		
		for (WebElement E : products) {
			System.out.println(E.getText());//div[@class='product-price']
			
		}
		
					
		}
			
	public static void main(String[] args) {
		productDetails();
		miniumValue();
		
	}

}




