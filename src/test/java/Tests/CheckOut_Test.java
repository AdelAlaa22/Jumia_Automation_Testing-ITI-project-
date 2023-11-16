package Tests;

import Pages.CheckOut;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CheckOut_Test extends TestBase
{
    CheckOut CheckOutObject;
    @Test
    public void CheckOutTest()
    {
        CheckOutObject=new CheckOut(driver);
        CheckOutObject.CheckOutItem();
        WebElement SuccessfullyMsg = driver.findElement(By.cssSelector("#jm > main > div > div:nth-child(1) > div > div.col12.-pvs > article > div > h1"));
        Assert.assertTrue(SuccessfullyMsg.getText().contains("Thank you for placing an order on Jumia!"));
    }
}
