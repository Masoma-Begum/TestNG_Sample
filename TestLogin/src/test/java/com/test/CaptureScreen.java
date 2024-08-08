package com.test;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CaptureScreen{

	/*public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Mango",Keys.ENTER);
		
		TakesScreenshot capture = (TakesScreenshot)driver;
		File file =  capture.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./Screenshots/Image1.png"));
		
		driver.quit();		

	}*/
	
    public static String captchaimage;
	@Test
	public void faildTests() throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("apple",Keys.ENTER);
		
		
		/*//If image is not existing according to this time an image will be create with time
		  if(captchaimage == null) {
			  LocalTime time = LocalTime.now();
			  DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH-mm-ss");
			  captchaimage = time.format(timeFormatter);	  
		  }
	    //A folder will be create according to current date
		  LocalDate date = LocalDate.now();
		  DateTimeFormatter folderFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy/");
		  String folder = date.format(folderFormatter);
		  
			File sourceFile =  ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Screenshots/"+folder+captchaimage+"img1");
			FileUtils.copyFile(sourceFile,destFile);*/
			
	        Thread.sleep(5000);
	        driver.quit();

		  
		
	}

}
