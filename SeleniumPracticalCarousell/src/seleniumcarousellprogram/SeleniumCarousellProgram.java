package seleniumcarousellprogram;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumCarousellProgram {
public static void main(String[] args) throws InterruptedException {
		
   System.setProperty("webdriver.chrome.driver","D:\\\\SELENIUM\\\\DRIVERS\\\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
   driver.get("https://www.carousell.sg");
   
   driver.findElement(By.xpath("//p[text()='Fashion']")).click();
   Thread.sleep(2000);
   
   // Scroll Down
   /*JavascriptExecutor obj=((JavascriptExecutor)driver);
   obj.executeScript("window.scrollBy(0,600)","");   // Scroll Down
   Thread.sleep(2000);*/
   
   
   /*JavascriptExecutor obj=((JavascriptExecutor)driver);
   WebElement scrolldown=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[2]/div[1]/div/div/div/div/div/a[2]/button/div"));
   obj.executeScript("arguments[0].scrollIntoView(true)",scrolldown);
   Thread.sleep(8000);*/
   
   WebElement menfashions=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[2]/div[1]/div/div/div/div/div/a[2]"));
   menfashions.click();
   Thread.sleep(3000);
   
    
   WebElement FootWear=driver.findElement(By.xpath("//p[text()='Footwear']"));
   FootWear.click();
   Thread.sleep(5000);
   
   WebElement DressShoe=driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[2]/div/a[3]/img"));
   DressShoe.click();
   Thread.sleep(5000);
   
   
   
   
   
	
	
	}

}
