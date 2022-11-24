package com.day3;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.api.internal.StringUtils;

public class TestDay3 {

	public static void main(String[] args) {

		
		String s="checkout (22514261521)";
		
		String extractedtesxt=org.apache.commons.lang3.StringUtils.substringBetween(s, "(", ")");
		System.out.println(extractedtesxt);
		
		System.setProperty("webdriver.chrome.driver", "C:\\development\\Day3\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjYzNDk1ODA4LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");

		driver.manage().window().maximize();

		//// input[@id="email"]

		// (//input[contains(@class,'inputtext')])[1]

		// find element search for first match it will return singel weblement if not
		// present then throws nosuchelementexception
		WebElement email = driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[1]"));
		email.sendKeys("sujay@gamil.com");

		WebElement pass = driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[2]"));
		pass.sendKeys("sujay");

//		WebElement login = driver.findElement(By.id("loginbutton"));
//		login.click();

		driver.navigate().to(
				"https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Cb%7Cfb%20login%20page%7C&placement=&creative=589460569900&keyword=fb%20login%20page&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-27563618754%26loc_physical_ms%3D9302631%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwg5uZBhATEiwAhhRLHhgtjvVQoyFlSjxISIBZNU8yETE4mfVLnuUzQ0LGWGTe5KxyaZ_x9xoCR-8QAvD_BwE");

		WebElement name = driver.findElement(By.xpath("//input[contains(@class,'inputtext _58mg _5dba _2ph-')][1]"));
		name.sendKeys("sujay");
		String attribute = name.getAttribute("value");
		System.out.println(attribute);

		WebElement lastName = driver
				.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg _5dba _2ph-')])[2]"));
		lastName.sendKeys("thakur");
		String attributeLastName = lastName.getAttribute("value");
		System.out.println(attributeLastName);

		WebElement phoneNumber = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		phoneNumber.sendKeys("122313131");

		WebElement phoneNumber1 = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		phoneNumber1.clear();
		phoneNumber1.sendKeys("122313131");
		System.out.println(phoneNumber1.getAttribute("value"));

		Select date = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		date.selectByIndex(1);

		Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		month.selectByIndex(1);

		Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		year.selectByIndex(4);
		System.out.println(year.getFirstSelectedOption().getText());

		// findelements return all matching webelements if not prsent then return empty
		// list
		WebElement radio = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
		System.out.println(radio.isSelected()); // radio,checkbox,dropdown is selected
		radio.click();
		System.out.println(radio.isDisplayed()); // webelemnt is present or not
		System.out.println(radio.isSelected());

		List<WebElement> radioButton = driver.findElements(By.xpath("//input[@class='_8esa']"));
		System.out.println("debug point1");
		int size = radioButton.size();
		if (size == 0) {
			System.out.println("debug point2");
			throw new NoSuchElementException();
		} else {
			for (int i = 0; i < size; i++) {
				System.out.println("debug point3");
				System.out.println(radioButton.get(i).getAttribute("value"));
				System.out.println(radioButton.get(i).getText());
			}
		}
	}
}
