package com.demo.learning_continue;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {
    
	@org.testng.annotations.Test
	public void loginTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		WebElement submit=driver.findElement(By.id("submit"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
	
		js.executeScript("arguments[0].scrollIntoView(true);", submit);
		submit.click(); 
		
		
		
	}

}
