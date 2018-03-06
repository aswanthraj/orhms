package login;

import org.testng.annotations.Test;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class loginTest {
	WebDriver driver;
	
	public void takescreenshot(String str) throws Exception{
		  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);// screenshot will be captured
		
		//  FileUtils.copyFile(f, new File("D:\\\\aswanth\\\\screenshot\"+str+\".png"+str+".png"));		

	}
		  	
	@Test
  public void g() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver.exe");
	   driver=new ChromeDriver();
	  
	
	 		driver.get("http://opensource.demo.orangehrmlive.com/");
	 		driver.manage().window().maximize();
	 		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	 		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
	 		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	 		takescreenshot("home link");
	 		
	 		//takescreenshot("login");
	 		
	 	
  
  }
	//public void takeScreenShot(String str) throws Exception{
		//File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);// screenshot will be captured
		//FileUtils.copyFile(f, new File("D:\\aswanth\\screenshot"+str+".png"));		
			}
  
 
  
	  
  
  
  
  
  


