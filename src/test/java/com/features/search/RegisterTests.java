package com.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.Qualifier;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.pages.RegisterPage;
import com.steps.serenity.RegisterSteps;

@RunWith(SerenityRunner.class)
public class RegisterTests {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;
    
    
    @Steps
    public RegisterSteps newaccount;

    @Test
    public void register_new_account() {
    newaccount.open_propertyPage_and_maximize_window();
    newaccount.click_myaccount_button();
    newaccount.click_register_button();
    newaccount.fill_register_form("user@email.com", "user123", "user123", "User", "Someone", "7123456");
    newaccount.click_submit();
    newaccount.validate_test();
 
    }

}