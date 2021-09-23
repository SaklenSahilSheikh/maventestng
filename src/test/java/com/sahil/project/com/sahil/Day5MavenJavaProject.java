package com.sahil.project.com.sahil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day5MavenJavaProject {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004944\\Desktop\\Sep 2021\\16-9-2021\\driver\\chromedriver.exe");
	    WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		String title=d.getTitle();
		System.out.println("this is the title "+title);
		Thread.sleep(2000);
		d.close();

	}

}
