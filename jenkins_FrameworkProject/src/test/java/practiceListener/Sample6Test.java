package practiceListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.comcast.crmlistenerutility.BaseClassUtility;

@Listeners(com.comcast.crmlistenerutility.ListImpclass.class)
public class Sample6Test extends BaseClassUtility{
	
@Test(groups= {"smokeTest"} )
	
	public void sampleMethList() throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("http://localhost:8888/");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("password");
	driver.findElement(By.id("submitButton")).click();
	
	driver.findElement(By.linkText("Organizations")).click();
	driver.findElement(By.xpath("//img[@alt='Create Organization...']"));
	driver.quit();
	System.out.println("click on org and close");

}
	
	
	@Test(groups= {"regressionTest"})
	public void sampleMethod2() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("password");
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//img[@alt='Create Contact...']"));
		driver.quit();
		System.out.println("click on contact and close");
		
	}

}
