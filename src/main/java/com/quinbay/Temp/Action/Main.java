package com.quinbay.Temp.Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Main {

    //private static String user_name
    //private static String password
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriver driver=new ChromeDriver(cap);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://wwwuata.gdn-app.com/member/order/digital/completed");


        Thread.sleep(5000);
        //Home_Action obj = new Home_Action(driver);
        //Thread.sleep(5000);
        //obj.Login(user_name"syakapurs@gmail.com",password "sudhashiv@97");
        //WebElement Login_button= driver.findElement(By.xpath("//button[@class='blu-btn btn__login b-outline b-small']"));
        //Login_button.click();
       // WebElement user_name= driver.findElement(By.xpath("//input[@class='form__input login__username']"));
       // user_name.click();
        //user_name.sendKeys("arpitha.riya@mailinator.com");
        //Thread.sleep(3000);
        //WebElement password= driver.findElement(By.xpath("//input[@class='form__input login__password']"));
        //password.click();
        //password.sendKeys("Blibli@123456");
        //WebElement Masuk= driver.findElement(By.xpath("//button[@class='blu-btn b-full-width b-secondary']"));
        //Masuk.click();
        //WebElement verify=driver.findElement(By.xpath("//button[@class='blu-btn otp-validation__button b-full-width b-secondary']"));
        //verify.click();
        //WebElement otp_option1=driver.findElement(By.xpath("(//ul//li//input)[1]"));
        //otp_option1.sendKeys("3");
        //WebElement otp_option2=driver.findElement(By.xpath("(//ul//li//input)[2]"));
        //otp_option2.sendKeys("3");
        //WebElement otp_option3= driver.findElement(By.xpath("(//ul//li//input)[3]"));
        //otp_option3.sendKeys("3");
        //WebElement otp_option4=driver.findElement(By.xpath("(//ul//li//input)[4]"));
        //otp_option4.sendKeys("3");
       // WebElement verification= driver.findElement(By.xpath("//button[@class='blu-btn otp__confirm-button b-full-width b-secondary']"));
        //verification.click();
        //WebElement dipesan= driver.findElement(By.xpath("//button[@class='main-header__tabs-tab main-header__tabs-tab-active']"));
       // dipesan.click();
       // String assert_value="selesai";
        //WebElement selesia=driver.findElement(By.xpath("//*[@class='order-list__details__status completed'][1]"));
        //Assert.Asserts_Equal
        //WebElement voucher_game=driver.findElement(By.xpath("//*[@class='order-list__details__name'][4]"));
       // WebElement Rs=driver.findElement(By.xpath("//*[@class='order-footer__amount'][4]"));


//driver.quit();
    }
}
