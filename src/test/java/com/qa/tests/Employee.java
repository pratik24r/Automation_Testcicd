package com.qa.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.AssertJUnit;

public class Employee {
	
		
	@BeforeClass
	public void Validate_url() {
		
		System.setProperty("webdriver.edge.driver", "/home/fs-pratik/Downloads/edgedriver_linux64/msedgedriver");
	//	WebDriverManager.edgedriver().setup(); ///home/fs-pratik/Downloads/edgedriver_linux64
		WebDriver driver = new EdgeDriver();
		
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
