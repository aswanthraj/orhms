package login;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test(enabled=false)
  public void f() throws IOException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver.exe");
	   driver=new ChromeDriver();
	 		driver.get("http://kalyanavaibhavam.com/");
	 		driver.manage().window().maximize();
	 		driver.findElement(By.xpath("html/body/div[1]/div/div/ul/li[4]/ul/li/a")).click();
	 		
	 		driver.findElement(By.xpath("html/body/div[1]/div/div/ul/li[4]/ul/li/ul/li[1]/div/div/form/div[1]/input")).sendKeys("koplu10@gmail.com");
	 		driver.findElement(By.xpath("html/body/div[1]/div/div/ul/li[4]/ul/li/ul/li[1]/div/div/form/div[2]/input")).sendKeys("123456");
	 		driver.findElement(By.xpath("html/body/div[1]/div/div/ul/li[4]/ul/li/ul/li[1]/div/div/form/div[4]/button")).click();
	 	
	 		driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div/button")).click();
	 		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/form/div/input")).click();
	 		Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\ashwanth.exe");
	 		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/form/div/div/button[2]")).click();
	 		driver.quit();
  }
}
