package com.testmaven.facebook_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebook {

	@Test
	public void chrometest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranji\\OneDrive\\Desktop\\Chrome\\chromedriver_win32\\chromedriver.exe");
				
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	WebElement element =driver.findElement(By.name("email"));
	element.sendKeys("xxxxxxxxxx@gnmail.com");
	element =driver.findElement(By.name("pass"));
	element.sendKeys("xxxxxxxxx");
	element =driver.findElement(By.id("loginbutton"));
	element.click();
	
Thread.sleep(10000);

driver.quit();
	}

	
}
