package com.day5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDay5 {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\development\\Day3\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Alerts.html");

		
		//Otp we can hadel with scanner driver wait for some time 
		//take screeshot and we can gice as proff to developer
		driver.manage().window().maximize();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile= ts.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("C:\\development\\Day5\\Screenshot\\pic1.png");
		
		//need to add jars for FileUtils common io jar
		FileUtils.copyFile(srcFile, destFile);
		
		//functinal testing->
		//non functinal testing ->
		
		//take screenshot of perticular part
		WebElement takeScreenshot = driver.findElement(By.xpath("//div[@class='col-md-12']/div"));
		File srcf = takeScreenshot.getScreenshotAs(OutputType.FILE);
		File desf=new File("C:\\\\development\\\\Day5\\\\Screenshot\\\\pic2.png");
		FileUtils.copyFile(srcf, desf);
		
		
		
		
		
	}
}
