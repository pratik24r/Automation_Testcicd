package com.qa.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.AssertJUnit;

public class Employee {
		
	@BeforeClass
	public void Validate_url() throws InterruptedException {
		
		System.setProperty("webdriver.edge.logfile", "/home/fs-pratik/Downloads/edgedriver_linux64 (1)/msedgedriver");
	//	WebDriverManager.edgedriver().setup(); ///home/fs-pratik/Downloads/edgedriver_linux64
	//	EdgeOptions opt = new EdgeOptions();
	//	opt.addArguments("--headless=new");
		WebDriver driver = new EdgeDriver();
		Thread.sleep(30);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");

	}
	@Test
	public void sum() {
		System.out.println("sum");
		int a = 10;
		int b = 20;
		AssertJUnit.assertEquals(30, a+b);
	}
	@Test
	public void sub() {
		System.out.println("sub");
		int a = 10;
		int b = 20;
		AssertJUnit.assertEquals(10, b-a);
	}
	@Test
	public void mul() {
		System.out.println("mul");
		int a = 10;
		int b = 20;
		AssertJUnit.assertEquals(200, a*b);
	}
	@Test
	public void div() {
		System.out.println("div");
		int a = 10;
		int b = 20;
		AssertJUnit.assertEquals(2, b/a);
	}
	
}
