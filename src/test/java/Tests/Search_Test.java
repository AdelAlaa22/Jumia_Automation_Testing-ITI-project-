package Tests;

import Pages.Search;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Search_Test extends TestBase{

    Search SearchObject;
    @Test
    public void SearchBarTest()
    {
        SearchObject = new Search(driver);
        SearchObject.SearchForItem("Redmi Note 12 Pro");
         WebElement ProductFoundMessage = driver.findElement(By.cssSelector
         ("#jm > main > div.aim.row.-pbm > div.-pvs.col12 > section > header > div.-phs.-mh-48px.-df.-j-bet.-i-ctr.-bb > p"));
        Assert.assertTrue(ProductFoundMessage.getText().contains("products found"));
    }

}
