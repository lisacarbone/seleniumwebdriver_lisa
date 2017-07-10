import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\SeleniumProperties\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.etsy.com");
		
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gnav-search\"]/div/div[2]/button")));
		
        Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"search-query\"]"))).click().keyDown(Keys.SHIFT).sendKeys("g").keyDown(Keys.SHIFT).sendKeys("ioelli").build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"gnav-search\"]/div/div[2]/button")).click();
		}

}
