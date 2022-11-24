package com.Day7;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestDay7 {

	
	public static void main(String[] args) {
		
		System.setProperty("webdiver.chrome.driver", "C:\\development\\Day7\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//implicitly wait will wait for certain amount of times before throwing nosuchelemntexception
		//if we get element before set timeout the script will resume from that time it will for full time 
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		
		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		
		searchBar.sendKeys("iphone 14 pro");
		
		WebDriverWait explictylywait=new WebDriverWait(driver, Duration.ofSeconds(6));
		explictylywait.until(ExpectedConditions.visibilityOf(searchBar));
		
	}
}
