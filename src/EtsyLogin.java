import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EtsyLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\driverchrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.etsy.com");
         driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Accedi")).click();
		
         WebDriverWait wait = new WebDriverWait(driver,10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signin-button")));
         
		driver.findElement(By.xpath("//*[@id=\"username-existing\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"username-existing\"]")).sendKeys("annalisa_carbone@virgilio.com");
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("[id=\"password-existing\"]"))).click().sendKeys("sleepy").build().perform();
		  
		driver.findElement(By.id("signin-button")).click();
		
		

	}

}
