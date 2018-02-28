package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class loginTest {
	WebDriver driver;
  @Test(priority=0)
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver.exe");
	   driver=new ChromeDriver();
	 		driver.get("http://opensource.demo.orangehrmlive.com/");
	 		driver.manage().window().maximize();
	 		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	 		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
	 		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	 	
  }

}
