package steps;

import com.google.inject.Inject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class Stepdefs {

    WebDriver driver;
    @Inject
    private Properties properties;

    //    System.setProperty("webdriver.gecko.driver","D:\\Firefox\\geckodriver.exe");
//    WebDriver driver = new FirefoxDriver();
    String url = "https://www.gov.uk/get-vehicle-information-from-dvla";
//    public void bCapabilities()
//    {
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        driver.get( "https://www.gov.uk/get-vehicle-information-from-dvla");
//    }

//    @Given("^I delete the cookies in the browser$")
//    public void iDeleteTheCookiesInTheBrowser() throws Throwable {
//        System.setProperty("webdriver.gecko.driver", "D:\\Valtechcom\\src\\test\\java\\com\\valtech\\Browserdrivers\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().deleteAllCookies();
//    }
//
//    @When("^I launch the govuk website$")
//    public void iLaunchTheGovukWebsite() throws Throwable {
////        driver.manage().window().maximize();
////        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////        System.out.println(properties.getProperty("vehicleRegURL"));
////        driver.get(properties.getProperty("vehicleRegURL"));
//        bCapabilities();
//    }
//
//    //Step to close the browser
//    @And("^I close the Browser$")
//    public void iCloseTheBrowser() throws Throwable {
//        // driver.quit();
//        driver.close();
//    }
//
//    @Then("^I should be on the \"([^\"]*)\" page$")
//    public void iShouldBeOnThePage(String arg0) throws Throwable {
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        String ptitle = driver.getTitle();
//        System.out.println("The page title is : " + ptitle);
//        Assert.assertEquals(ptitle, arg0);
//    }
//
//
//
//
//    @And("^I enter registration number$")
//    public void iEnterRegistrationNumber() throws Throwable {
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElement(By.id("Vrm")).sendKeys("X131 KCR");
//        String ptitle = driver.getTitle();
//        System.out.println("The page title is : " + ptitle);
//    }
//
//    @When("^I click on continue button$")
//    public void iClickOnContinueButton() throws Throwable {
//        driver.findElement(By.xpath("//div/div[2]/fieldset/button")).click();
//    }
//
//    @When("^I click on start button$")
//    public void iClickOnStartButton() throws Throwable {
//        driver.findElement(By.xpath("//div/div[1]/div/section[1]/p/a")).click();
//        // driver.findElement(By.id("get-started")).click();
//        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }



//    @Given("^Directory contains list of files$")
//    public void directoryContainsListOfFiles() throws Throwable {
//
//    }
//
//    @When("^I retrieve files names information$")
//    public void iRetrieveFilesNamesInformation() throws Throwable {
//
//    }
//
//    @When("^I retrieve files mime information$")
//    public void iRetrieveFilesMimeInformation() throws Throwable {
//
//    }
//
//    @When("^I retrieve files exteshions information$")
//    public void iRetrieveFilesExteshionsInformation() throws Throwable {
//
//    }
//
//    @When("^I retrieve files size information$")
//    public void iRetrieveFilesSizeInformation() throws Throwable {
//
//    }



    @Given("^Directory contains list of files$")
    public void directoryContainsListOfFiles() throws Throwable {
        System.out.println("dsdsd ssd");
    }


    @Given("^I delete the cookies in the browser$")
    public void iDeleteTheCookiesInTheBrowser() throws Throwable {
        System.setProperty("webdriver.gecko.driver", "D:\\Automation Projects\\vehicleregcheck\\src\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get(url);
    }

    @When("^I launch the govuk website$")
    public void iLaunchTheGovukWebsite() throws Throwable {
       driver.navigate().to(url);
//        bCapabilities();
    }

    @Then("^I should be on the \"([^\"]*)\" page$")
    public void iShouldBeOnThePage(String arg0) throws Throwable {
        System.out.println("fsdfsfs ");
    }

    @When("^I click on start button$")
    public void iClickOnStartButton() throws Throwable {
        System.out.println("fsdfsfs ");
    }

    @And("^I enter registration number$")
    public void iEnterRegistrationNumber() throws Throwable {
        System.out.println("fsdfsfs ");
    }

    @When("^I click on continue button$")
    public void iClickOnContinueButton() throws Throwable {
        System.out.println("fsdfsfs ");
    }

    @And("^I close the Browser$")
    public void iCloseTheBrowser() throws Throwable {
        System.out.println("fsdfsfs ");
    }
}
