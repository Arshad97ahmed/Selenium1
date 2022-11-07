package com.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project_Hotel {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arshad\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
	
	WebDriver Driver=new ChromeDriver();
			Driver.get("https://adactinhotelapp.com/");
			Driver.manage().window().maximize();
			
			Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
//Driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
//Driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Arshadahmed");
//Driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");
//Driver.findElement(By.xpath("//input[@id='re_password']")).sendKeys("");
//Driver.findElement(By.xpath("//input[@id='full_name']")).sendKeys("Arshad ahmed");	
//Driver.findElement(By.xpath("//input[@id='email_add']")).sendKeys("arshad97ahmed@gmail.com");	
//Thread.sleep(10000);
//Driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//Driver.findElement(By.xpath("//input[@id='Submit']")).click();

			Driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Arshadahmed");
			Driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ars@1998");

			Driver.findElement(By.xpath("//input[@name='login']")).click();
			
			WebElement Web = Driver.findElement(By.id("location"));
			Select s=new Select(Web);
			s.selectByIndex(5);
			Thread.sleep(1000);
			
			WebElement web = Driver.findElement(By.xpath("//select[@name='hotels']"));
			Select s1=new Select(web);
			s1.selectByVisibleText("Hotel Sunshine");
			Thread.sleep(1000);
			
			WebElement web1=Driver.findElement(By.id("room_type"));
			Select s2=new Select(web1);
			s2.selectByValue("Super Deluxe");
			Thread.sleep(1000);
						
			WebElement web2=Driver.findElement(By.id("room_nos"));
			Select s3=new Select(web2);
			s3.selectByIndex(2);
			Thread.sleep(1000);
			
			Driver.findElement(By.xpath("//input[@id='datepick_in']")).sendKeys("18/09/2022");
			Thread.sleep(1000);
			
			Driver.findElement(By.xpath("//input[@id='datepick_out']")).sendKeys("20/09/2022");
			Thread.sleep(1000);
			
			WebElement se = Driver.findElement(By.xpath("//select[@id='adult_room']"));
			Select s4=new Select(se);
			s4.selectByVisibleText("2 - Two");
			Thread.sleep(1000);
			
			WebElement sy = Driver.findElement(By.xpath("//select[@id='child_room']"));
			Select s5=new Select(sy);
			s5.selectByValue("0");
			Thread.sleep(1000);
			
			Driver.findElement(By.id("Submit")).click();
			
			Driver.findElement(By.id("radiobutton_0")).click();
			Driver.findElement(By.id("continue")).click();
			
			Driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("Arshad");
			Driver.findElement(By.xpath("(//input[@type='text'])[12]")).sendKeys("Ahmed");

			Driver.findElement(By.id("address")).sendKeys("No.80, Bajanao koil street, Padi");
			
			Driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("1234567891011123");
				
			WebElement See = Driver.findElement(By.id("cc_type"));
			Select S8=new Select(See);
			S8.selectByIndex(1);
			
			WebElement See1 = Driver.findElement(By.id("cc_exp_month"));
			Select s8=new Select(See1);
			s8.selectByVisibleText("June");
			
			WebElement See2 = Driver.findElement(By.id("cc_exp_year"));
			Select s9=new Select(See2);
			s9.selectByValue("2022");
			
			Driver.findElement(By.xpath("(//input[@type='text'])[14]")).sendKeys("786");
			
			Driver.findElement(By.xpath("//input[@value=\"Book Now\"]")).click();
			Thread.sleep(3000);
			
			Driver.findElement(By.xpath("//input[@name='logout']")).click();
			
}
	
}

