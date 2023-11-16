package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AddNewAddress extends PageBase
{
    public AddNewAddress(WebDriver driver)
    {
        super(driver);
    }
        By ClickOnAddressBookLink = By.xpath ("//*[@id=\"jm\"]/main/div/div[1]/nav/a[9]");
        By ClickOnAddNewAddressButton = By.xpath ("//*[@id=\"jm\"]/main/div/section/div/div/div/a");
        By EnterAddressTxtBox = By.id ("fi-address1");
        By ClickOnSelectCityList = By.id("fi-cityId");
        By SelectCity = By.xpath("//*[@id=\"fi-cityId\"]/option[2]");
        By ClickOnSaveButton = By.xpath ("//*[@id=\"addressForm\"]/div[5]/div/button");

    public void AddNewAddress (String Address)
    {
        driver.findElement(ClickOnAddressBookLink).click();
        driver.findElement(ClickOnAddNewAddressButton).click();
        driver.findElement(EnterAddressTxtBox).sendKeys(Address);
        driver.findElement(ClickOnSelectCityList).click();
        driver.findElement(SelectCity).click();
        driver.findElement(ClickOnSaveButton).click();
    }

}



