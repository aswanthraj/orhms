package login;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DashboardTest extends AdminTest {
  @Test(priority=2)
  public void b() {
	  driver.findElement(By.xpath("html/body/div[1]/div[2]/ul/li[7]/a/b")).click();
	
  
  }
 /* @AfterTest
  public void afterTest() {
	driver.findElement(By.xpath("//a[@id='welcome']")).click();
	driver.findElement(By.xpath("//a[text()='Logout']")).click();;
  }*/
}
