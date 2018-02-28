package login;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddTest extends DashboardTest{
@Test(priority=3)
  public void fe() throws InterruptedException {
	  driver.findElement(By.xpath("html/body/div[1]/div[2]/ul/li[3]/a/b")).click();
	  driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[1]/img")).click();
	  while(true)
	  {
	  try {
		  driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		  driver.findElement(By.xpath("//a[text()='14']")).click();
		
	  
	  }catch(Exception e) {
		  
	 
		 // driver.findElement(By.xpath("//input[@id='calToDate']")).click();
		  driver.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[2]")).click();
		  Thread.sleep(3000);
		 // driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		 driver.findElement(By.xpath("//option[text()='Mar']")).click();
		  driver.findElement(By.xpath("//a[text()='21']")).click();
		  break;
	  
	 }
	  
}
	 
}
}
//driver.findElement(By.xpath("//a[text()='19']")).click();
//