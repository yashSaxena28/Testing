package org.deloitte.testing;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusTests 
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\geckodriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.redbus.in/");
		WebElement source = driver.findElement(By.xpath("//*[@id='src']"));
		source.sendKeys("Mumbai");
	    Thread.sleep(1000);
        List<WebElement> locations= source.findElements(By.className("autoFill"));
		for(WebElement location : locations)
		{
			if(location.getText().matches("*Mumbai.*"))
			{
				location.sendKeys(Keys.ENTER);
			}
		}
		
		WebElement destination = driver.findElement(By.xpath("//*[@id='dest']"));
		destination.sendKeys("Delhi");
		Thread.sleep(1000);
        List<WebElement> locationsDest= source.findElements(By.className("autoFill"));
		for(WebElement location : locationsDest)
		{
			if(location.getText().matches("*Delhi.*"))
			{
				location.sendKeys(Keys.ENTER);
			}
		}
		destination.sendKeys(Keys.TAB);
		
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
	    int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
        String todayStr = Integer.toString(todayInt);
        WebElement thisCalendar[] = new WebElement[5]; 
        thisCalendar[0] = driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[3]"));
        thisCalendar[1] = driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[4]"));
        thisCalendar[2] = driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[5]"));
        thisCalendar[3] = driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[6]"));
        thisCalendar[4] = driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[7]"));
        
        List<WebElement> column1= thisCalendar[0].findElements(By.tagName("td"));
        for(WebElement cell : column1)
        {
        	if(cell.getText().equals(todayStr))
        	{
        		cell.click();
        		break;
        	}
        }
        List<WebElement> column2= thisCalendar[1].findElements(By.tagName("td"));
        for(WebElement cell : column2)
        {
        	if(cell.getText().equals(todayStr))
        	{
        		cell.click();
        		break;
        	}
        }
        List<WebElement> column3= thisCalendar[2].findElements(By.tagName("td"));
        for(WebElement cell : column3)
        {
        	if(cell.getText().equals(todayStr))
        	{
        		cell.click();
        		break;
        	}
        }
        List<WebElement> column4= thisCalendar[3].findElements(By.tagName("td"));
        for(WebElement cell : column4)
        {
        	if(cell.getText().equals(todayStr))
        	{
        		cell.click();
        		break;
        	}
        }
        List<WebElement> column5= thisCalendar[4].findElements(By.tagName("td"));
        for(WebElement cell : column5)
        {
        	if(cell.getText().equals(todayStr))
        	{
        		cell.click();
        		break;
        	}
        }
        
    	Thread.sleep(500);
    	driver.findElement(By.xpath("//*[@id='onward_cal']")).sendKeys(Keys.TAB);
    	
        Calendar returnCalendar = Calendar.getInstance(TimeZone.getDefault());
	    int returnInt = calendar.get(Calendar.DAY_OF_MONTH)+3;
        String returnStr = Integer.toString(returnInt);
        WebElement backCalendar[] = new WebElement[5]; 
        backCalendar[0] = driver.findElement(By.xpath("//*[@id='rb-calendar_return_cal']/table/tbody/tr[3]"));
        backCalendar[1] = driver.findElement(By.xpath("//*[@id='rb-calendar_return_cal']/table/tbody/tr[4]"));
        backCalendar[2] = driver.findElement(By.xpath("//*[@id='rb-calendar_return_cal']/table/tbody/tr[5]"));
        backCalendar[3] = driver.findElement(By.xpath("//*[@id='rb-calendar_return_cal']/table/tbody/tr[6]"));
        backCalendar[4] = driver.findElement(By.xpath("//*[@id='rb-calendar_return_cal']/table/tbody/tr[7]"));
        
        List<WebElement> col1= backCalendar[0].findElements(By.tagName("td"));
        for(WebElement cell : col1)
        {
        	if(cell.getText().equals(returnStr))
        	{
        		cell.click();
        		break;
        	}
        }
        List<WebElement> col2= backCalendar[1].findElements(By.tagName("td"));
        for(WebElement cell : col2)
        {
        	if(cell.getText().equals(returnStr))
        	{
        		cell.click();
        		break;
        	}
        }
        List<WebElement> col3= backCalendar[2].findElements(By.tagName("td"));
        for(WebElement cell : col3)
        {
        	if(cell.getText().equals(returnStr))
        	{
        		cell.click();
        		break;
        	}
        }
        List<WebElement> col4= backCalendar[3].findElements(By.tagName("td"));
        for(WebElement cell : col4)
        {
        	if(cell.getText().equals(returnStr))
        	{
        		cell.click();
        		break;
        	}
        }
        List<WebElement> col5= backCalendar[4].findElements(By.tagName("td"));
        for(WebElement cell : col5)
        {
        	if(cell.getText().equals(returnStr))
        	{
        		cell.click();
        		break;
        	}
        }

    	Thread.sleep(400);
    	
    	driver.findElement(By.xpath("//*[@id='search_btn']")).click();
    	driver.findElement(By.xpath("//*[@id='12530825']/div/div[2]/div[1]")).click();
    	
    	Thread.sleep(200);
    	
    	driver.findElement(By.xpath("//*[@id='12530825']/div[1]/div[2]/div[2]/ul/li[2]/span")).click();
	}

}
