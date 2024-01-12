package com.metlife.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
//frame using webelement
public class Demo1Hdfc {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://netbanking.hdfcbank.com/netbanking/");
//frame[contains(@src,'RSNBLogin')]
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));
        //send userid as john123
        driver.findElement(By.name("fldLoginUserId")).sendKeys("john123");

        //click on continue
        //linktext will work based on the font available on UI/webpage
        //xpath will work based on html font
        driver.findElement(By.linkText("CONTINUE")).click();

        //switch to main html
        driver.switchTo().defaultContent();


    }
}
