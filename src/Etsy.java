import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Etsy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumProperties\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.etsy.com");
		
		Actions a = new Actions(driver); 
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"catnav-primary-link-1179-link\"]"))).click().build().perform();

		
		WebDriverWait wait= new WebDriverWait(driver,10);
	
	        WebElement r = wait.until(ExpectedConditions.elementToBeClickable(By.id("category-nav-side-nav-1217-link")));
		
		r.click();
		
		driver.findElement(By.linkText("Ciondoli")).click();
		driver.close();
	}

}
