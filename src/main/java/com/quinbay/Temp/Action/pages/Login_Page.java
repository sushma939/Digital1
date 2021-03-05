package com.quinbay.Temp.Action.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page {

    @FindBy(xpath = "//input[@class='form__input login__username']")
    WebElement Login_user;
    @FindBy(xpath = "//input[@class='form__input login__password']")
    WebElement Login_password;
    @FindBy(xpath = "//button[@class='blu-btn b-full-width b-secondary']")
    WebElement submit;
    @FindBy(xpath = "//button[@class='blu-btn otp-validation__button b-full-width b-secondary']")
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
    public void Login(String user_name,String password){
        Login_user.sendKeys(user_name);
                Login_password.sendKeys(password);

    }



    public void Submit() {

        submit.click();

    }
    public void setVerify_email() {

        verify_email.click();
    }
    public void setOtp(String otp){
        otp1.sendKeys("3");

        otp2.sendKeys("3");

        otp3.sendKeys("3");
      
        otp4.sendKeys("3");
        otpsubmit.click();
    }

}


