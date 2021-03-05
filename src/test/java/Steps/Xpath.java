package Steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Xpath {

    @FindBy(xpath = "//input[@class='form__input login__username']")
    WebElement Login_user;
    @FindBy(xpath = "//input[@class='form__input login__password']")
    WebElement Login_password;
    @FindBy(xpath = "//button[@class='blu-btn b-full-width b-secondary']")
    WebElement submit;
    @FindBy(xpath = "//*[@id=\"blibli-main-ctrl\"]/section/div/div/div/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/button[2]")
    WebElement verify_email;
    @FindBy(xpath = "(//ul//li//input)[1]")
    WebElement otp1;
    @FindBy(xpath = "(//ul//li//input)[2]")
    WebElement otp2;
    @FindBy(xpath = "(//ul//li//input)[3]")
    WebElement otp3;
    @FindBy(xpath = "(//ul//li//input)[4]")
    WebElement otp4;
    @FindBy(xpath = "//button[@class='blu-btn otp__confirm-button b-full-width b-secondary']")
    WebElement otpsubmit;

    public void Login_user(String user_name) {

        Login_user.sendKeys(user_name);
    }

    public void Login_password(String password) {

        Login_password.sendKeys(password);
    }

    public void Submit() {

        submit.click();
    }

    public void setVerify_email() {

        verify_email.click();
    }

    public void setotp(String otp) {

        otp1.sendKeys("" + otp.charAt(0));

        otp2.sendKeys("" + otp.charAt(1));

        otp3.sendKeys("" + otp.charAt(2));

        otp4.sendKeys("" + otp.charAt(3));
        otpsubmit.click();

    }
}
