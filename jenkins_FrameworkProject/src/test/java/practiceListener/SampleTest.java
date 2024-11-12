package practiceListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.comcast.crmlistenerutility.BaseClassUtility;

@Listeners(com.comcast.crmlistenerutility.ListImpclass.class)
public class SampleTest extends BaseClassUtility{
	
	@Test(groups= {"regressionTest"})
	
	public void sampleMethList() throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("http://localhost:8888/");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("password");
	driver.findElement(By.id("submitButton")).click();
	Thread.sleep(3000);
	driver.quit();
	System.out.println("Login to the application and close");

}
	
	
	@Test(groups= {"smokeTest"} )
	public void sampleMethod3() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888/");
		Thread.sleep(3000);
		driver.quit();
		System.out.println("launch the browser and close");
		
	}
}