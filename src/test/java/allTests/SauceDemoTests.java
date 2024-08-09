package allTests;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import pages.loginDemoPage;
import pages.sauceProducts;

public class SauceDemoTests {
    @BeforeMethod
    public void setUp() {
        System.out.println("Starting Test");
        
        loginDemoPage.navigateToSaucePage();

    }
        // Login with correct credentials
        @Test(priority = 1)
        public void loginSauceDemo() {
            loginDemoPage.verifyTitle();
            loginDemoPage.inputCorrectCredentials();
            loginDemoPage.clickOnLoginButton();
            loginDemoPage.verifyLoggedIn();
        }

    // Login with invalid credentials
    @Test(priority = 2)
    public void loginInvalidCredentials() {
        loginDemoPage.verifyTitle();
        loginDemoPage.inputWrongCredentials();
        loginDemoPage.clickOnLoginButton();
        loginDemoPage.verifyErrorMessage();

    }
    //Add a product to the Cart
    public void addAProduct (){
        loginSauceDemo();
        sauceProducts.clickOnAddToCartFirsProduct();
        
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
        loginDemoPage.quitBrowser();
        System.out.println("The End");
    }

}
