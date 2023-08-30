package com.hello.broo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver_utilities {


    public static WebDriver chromeBrowser(String browser){

        WebDriver driver = null;

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        return driver;

    }
}
