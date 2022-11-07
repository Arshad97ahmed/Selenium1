package com.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_launch_Day1 {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arshad\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	String title = driver.getTitle();
	System.out.println(title);
	String url =driver.getCurrentUrl();
	System.out.println(url);
		
		
	driver.navigate().to("https://www.hotstar.com/in");
	Thread.sleep(3000);
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	driver.navigate().forward();
	Thread.sleep(3000);
	
	driver.navigate().refresh();
	Thread.sleep(3000);
	
	driver.quit();
	
}

}
