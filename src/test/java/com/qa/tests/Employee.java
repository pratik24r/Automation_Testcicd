package com.qa.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;




public class Employee {
	//WebDriver driver;
		
	@Test
	public void Validate_url() throws InterruptedException {
		
	//	System.setProperty("webdriver.edge.driver", "/home/fs-pratik/Downloads/edgedriver_linux64 (1)/msedgedriver");
		WebDriverManager.chromedriver().setup(); ///home/fs-pratik/Downloads/edgedriver_linux64
	//	ChromeOptions opt = new ChromeOptions();
	//	opt.addArguments("--headless=new");
	    WebDriver driver = new ChromeDriver();
	//	Thread.sleep(30);
		driver.manage().window().maximize();
		driver.get("http://localhost:8181/azure-employee-2.2-SNAPSHOT/");
	}
	
/*	@Test
	public void launch() {
		driver.get("http://localhost:8181/azure-employee-2.2-SNAPSHOT/");
	}
	
	@Test
	public void user_name() {
	    driver.findElement(By.id("user_input")).sendKeys("pratik rathi");
	    driver.findElement(By.id("add_input")).sendKeys("pune");
	    driver.findElement(By.id("age_input")).sendKeys("25");
	    driver.findElement(By.id("quli_input")).sendKeys("BCCA");
	    driver.findElement(By.id("jd_input")).sendKeys("27");
	    driver.findElement(By.xpath("/html/body/div[2]/input")).click();
	}
	
	@Test
	public void loca() {
		 driver.findElement(By.id("add_input")).sendKeys("pune");
	}
	
	@Test
	public void age_per() {
		 driver.findElement(By.id("age_input")).sendKeys("25");
	}
	 
	
	@Test
	public void joining() {
		 driver.findElement(By.id("jd_input")).sendKeys("27");
	}
	
	@Test()
	public void click() {
		WebElement log = driver.findElement(By.xpath("/html/body/div[2]/input"));
	    log.click();
	}*/
		

	
	
	
	
}
