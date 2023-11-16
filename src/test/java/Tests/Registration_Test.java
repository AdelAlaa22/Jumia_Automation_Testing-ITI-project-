package Tests;

import Pages.HomePage;
import Pages.Registration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Registration_Test extends TestBase{
HomePage HomePageObject;
Registration RegistrationPageObject;

@Test
    public void UserRegisterTest()
   {
    HomePageObject = new HomePage(driver);
    HomePageObject.ClickOnRegister();
    RegistrationPageObject=new Registration(driver);
    RegistrationPageObject.UserRegistration
    ("demoOjjoo_mail@outlook.com","AAAaaa123@","Adel","Alaa","1011029400","01221998");
    WebElement SuccessMessage = driver.findElement(By.cssSelector("#jm > main > div > section > div > header > h1"));
    Assert.assertTrue(SuccessMessage.getText().contains("Account Overview"));
    }
}
