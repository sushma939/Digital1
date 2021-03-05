package com.quinbay.Temp.Action;

import com.quinbay.Temp.Action.pages.Login_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Home_Action {
public Login_Page action;
public Home_Action(WebDriver driver){
action= PageFactory.initElements(driver,Login_Page.class);
}
public void Login(String user_name,String password){
    action.Login(user_name,password);
    action.Submit();
}
    public void verifyemail(String otp) {
        action.setVerify_email();
       action.setVerify_email();
    }

}
