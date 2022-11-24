package com.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDay4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\development\\Day3\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.manage().window().maximize();

		// we cannot automate the captcha
		// we cannot find out xptah of alertbox so we need to use
		// driver.switchTo().alert().accept()
		WebElement alertClick = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		alertClick.click();
		String text1 = driver.switchTo().alert().getText();
		System.out.println("messgae display in prompt "+text1);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		/*
		 * alert can handel by selenium simple alert -only ok confirm alert -ok and
		 * dissmiss prompt alert - prpmt + accept +dissmiss button availel
		 */
		WebElement confirmAlert = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		confirmAlert.click();

		WebElement button = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		button.click();

		String text = driver.switchTo().alert().getText();
		System.out.println("messgae display in prompt "+text);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();

		WebElement promptAlert = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		promptAlert.click();

		WebElement button2 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		button2.click();

		driver.switchTo().alert().sendKeys("hi");
		driver.switchTo().alert().accept();
		
		
		

	}

}
