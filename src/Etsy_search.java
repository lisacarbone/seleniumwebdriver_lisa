import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Etsy_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\driverchrome\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.etsy.com");
		
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gnav-search\"]/div/div[2]/button")));
		
        Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"search-query\"]"))).click().keyDown(Keys.SHIFT).sendKeys("g").keyDown(Keys.SHIFT).sendKeys("ioelli").build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"gnav-search\"]/div/div[2]/button")).click();
		
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		/*try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//WebDriverWait wait2 = new WebDriverWait(driver,10);
		/*boolean c=true;
		c = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gnav-account-cart-description\"]"))).isDisplayed();
		
		if (c==true){*/
		
				//wait.until(ExpectedConditions.elementToBeClickable(driver.findElements(By.cssSelector("[src*=\".jpg\"]")).get(0)));
		
			
				
				//driver.findElements(By.cssSelector("[src*=\".jpg\"]")).get(0).click();
			
			
		/*}
		
		else{
			System.out.println("Cant find the Element ");
		}*/
		/*WebDriverWait wait3 = new WebDriverWait(driver,10);
	    WebElement s = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"content\"]/div[1]/div/div[1]/div/div[2]/div[2]/div[18]/div[1]/a/div/div[1]")));
	    s.click();*/
	}
}


