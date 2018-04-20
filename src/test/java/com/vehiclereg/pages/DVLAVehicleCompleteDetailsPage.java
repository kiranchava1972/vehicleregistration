package com.vehiclereg.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DVLAVehicleCompleteDetailsPage {

    WebDriver driver;

    String pageTitle = "Check if a vehicle is taxed and has an MOT";


    By pageHeading = By.tagName("h1");
    By vehicleData = By.cssSelector(".list-summary-item");
    By yesRadio = By.id("Correct_True");
    By noRadio = By.id("Correct_False");
    By continueBtn = By.name("Continue");
    By incorrectVehicleDetailsLink = By.linkText("Incorrect vehicle details?");
    By details = By.cssSelector(".application-notice.info-notice.info-notice-bold.group>p");


//Is this the vehicle you are looking for?


    public void setPassword(String regNo){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElement(registrationNumber).sendKeys(regNo);

    }


    public void clickStartNow(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(continueBtn).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    public void completeEnterVehicleInfoPage() {
        String ptitle = driver.getTitle();
        System.out.println("Page title is : "+ptitle);
        Assert.assertEquals(ptitle.equals(pageTitle),"Check Vehicle Ino page title is matched");
        clickStartNow();
    }
}
