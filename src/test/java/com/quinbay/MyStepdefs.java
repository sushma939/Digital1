package com.quinbay;

import Steps.Driver;
//import com.quinbay.test.Action.Home_Action;
import com.quinbay.Temp.Action.Home_Action;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class MyStepdefs {
    public static WebDriver driver;
    public static Home_Action ob;
    String user;


    @Given("User on BliBli page")
    public void userOnBliBliPage() throws InterruptedException {
        Driver obj=new Driver();
        driver=obj.setupdriver();
    }

    @When("User enters username as {string}")
    public void userEntersUsernameAs(String arg0) {
        ob=new Home_Action(driver);
        user=""+arg0;


    }

    @And("User enter password as {string}")
    public void userEnterPasswordAs(String arg0) {
        ob.Login("arpitha.riya@mailinator.com","Blibli@123456");

        
    }

    @Then("User verify the email")
    public void userVerifyTheEmail() throws InterruptedException {
        System.out.println("Clicked by verify email tag");
        Thread.sleep(3000);
        ob.verifyemail("3333");

    }

    @And("User enter in the login page")
    public void userEnterInTheLoginPage() {

        System.out.println("otp verified with 3333");
    }


}
