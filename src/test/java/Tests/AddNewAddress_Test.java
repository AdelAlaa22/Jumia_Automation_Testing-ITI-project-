package Tests;

import Pages.AddNewAddress;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddNewAddress_Test extends TestBase
{
    AddNewAddress AddNewAddressObject;
    @Test
    public void AddNewAddressTest()
    {
        AddNewAddressObject = new AddNewAddress(driver);
        AddNewAddressObject.AddNewAddress ("9 - Mydan El Horreya - ain shams");
         WebElement SuccessMessage = driver.findElement(By.cssSelector("#jm > aside > div > div"));
        Assert.assertTrue(SuccessMessage.getText().contains("successfully"));
    }
}

