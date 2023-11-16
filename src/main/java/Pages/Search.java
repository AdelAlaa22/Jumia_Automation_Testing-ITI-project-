package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Search extends PageBase{
    public Search(WebDriver driver)
    {
        super(driver);
    }
        By EnterItemNameInSearchBar = By.id("fi-q");
        By ClickOnSearchButton = By.xpath ("//*[@id=\"search\"]/button");
    public void SearchForItem(String ItemName)
    {
        driver.findElement(EnterItemNameInSearchBar).sendKeys(ItemName);
        driver.findElement(ClickOnSearchButton).click();
    }
    }







