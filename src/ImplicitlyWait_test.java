import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitlyWait_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// In this main is described the differences between implicitly and explicitly wait
		
		// Explicit wait  example
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aless\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);//set the pageload to zero second 
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.phptravels.net/");
		
	
		// this wait using its methods reaches its timeout period until certain condition is satisfied;
			
		WebElement caricamento = wait.until(ExpectedConditions.elementToBeClickable(driver.findElements(By.cssSelector("[style=\"z-index: 3\"]")).get(1)));
		caricamento.click();
		
		driver.close();
		
		
		
		// Implicitly wait example
		
		driver = new ChromeDriver();
		
		driver.get("http://www.phptravels.net/");
		// Implicitly wait it's a global option timeout of the driver which will keep on searching for the element again and again for certain time period and if it is not found at last then it throws ‘NoSuchElementException’
		
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     // the driver must search an web element that not exists
	     // it could wait thirty seconds before throw an exception.
	     driver.findElement(By.id("sandrino")).click();
	     
		

	}

}
