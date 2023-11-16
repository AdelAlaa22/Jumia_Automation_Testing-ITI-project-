package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.util.concurrent.TimeUnit;
public class TestBase
{
    public static WebDriver driver;

    @BeforeSuite
    public void StartDriver()
    {
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.navigate().to("https://www.jumia.com.eg");
    }
   @AfterSuite
   public void StopDriver()
   {
       driver.quit();
   }

}



