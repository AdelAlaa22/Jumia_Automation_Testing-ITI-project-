package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public  class Registration extends PageBase
{
    public Registration(WebDriver driver)
    {
        super(driver);
    }
    By EnterEmailTexBox = By.id("input_identifierValue");
    By ClickOnContinueButton =By.cssSelector("body > div > div.card > form > div.ctx-identification.flow-layout > div:nth-child(3) > div.mdc-touch-target-wrapper > button");
    By EnterPasswordTxtBox = By.cssSelector("input[name='password']");
    By ConfirmPasswordTxtBox = By.cssSelector(".mdc-text-field__input.confirm-password-input");
    By ClickOnContinueButton2 = By.xpath("//*[@id=\"card_password\"]/div[5]/div/button");
    By EnterFirstNameTxtBox = By.id("input_first_name");
    By EnterLastNameTxtBox = By.id("input_last_name");
    By EnterPhoneTxtBox = By.cssSelector("input[name='phone[number]']");
    By ClickOnContinueButton3 = By.cssSelector("#card_profile_details > div.actions > div > button");
    By ClickOnGenderList = By.cssSelector(".mdc-select__anchor[aria-labelledby='outlined-select-label'][aria-required='true']");
    By ChooseGender = By.cssSelector("li[data-value='M']");
    By EnterBirthDayTxtBox = By.id("input_birth_date");
    By CheckBox = By.id("acceptTC");
    By ClickOnContinueButton4 = By.cssSelector("#confirmBtn");
    By ClickOnGetStartButton = By.cssSelector("#form_success > div > div > div.actions > div > button > span.mdc-button__touch");
    public void UserRegistration(String email, String password, String firstname, String lastname, String phone, String birthday)
    {
        driver.findElement(EnterEmailTexBox).sendKeys(email);
        driver.findElement(ClickOnContinueButton).click();
        driver.findElement(EnterPasswordTxtBox).sendKeys(password);
        driver.findElement(ConfirmPasswordTxtBox).sendKeys(password);
        driver.findElement(ClickOnContinueButton2).click();
        driver.findElement(EnterFirstNameTxtBox).sendKeys(firstname);
        driver.findElement(EnterLastNameTxtBox).sendKeys(lastname);
        driver.findElement(EnterPhoneTxtBox).sendKeys(phone);
        driver.findElement(ClickOnContinueButton3).click();
        driver.findElement(ClickOnGenderList).click();
        driver.findElement(ChooseGender).click();
        driver.findElement(EnterBirthDayTxtBox).sendKeys(birthday);
        driver.findElement(CheckBox).click();
        driver.findElement(ClickOnContinueButton4).click();
        driver.findElement(ClickOnGetStartButton).click();
    }
}










