package com.quinbay.Temp.Action;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CucumberHooks {
    WebDriver driver;
    @Before
    public void testbefore() {
        System.out.println("facebook");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        driver = new ChromeDriver();
    }

}


