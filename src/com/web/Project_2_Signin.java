package com.web;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Project_2_Signin {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arshad\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
      	driver.findElement(By.xpath("(//input[@class='is_required validate account_input form-control'])[2]")).sendKeys("arshadasfiya78@gmail.com");

      	driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Ars@1998");
      	
      	driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
      	
      	driver.findElement(By.xpath("//a[@title='Home']")).click();
      	
      	Actions ac =new Actions(driver);
      	
      	WebElement m = driver.findElement(By.xpath("//a[text()='Women']"));
      	ac.moveToElement(m).build().perform();
      	
      	driver.findElement(By.xpath("//a[text()='T-shirts']")).click();
      	
      	driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();  	
      	      	
      	WebElement m1 = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
      	ac.moveToElement(m1).build().perform();
      	
      	driver.findElement(By.xpath("(//a[@class='color_pick'])[2]")).click();
      	
      	driver.findElement(By.xpath("//span[text()='View larger']")).click();
      	
      	driver.findElement(By.xpath("//a[@title='Close']")).click();
      	
      	WebElement ww = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
      	ww.click();
      	ww.click();
      	
      	driver.findElement(By.xpath("//a[@class='btn btn-default button-minus product_quantity_down']")).click();
      	    	
      	WebElement cc = driver.findElement(By.id("group_1"));
      	Select s= new Select (cc);
      	s.selectByIndex(2);
      	
      	driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
      	
      	driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
      	
      	driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
      	
      	driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("NA");
      	
      	driver.findElement(By.xpath("//button[@name='processAddress']")).click();
      	
    	driver.findElement(By.xpath("//input[@name='cgv']")).click();
    	
    	driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
      	
    	driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
    	
    	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    	
    	TakesScreenshot SC = (TakesScreenshot)driver;
    	File N=SC.getScreenshotAs(OutputType.FILE);
        File N1 =new File ("C:\\Users\\Arshad\\eclipse-workspace\\Selenium1\\Screenshot\\Project.png");
        FileUtils.copyFile(N, N1);
    	
    	
	}

}
