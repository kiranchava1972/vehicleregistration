package com.vehiclereg.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class DVLAVehicleRegistraionDetailsPage {

    WebDriver driver;

    String pageTitle = "Check if a vehicle is taxed and has an MOT";

    By registrationNumber = By.id("Vrm");
    By continueBtn = By.name("Continue");


    public void setPassword(String regNo){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(registrationNumber).sendKeys(regNo);

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
