package com.day8;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDay8 {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\development\\Day8\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		//we go inside iframe
		driver.switchTo().frame("singleframe");
		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("iphone");
	
		//we are comming out from that iframe
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		driver.switchTo().frame(outerFrame);
		System.out.println("outer frame");
	
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(innerFrame);
		System.out.println("inner frame");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("iphone");
		driver.switchTo().defaultContent();
		System.out.println("outside");
		driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
		
	}
}
