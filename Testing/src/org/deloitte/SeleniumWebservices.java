package org.deloitte;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebservices 
{

	private static String fileWithPath;
	
	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\geckodriver\\chromedriver.exe");
		
//		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//		capabilities.setCapability("marionette",true);
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.netflix.com");
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("id_userLoginId")).sendKeys("abc123@pqr.in");
		driver.findElement(By.id("id_password")).sendKeys("abc.in");
		
		driver.get("https://semantic-ui.com/modules/checkbox.html");
		WebElement checkbox=driver.findElement(By.className("hidden"));
		checkbox.click();
		checkbox.click();
		if(checkbox.isSelected())
		{
			System.out.println("Got it");
		}
		else
		{
			System.err.println("Something went wrong");
		}
		
		
		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		WebElement radio = driver.findElement(By.name("optradio"));
		radio.click();
		
		if(radio.isSelected())
		{
			System.out.println("Got it");
		}
		else
		{
			System.err.println("Something went wrong");
		}
		
		
		driver.get("https://accounts.snapchat.com/accounts/login");
		Select drpdown= new Select(driver.findElement(By.id("sc-global-locale-selector")));
		
		drpdown.selectByVisibleText("Norsk");
		driver.findElement(By.name("username")).sendKeys("yashan");
		driver.findElement(By.cssSelector("#password")).sendKeys("yash");
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("c:\\Selenium\\Error.png"));
		
	}

}
