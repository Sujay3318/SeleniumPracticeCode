package com.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.api.internal.StringUtils;

public class TestDay2 {

	public static void main(String[] args) throws InterruptedException {

		// String extractedtesxt=StringUtils.substringBetween(s, "(", " ");

		//System.setProperty("webdriver.chrome.driver", "C:\\development\\day2\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gs-3448\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();

		// driver.get mrthod until whole page get loaded
		driver.get(
				"https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805682%7Cb%7Cfb%27%27%27%27%7C&placement=&creative=550525805682&keyword=fb%27%27%27%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221592%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327681933321%26loc_physical_ms%3D9302631%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwg5uZBhATEiwAhhRLHuQIzK52lvleUHFTodzoT1Tkwg-vVsIzcLJFSGLDSspdHZ6FZBOyZBoCXXsQAvD_BwE");

		// maximize the window size
		driver.manage().window().maximize();

		// driver.navigae().to() will no wait util page get load it has back froword
		// refresh functionality
		driver.navigate().to(
				"https://www.flipkart.com/?s_kwcid=AL!739!3!582822043580!p!!g!!flipkart&gclsrc=aw.ds&semcmpid=sem_8024046704_brand_exe_buyers_goog&ef_id=CjwKCAjwg5uZBhATEiwAhhRLHsb4UAdoR9185PxFnFxw2mFUW5ynaggTtCsLuPjSG8u2Nmyv8K71IRoCwNEQAvD_BwE:G:s&s_kwcid=AL!739!3!556022308048!!!g!!&cmpid=sem_9790089436_Catchall_New_dsa_MinusProductPage_goog&gclid=CjwKCAjwg5uZBhATEiwAhhRLHsb4UAdoR9185PxFnFxw2mFUW5ynaggTtCsLuPjSG8u2Nmyv8K71IRoCwNEQAvD_BwE");

		//getText will retun all<>thsi values it will return<>
		
		String str=driver.findElement(By.xpath("(//img[@class='kJjFO0'])[1]")).getText();
		System.out.println("inner text is not present -"+str+"  black");
		
		

		String str1=driver.findElement(By.xpath("//div[@class='_1kfTjk']")).getText();
		System.out.println("inner text is not present -"+str1+"  black");
		
		Thread.sleep(3000);

		driver.navigate().back();

		Thread.sleep(3000);

		driver.navigate().forward();

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String title = driver.getTitle();
		System.out.println(title);

		String pageSource = driver.getPageSource();
		//System.out.println(pageSource);

		driver.navigate().refresh();

		// it will close current window
		//driver.close();

		// it will close all windows
		driver.quit();

	}

}
