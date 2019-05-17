package com.CA.qa.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class try111 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
	driver.get("http://172.16.15.16:8080/AdminPortal/login.jsp");
	driver.findElement(By.id("j_username")).sendKeys("ca_testing");
	driver.findElement(By.id("j_password")).sendKeys("ca_testing");
	driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div[1]/div/div/div/div/div[2]/form/div[2]/div[3]/button")).click();
	driver.findElement(By.id("ConfigurationMenu")).click();
	driver.findElement(By.id("FwpNumberMenu")).click();
	driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div[1]/div[2]/div/div/div/div[1]/div/span[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"fwpNumberForm_button_save\"]")).click();
	}
	}

