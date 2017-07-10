import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test_case_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
		// This test case  searches any desired product end choose it;
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\SeleniumProperties\\\\chromedriver.exe");
				
				WebDriver driver =new ChromeDriver();
				driver.get("http://www.etsy.com");
				
				
				driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				
				driver.manage().window().maximize();
				
				WebDriverWait wait = new WebDriverWait(driver,10);
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gnav-search\"]/div/div[2]/button")));
				
		        Actions a = new Actions(driver);
				a.moveToElement(driver.findElement(By.xpath("//*[@id=\"search-query\"]"))).click().keyDown(Keys.SHIFT).sendKeys("g").keyDown(Keys.SHIFT).sendKeys("ioielli").build().perform();
				
				driver.findElement(By.xpath("//*[@id=\"gnav-search\"]/div/div[2]/button")).click();
				
				
			
				WebDriverWait wait3 = new WebDriverWait(driver,10);
				
				Thread.sleep(5000);
			    // This web page load a different page for different time
			    // This is a problem to automate the web page
				WebElement imgSelects=null;
				// I have used a try catch method because there is been a problem to select the image;
				try {
						imgSelects = wait3.until(ExpectedConditions.visibilityOf(driver.findElements(By.
						cssSelector("[src=\"https://img1.etsystatic.com/191/0/10431623/il_340x270.1282067381_17i5.jpg\"]")).get(0)));
				}catch (Exception e) {};	
				
				if(driver.findElements(By.
						cssSelector("[src=\"https://img1.etsystatic.com/191/0/10431623/il_340x270.1282067381_17i5.jpg\"]")).get(0).isDisplayed())
				{
							imgSelects.click();
					System.out.println("img  trovata e cliccata");
				}
				
				else 
				{
						System.out.println("img NON trovata");
						driver.findElements(By.
								xpath("//*[@id=\"content\"]/div[1]/div/div[1]/div/div[2]/div[2]/div[1]/div/div[4]/div/div[1]/a/div[2]/div/div[1]")).
						get(0).click() ;

				}
				
		}
					
}
		
