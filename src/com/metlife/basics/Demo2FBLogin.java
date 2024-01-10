package com.metlife.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FBLogin {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

//        By locator= By.id("email");
//        WebElement element= driver.findElement(locator);
//        element.sendKeys("hello3333@gmail.com");

//        WebElement element= driver.findElement(By.id("email"));
//        element.sendKeys("hello3333@gmail.com");

        driver.findElement(By.id("email")).sendKeys("hello1234567@gmail.com");

        driver.findElement(By.id("pass")).sendKeys("welcom123");

        //click on login
        driver.findElement(By.name("login")).click();
    }
}
