
package com.web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SureshBDsel {

	public static WebDriver driver;
	public static int totalNumberofProducts;
	public static int minPrice;

	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Arshad\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		driver.manage().window().maximize();
	}

	public static void productsCount() {
		List<WebElement> allProducts = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']"));
		totalNumberofProducts = allProducts.size();
		System.out.println("Total count of product is: " + totalNumberofProducts);

		/*
		 * for (WebElement product : allProducts) {
		 * System.out.println(product.getText());
		 * }
		 */
	}

	public static void minimumPriceofallProducts() {
		List<Integer> priceList = new ArrayList<Integer>();
		List<WebElement> allPrices = driver.findElements(By.xpath(
				"//li[@class='product-base']//descendant::div[@class='product-price']//descendant::span[@class='product-discountedPrice']"));
		for (WebElement price : allPrices) {
			String priceText = price.getText().replaceAll("Rs. ", "");
			priceText.replaceAll(" ", "");

			int priceValue = Integer.parseInt(priceText);
			priceList.add(priceValue);
		}
		minPrice = Collections.min(priceList);
		System.out.println("minimun price of all Products is : " + minPrice);
	}

	public static void minimumPriceProductName(int price) {
		//// li[@class='product-base']//descendant::div[@class='product-price']//descendant::span[@class='product-discountedPrice']//ancestor::div[@class='product-price']//preceding-sibling::h3[@class='product-brand']
		WebElement minimumPriceProductName = driver
				.findElement(By.xpath("//li[@class='product-base']//descendant::span[text()=" + price
						+ "]//ancestor::div[@class='product-price']//preceding-sibling::h3[@class='product-brand'][1]"));
		String productName = minimumPriceProductName.getText();
		System.out.println("this is the Brand name:" + productName);
	}

	public static void main(String[] args) {
		browserLaunch();
		productsCount();
		minimumPriceofallProducts();
		minimumPriceProductName(minPrice);

	}
}
