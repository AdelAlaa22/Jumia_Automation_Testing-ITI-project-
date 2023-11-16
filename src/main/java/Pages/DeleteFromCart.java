package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class DeleteFromCart extends PageBase
{
    public DeleteFromCart(WebDriver driver)
    {
        super(driver);
    }
    By ClickOnCart = By.xpath("//*[@id=\"jm\"]/header/section/div[2]/a");
    By ClickOnRemoveButton = By.xpath("//*[@id=\"jm\"]/main/div/div[1]/article/article[2]/footer/button");
    By ConfirmRemovingItem = By.xpath("//*[@id=\"pop\"]/div/section/div/div/form[2]/button/span");
    public void RemoveItemFromCart()
    {
        driver.findElement(ClickOnCart).click();
        driver.findElement(ClickOnRemoveButton).click();
        driver.findElement(ConfirmRemovingItem).click();
    }
}
