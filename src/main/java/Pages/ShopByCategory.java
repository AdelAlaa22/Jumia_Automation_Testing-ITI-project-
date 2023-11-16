package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ShopByCategory extends PageBase
{
    public ShopByCategory(WebDriver driver)
    {
        super(driver);
    }
    By ClickOnCategory = By.cssSelector("#jm > header > section > div.col3.-df.-i-ctr > div");
    By ChooseCategory = By.xpath("//*[@id=\"dpdw-flyout-box\"]/div/div/a[9]/span");
    By ChooseTheSection = By.xpath("//img[@alt='Laptops']");
    By ChooseItemModel = By.xpath("//img[@alt='Huawei MateBook B3-420 Laptop - Core I5-1135G7 - 8GB RAM - 512GB SSD - Iris XE GPU - 14in FHD - Space Gray - DOS \"No Windows\"']");
    By ClickOnAddItemToCart = By.xpath("//button[@class='add btn _prim -pea _i -fw']//span[contains(text(),'Add to cart')]");
    public void AddItemToCartFromCategoryList()
    {
        driver.findElement(ClickOnCategory).click();
        driver.findElement(ChooseCategory).click();
        driver.findElement(ChooseTheSection).click();
        driver.findElement(ChooseItemModel).click();
        driver.findElement(ClickOnAddItemToCart).click();

    }
}