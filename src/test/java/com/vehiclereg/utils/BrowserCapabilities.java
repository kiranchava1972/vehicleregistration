package com.vehiclereg.utils;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class BrowserCapabilities {
   // public WebDriver driver;
    public String baseURL = "https://www.gov.uk/get-vehicle-information-from-dvla";

    @Before
    public void bCapabilities() {
//        DesiredCapabilities capabilities;
//        System.out.println("Web Browser choosen is : " + browser);
//        System.out.println("Base URL is : "+baseURL);
//        switch (browser) {
//            case "ie":
//                //it is used to define IE capability
//                capabilities = DesiredCapabilities.internetExplorer();
//                capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
//                capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//                System.setProperty("webdriver.ie.driver", "D:\\Automation Projects\\vehicleregcheck\\src\\drivers\\IEDriverServer.exe");
//                //it is used to initialize the IE driver
//                WebDriver driver = new InternetExplorerDriver(capabilities);
//                driver.manage().window().maximize();
//                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//                driver.get(baseURL);
//                break;
//            case "ff":
                System.setProperty("webdriver.gecko.driver", "D:\\Automation Projects\\vehicleregcheck\\src\\drivers\\geckodriver.exe");
//                FirefoxOptions options = new FirefoxOptions();
//                options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"); //This is the location where you have installed Firefox on your machine
                WebDriver driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                driver.get(baseURL);
//                break;
//            case "chrome":
//                System.setProperty("webdriver.chrome.driver", "D:\\Automation Projects\\vehicleregcheck\\src\\drivers\\chromedriver.exe");
//                capabilities = DesiredCapabilities.chrome();
//                capabilities.setCapability(CapabilityType.SUPPORTS_ALERTS, true);
//                capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
//                driver = new ChromeDriver(capabilities);
//                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//                driver.manage().window().maximize();
//                driver.get(baseURL);
//                break;
//            default:
//                System.out.println("Browser selected to run test is invalid: " + browser);
//        }

//        driver.manage().window().maximize();
//
//        driver.get("http://gmail.com");
    }


//    @After
//    public void tearDownDriver() {
//        driver.close();
//    }
}
