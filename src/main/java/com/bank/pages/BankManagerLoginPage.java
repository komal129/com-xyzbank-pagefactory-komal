package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Add Customer')]")
    WebElement addCustomerTab;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Open Account')]")
    WebElement openAccount;

    public BankManagerLoginPage() {
        PageFactory.initElements(driver, this);
    }
    public void clickOnAddCustomerTab(){
        Reporter.log("Clicking on add customer button" + addCustomerTab.toString());
        clickOnElement(addCustomerTab);
    }
    public void addOpenAccountTab(){
        Reporter.log("Clicking on open account tab" + openAccount.toString());
        clickOnElement(openAccount);
    }

}
