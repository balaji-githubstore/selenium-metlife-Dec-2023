package com.metlife.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1LaunchBrowser {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        //get url and print it
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualTitle);

        String pageSrc = driver.getPageSource();
        System.out.println(pageSrc);

        driver.quit();
    }
}
