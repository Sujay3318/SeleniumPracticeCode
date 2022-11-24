package com.day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testday6 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\development\\Day6\\Driver\\chromedriver.exe");// org.openqa.selenium.SessionNotCreatedException:
																											// if enters
																											// the wrong
																											// key
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();

		System.out.println("**********************print all data *********************");

		List<WebElement> tabledata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		for (WebElement data : tabledata) {
			System.out.println(data.getText());
		}

		System.out.println("**********************print header *********************");

		List<WebElement> tableheader = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		for (WebElement data : tableheader) {
			System.out.println(data.getText());
		}

		System.out.println("******************4th row data*************************");

		List<WebElement> fourthRow = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[5]/td"));
		for (WebElement data : fourthRow) {
			System.out.println(data.getText());
		}

		System.out.println(
				"*******************serch for perticular element i tabele example canada************************");
		WebElement canada = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[6]/td[3]"));
		System.out.println(canada.getText());
		

		System.out.println("******************2nd column data*************************");
		//table[@id='customers']/tbody/tr/td[2]
		
		

		System.out.println("******************size of coulmn*************************");
		//table[@id='customers']/tbody/tr/th
		
		
		List<WebElement> sizeOfColumn = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		System.out.println(sizeOfColumn.size());
		List<WebElement> sizeOfrow= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println(sizeOfrow.size()-1);
		
		for(int i=1;i<sizeOfrow.size()-1;i++)
		{
			for(int j=0;j<sizeOfColumn.size();j++)
			{
				System.out.println(driver.findElement(By.xpath("//table[@id='customers']/tbody/tr['+i+']/th['+j+']") ).getText());
			}
			System.out.println();
		}
		

	}
}
