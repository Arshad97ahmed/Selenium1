package com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Single_multi_Frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arshad\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		
		WebDriver drive=new ChromeDriver();
		drive.get("https://demo.automationtesting.in/Frames.html");
		drive.manage().window().maximize();
		
		drive.switchTo().frame("singleframe");
		
		 drive.findElement(By.xpath("//input[@type='text']")).sendKeys("Arshad");
		
		drive.switchTo().defaultContent();
		Thread.sleep(3000);
		
		drive.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		drive.switchTo().frame(1);
		drive.switchTo().frame(0);
		Thread.sleep(3000);
		
		drive.findElement(By.xpath("//input[@type='text']")).sendKeys("Arshad");
		Thread.sleep(3000);
		
		drive.switchTo().defaultContent();
		
		Thread.sleep(3000);		
		drive.findElement(By.xpath("//a[@href='WebTable.html']")).click();

}
}
