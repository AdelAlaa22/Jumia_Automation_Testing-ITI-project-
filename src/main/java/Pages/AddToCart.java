package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AddToCart extends PageBase
{
    public AddToCart(WebDriver driver)
    {
        super(driver);
    }
       By ChooseAnItem = By.xpath("//*[@id=\"jm\"]/main/div[2]/div[3]/section/div[1]/article[1]/a/div[1]/img");
       By ClickOnAddItemToCart = By.xpath("//*[@id=\"add-to-cart\"]/button");
    public void AddItemsToCart()
    {
        driver.findElement(ChooseAnItem).click();
        driver.findElement(ClickOnAddItemToCart).click();
    }

}
