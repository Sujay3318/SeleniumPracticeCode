package com.day2;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\development\\day2\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// driver.get mrthod until whole page get loaded
		driver.get(
				"https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_6vkm4swd5x_b&adgrpid=60611463244&hvpone=&hvptwo=&hvadid=617724335923&hvpos=&hvnetw=g&hvrand=11952712202908578782&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=20462&hvtargid=kwd-320833120261&hydadcr=15413_2322997&gclid=CjwKCAjwpqCZBhAbEiwAa7pXeeFjTE701H3YrFjz0eft-l6kh68hukUnHuJzwtX6_nm2NLUYtygtSxoCE2wQAvD_BwE");
		// maximize the window size
		driver.manage().window().maximize();

		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		searchBar.sendKeys("Iphone");

		String parenttab = driver.getWindowHandle();

		WebElement search = driver.findElement(By.id("nav-search-submit-button"));
		search.click();

		WebElement iphonelink = driver
				.findElement(By.xpath("(//span[contains(@class,'a-size-medium a-color-base a-text-normal')])[1]"));
		iphonelink.click();

		Thread.sleep(3000);

		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTab.get(1));
		Thread.sleep(2000);

		// why is it failing
		WebElement addToCart = driver.findElement(By.xpath("//*[@id='add-to-cart-button']"));
		addToCart.click();

		Thread.sleep(3000);
		WebElement closIt = driver.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']"));
		closIt.click();

		Thread.sleep(3000);
		addToCart.click();

		Thread.sleep(3000);
		closIt.click();

	}

}
