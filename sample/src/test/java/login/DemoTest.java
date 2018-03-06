package login;

import java.io.File;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {
	WebDriver driver;
	public void takescreenshot(String str) throws Exception{
		  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);// screenshot will be captured
		
		  FileUtils.copyFile(f, new File("D:\\\\aswanth\\\\screenshot\"+str+\".png"));		

	}
  @Test
  public void f() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://www.redbus.in/");
	   takescreenshot("home link");
	   
	   
  }
}
