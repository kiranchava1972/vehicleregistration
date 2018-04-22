package com.test.steps;

import com.google.inject.Inject;
import com.test.pages.JavaFilesInformation;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class Stepdefs {

    private WebDriver driver;


    @Inject
    private JavaFilesInformation javaFilesInformation;

    String baseURL = "https://www.gov.uk/get-vehicle-information-from-dvla";
    String workingDIR = null;


    @Given("^Directory contains list of files$")
    public void directoryContainsListOfFiles() throws Throwable {
        workingDIR = "testdir";
    }

    @When("^I retrieve files names information$")
    public void iRetrieveFilesNamesInformation() throws Throwable {
        javaFilesInformation.listFiles(workingDIR);
    }

    @When("^I retrieve files mime information$")
    public void iRetrieveFilesMimeInformation() throws Throwable {
        javaFilesInformation.listFileMimeTypes(workingDIR);
    }

    @When("^I retrieve files extensions information$")
    public void iRetrieveFilesExtensionsInformation() throws Throwable {
        javaFilesInformation.getExtension(workingDIR);
    }

    @When("^I retrieve files size information$")
    public void iRetrieveFilesSizeInformation() throws Throwable {
        javaFilesInformation.whenGetFileSize_thenCorrect(workingDIR);


    }


    @And("^I close the Browser$")
    public void iCloseTheBrowser() throws Throwable {
        System.out.println("close driver");
        driver.quit();
    }


    @Given("^govuk website and I launch it$")
    public void govukWebsiteAndILaunchIt() throws Throwable {
        System.setProperty("webdriver.gecko.driver", "D:\\Automation Projects\\vehicleregcheck\\src\\browserdrivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        System.out.println(baseURL);
        driver.get(baseURL);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Then("^I should be on the \"([^\"]*)\" page$")
    public void iShouldBeOnThePage(String arg0) throws Throwable {
        System.out.println(arg0);

    }

    @When("^I click on start button$")
    public void iClickOnStartButton() throws Throwable {
        String ptitle = driver.getTitle();
        System.out.println("Page title is : " + ptitle);
        Assert.assertEquals(ptitle, "Get vehicle information from DVLA - GOV.UK");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.cssSelector("p[id*='get-started'] a")));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @When("^I enter registration number and I click on continue button$")
    public void iEnterRegistrationNumberAndIClickOnContinueButton() throws Throwable {
        String ptitle = driver.getTitle();
        System.out.println("Page title is : " + ptitle);
        Assert.assertEquals(ptitle, "Get vehicle information from DVLA - GOV.UK");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("Vrm")).sendKeys( javaFilesInformation.readData());
//        driver.findElement(By.id("Vrm")).sendKeys("X131 KCR");
        driver.findElement(By.name("Continue")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^I validate Vehicle details and I click on continue button$")
    public void iValidateVehicleDetailsAndIClickOnContinueButton() throws Throwable {
        String ptitle = driver.getTitle();
        System.out.println("Page title is : " + ptitle);
        Assert.assertEquals(ptitle, "Check if a vehicle is taxed and has an MOT");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.findElement(By.tagName("h1")).getText());
        System.out.println(driver.findElement(By.cssSelector(".list-summary-item")).getText());
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.id("Correct_True")));
        System.out.println(driver.findElement(By.cssSelector(".application-notice.info-notice.info-notice-bold.group>p")).getText());
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.name("Continue")));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And("^I validate Vehicle details$")
    public void iValidateVehicleDetails() throws Throwable {
        String ptitle = driver.getTitle();
        System.out.println("Page title is : " + ptitle);
        Assert.assertEquals(ptitle, "Check if a vehicle is taxed and has an MOT");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.findElement(By.tagName("h1")).getText());
        System.out.println(driver.findElement(By.xpath(".//main/div[2]/div[2]/div[1]/h2")).getText());
        System.out.println(driver.findElement(By.xpath(".//main/div[2]/div[1]/div[1]/p")).getText());
        Assert.assertEquals(driver.findElement(By.xpath(".//main/div[4]/div/ul/li[1]/span[2]/strong")).getText(), "HONDA");
        Assert.assertEquals(driver.findElement(By.xpath(".//main/div[4]/div/ul/li[9]/span[2]/strong")).getText(), "SILVER");
        System.out.println(driver.findElement(By.xpath(".//main/div[4]/div/ul/li[1]/span[2]/strong")).getText());
        System.out.println(driver.findElement(By.xpath(".//main/div[4]/div/ul/li[9]/span[2]/strong")).getText());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }



}
