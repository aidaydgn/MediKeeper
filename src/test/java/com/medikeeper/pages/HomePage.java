package com.medikeeper.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    @FindBy(xpath = "//*[@id='menu-off-canvas']/li[7]/a")
    private WebElement requestADemoButton;


    public void clickOnRequestADemoButton(){
        wait.until(ExpectedConditions.elementToBeClickable(requestADemoButton)).click();

    }

}
