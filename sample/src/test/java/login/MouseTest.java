package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseTest extends loginTest {
 
	@Test(priority=1)
  public void gd () throws InterruptedException {
		
		
		//driver.findElement(By.xpath("//a[@id='menu__Performance']")).click();
		//a.moveToElement(driver.findElement(By.xpath("//a[@id='menu_performance_viewEmployeePerformanceTrackerList']"))).build().perform();
		
	WebElement w1=	driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
	Actions a=new Actions(driver);
	a.moveToElement(w1).build().perform();
		 
		WebElement w2=driver.findElement(By.xpath("//a[@id='menu_admin_Job']"));
	     Actions a1=new Actions(driver);
		a1.moveToElement(w2).build().perform();
        
		WebElement w3=driver.findElement(By.xpath("//a[text()='Job Titles']"));
	     Actions a2=new Actions(driver);
		a2.moveToElement(w3).build().perform();
		w3.click();


		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		a2.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		
		driver.quit();
		
	
		
		
	}
}
