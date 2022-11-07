package com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arshad\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(8000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().sendKeys("Arshad");
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.close();

	}

}
