package com.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project_2_Registration {
	
	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arshad\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
      	driver.findElement(By.xpath("//a[@class='login']")).click();
		
		driver.findElement(By.id("email_create")).sendKeys("arshadasfiya78@gmail.com");
		
		driver.findElement(By.id("SubmitCreate")).click();
		
		driver.findElement(By.id("id_gender1")).click();
		
		driver.findElement(By.xpath("//input[@data-validate='isName']")).sendKeys("Arshad");
		
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Ahmed");
		
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Ars@1998");
		
		WebElement Sel = driver.findElement(By.xpath("//select[@id='days']"));
		Select S =new Select(Sel);
		S.selectByIndex(16);
		
		WebElement Sel1 = driver.findElement(By.xpath("//select[@id='months']"));
		Select S1 =new Select(Sel1);
		S1.selectByValue("6");
		
		WebElement Sel2 = driver.findElement(By.xpath("//select[@id='years']"));
		Select S2 =new Select(Sel2);
		S2.selectByValue("1998");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Arshad");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ahmed");
		
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("Greens techie");
		
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("oxford street");
		
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("London");
		
		WebElement ss = driver.findElement(By.xpath("//select[@name='id_state']"));
		
		Select n =new Select(ss);
		n.selectByVisibleText("Kentucky");
		
		driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("00000");
		
		driver.findElement(By.xpath("//input[@name='phone_mobile']")).sendKeys("1234568900");
		
		WebElement D = driver.findElement(By.xpath("//input[@name='alias']"));
		D.clear();
		D.sendKeys("NA");
		
		driver.findElement(By.id("submitAccount")).click();
			
		
		
	}

}
