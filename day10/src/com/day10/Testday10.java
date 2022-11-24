package com.day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testday10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\development\\day10\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// driver.get mrthod until whole page get loaded
		driver.get("https://www.amazon.in/");

		driver.manage().timeouts().cimplicitlyWait(Duration.ofSeconds(3));
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	//	WebElement findElement = driver.findElement(By.xpath("//a[@class='nav_a' and text()='Careers']"));

		JavascriptExecutor js = (JavascriptExecutor) (driver);
//		WebElement findElement2 = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));

		WebElement downalod = driver.findElement(By.xpath("//a[text()='China']"));
		
		Thread.sleep(3000);
	//	js.executeScript("arguments[0].ScrollIntoView();",findElement2 );
		js.executeScript("arguments[0].ScrollIntoView();",downalod );
		
		System.out.println("*");
		
		
	}
}
