package com.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestDay9 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\development\\Day8\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();

		WebElement Women = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(Women).perform();

		
		/*
		 * ac.dragAndDrop(Women, Women).build().perform();
		 * 
		 * ac.contextClick().build().perform();
		 * 
		 * ac.doubleClick().build().perform();
		 * 
		 * ac.clickAndHold().release().build().perform();
		 */
		
		

	}
}
