package com.example;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
    protected static WebDriver driver;
    protected static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    
    static{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    
    public BasePage(WebDriver driver){
        BasePage.driver = driver;
    }

    public static void closeBrowser(){
        driver.quit();
    }
}
