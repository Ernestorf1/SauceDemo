package allTests;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import pages.sauceDemoPage;
import pages.sauceProducts;

public class SauceDemoTests {
    @BeforeMethod
    public void setUp() {
        System.out.println("Starting Test");
        
        sauceDemoPage.navigateToSaucePage();

    }

    // Login with wrong credentials
    @Test(priority = 1)
    public void loginWrong() {
        sauceDemoPage.verifyTitle();
        sauceDemoPage.inputWrongCredentials();
        sauceDemoPage.clickOnLoginButton();
        sauceDemoPage.verifyErrorMessage();

    }

    // Login with correct credentials
    @Test(priority = 2)
    public void loginSauceDemo() {
        sauceDemoPage.verifyTitle();
        sauceDemoPage.inputCorrectCredentials();
        sauceDemoPage.clickOnLoginButton();
        sauceDemoPage.verifyLoggedIn();
    }
    //Validate Products
    @Test
    public void validateProducts(){
       sauceProducts.login();
       sauceProducts.verifyAmountProducts();
       sauceProducts.verifyDescriptionProducts();
    }
    //Add all the products to the cart
    @Test
    public void addAllTheProducts(){
        sauceProducts.login();
        sauceProducts.addAllTheProductsCart();
        sauceProducts.verifyAmountAddedOnIcon();
        sauceProducts.verifyRemoveButtonOfAll();
    }

    @AfterMethod
    public void tearDown() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sauceDemoPage.quitBrowser();
        System.out.println("The End");
    }

}
