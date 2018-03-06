package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AdminTest extends loginTest  {
  @Test(priority=1)
  public void a() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("html/body/div[1]/div[2]/ul/li[1]/a/b")).click();
	  driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).sendKeys("00001");
	  WebElement a1=driver.findElement(By.xpath("//select[@id='searchSystemUser_userType']"));
	  Select a2=new Select(a1);
	  a2.selectByVisibleText("ESS");
	  Select a3=new Select(driver.findElement(By.xpath("//select[@id='searchSystemUser_status']")));
	  a3.selectByValue("");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@id=\"searchBtn\"]")).click();
	
	   
	//  driver.navigate().back();
  }
}
