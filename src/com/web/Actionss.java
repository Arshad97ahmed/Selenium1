package com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arshad\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/shop/prebuzz?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=Cj0KCQjw94WZBhDtARIsAKxWG-8ngkm-gxSGB5pugf9ZHMVgtJ82ZqNEN0b4-SIE3qaRxpu-cQ6yYbEaAiR6EALw_wcB");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions ac=new Actions(driver);
		
		WebElement web = driver.findElement(By.xpath("//a[text()='Beauty']"));
		ac.moveToElement(web).build().perform();
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	WebElement DC= driver.findElement(By.id("doubleClickBtn"));
	ac.doubleClick(DC).build().perform();
	Thread.sleep(2000);
	
	WebElement DC1= driver.findElement(By.id("rightClickBtn"));
	Thread.sleep(2000);
	ac.contextClick(DC1).build().perform();
		
	WebElement DC2= driver.findElement(By.xpath("//button[text()='Click Me']"));
	Thread.sleep(2000);
	ac.click(DC2).build().perform();
	
	driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement DC3 = driver.findElement(By.id("form:drag_content"));
	Thread.sleep(2000);
	WebElement dc4 = driver.findElement(By.id("form:drop_header"));
	Thread.sleep(3000);
		
	ac.clickAndHold(DC3).build().perform();
	ac.dragAndDrop(DC3, dc4).build().perform();
	Thread.sleep(2000);
	
	WebElement dd = driver.findElement(By.id("form:conpnl_header"));
	ac.clickAndHold(dd).build().perform();
	ac.moveToElement(dd, 1000, 0).build().perform();
		Thread.sleep(2000);
	
	//driver.close();
	//Thread.sleep(3000);		
}
}
