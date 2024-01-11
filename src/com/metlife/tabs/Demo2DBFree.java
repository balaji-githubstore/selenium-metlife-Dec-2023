package com.metlife.tabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Demo2DBFree {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.db4free.net/");

        //click on phpMyAdmin »
        driver.findElement(By.partialLinkText("phpMyAdmin")).click();

        //switch to second tab
        List<String> windows=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));

        driver.findElement(By.id("input_username")).sendKeys("admin");
        driver.findElement(By.id("input_password")).sendKeys("admin123");
        driver.findElement(By.id("input_go")).click();
        //enter password as admin123
        //click on login

        driver.close(); //check which tab is closed

        //switch to first tab
        driver.switchTo().window(windows.get(0));

        //get the title and print
        System.out.println(driver.getTitle());

        driver.quit();






    }
}
