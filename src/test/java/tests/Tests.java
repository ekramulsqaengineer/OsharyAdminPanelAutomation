package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class Tests extends Base{
	 WebDriver driver;
	 @Test
	 public void PrintInvoice() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		ExtentTest test1 = extent.createTest("Oshary Admin", "Oshary Admin Application Test Case");
		
		test1.log(Status.INFO, "PrintInvoice");
		driver.get("http://172.16.150.145:3001/admin/login");
		//driver.manage().window().maximize();
		
		test1.log(Status.INFO, "Open Oshary Admin Panel");
		//test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test1.addScreenCaptureFromPath("screenshot.png");
		 
		Thread.sleep(1000);
		driver.findElement(By.id("logemail")).sendKeys("admin12345");
		test1.log(Status.INFO, "Set User Name");
		//test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test1.addScreenCaptureFromPath("screenshot.png");
		
		Thread.sleep(1000);
		driver.findElement(By.id("logpass")).sendKeys("logicwise.fi");
		test1.log(Status.INFO, "Set Password");
		//test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test1.addScreenCaptureFromPath("screenshot.png");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div/div/form/div/div/div/button/a")).click();
		test1.log(Status.INFO, "Click Submit Button");
		//test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test1.addScreenCaptureFromPath("screenshot.png");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Orders']")).click();
		test1.log(Status.INFO, "Click Order Menu");
		test1.addScreenCaptureFromPath("screenshot.png");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='OPID-LDISSVFP']")).click();
		test1.log(Status.INFO, "Click OPID-LDISSVFP Order Number");
		test1.addScreenCaptureFromPath("screenshot.png");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='text']")).click();
		test1.log(Status.INFO, "Click Invoice Button");
		test1.addScreenCaptureFromPath("screenshot.png");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Print']")).click();
		test1.log(Status.INFO, "Click Print Button");
		test1.log(Status.INFO, "Test Complite");
		test1.addScreenCaptureFromPath("screenshot.png");
		System.out.println("Test Pass");
		driver.close();
		// Create the object of the Select class
		//Thread.sleep(1000);
		//Select se = new Select(driver.findElement(By.className("md-selec")));
					
		// Select the option using the visible text
		//se.selectByVisibleText("See more...");
		//se.selectByVisibleText("HPB0227A53EAFD (HP Laser MFP 131 133 135-138)");
		
		
		
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id=\"destinationSelect\"]//print-preview-settings-section/div/select")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"destination_1\"]/print-preview-destination-list-item//span[1]")).click();
		
		
		
	 }
	 
	 
	 
	 
}
