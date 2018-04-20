package com.vehiclereg.pages;

import com.google.inject.Inject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DVLAStartPage {

    @Inject
    private Properties properties;

    WebDriver driver;

    String pageTitle = "Get vehicle information from DVLA - GOV.UK";

    By startBtn = By.cssSelector("p[id*='get-started'] a");



    public void launchVeicleRegistationURL() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println(properties.getProperty("vehicleRegURL"));
        driver.get(properties.getProperty("vehicleRegURL"));
    }

    public void clickStartNow() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(startBtn).click();
    }


    public void completeVehicleInfoPage() {
        String ptitle = driver.getTitle();
        System.out.println("Page title is : " + ptitle);
        Assert.assertEquals(ptitle.equals(pageTitle), "Start page title is matched");
        clickStartNow();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
