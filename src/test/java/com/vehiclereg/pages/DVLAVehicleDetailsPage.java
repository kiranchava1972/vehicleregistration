package com.vehiclereg.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DVLAVehicleDetailsPage {

    WebDriver driver;

    String pageTitle = "Check if a vehicle is taxed and has an MOT";

    By vehicleRegNo = By.cssSelector(".reg-mark");
    By taxData1 = By.xpath(".//main/div[2]/div[1]/div[1]/h2");
    By taxData2 = By.xpath(".//main/div[2]/div[1]/div[1]/p");

    By motData1 = By.xpath(".//main/div[2]/div[2]/div[1]/h2");
    By motData2 = By.xpath(".//main/div[2]/div[1]/div[1]/p");

    By vehicleManufacturer = By.xpath(".//main/div[4]/div/ul/li[1]/span[2]/strong");
    By vehicleColor = By.xpath(".//main/div[4]/div/ul/li[9]/span[2]/strong");



//Is this the vehicle you are looking for?


    public void setPassword(String regNo){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElement(registrationNumber).sendKeys(regNo);

    }


    public void clickStartNow(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElement(continueBtn).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    public void completeEnterVehicleInfoPage() {
        String ptitle = driver.getTitle();
        System.out.println("Page title is : "+ptitle);
        Assert.assertEquals(ptitle.equals(pageTitle),"Check Vehicle Ino page title is matched");
        clickStartNow();
    }
}
