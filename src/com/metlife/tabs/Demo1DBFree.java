package com.metlife.tabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;

public class Demo1DBFree {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.db4free.net/");

        //click on phpMyAdmin »
        driver.findElement(By.partialLinkText("phpMyAdmin")).click();

        ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
        System.out.println(windows);
        System.out.println(windows.get(0));
        System.out.println(windows.get(1));

        driver.switchTo().window(windows.get(1));




    }
}
