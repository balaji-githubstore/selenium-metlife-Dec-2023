package com.metlife.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Demo3FBSignUp {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.facebook.com/"); //wait for page load to complete

        //click on create new account
        //findElement --> takes only 0.5s to check presence of given locator

        driver.findElement(By.linkText("Create new account")).click();

        //enter first name as john--> takes only 0.5s to check presence of given locator
        driver.findElement(By.name("firstname")).sendKeys("john");

        //enter lastname as wick
        driver.findElement(By.name("lastname")).sendKeys("wick");

        //enter password as test123
        driver.findElement(By.id("password_step_input")).sendKeys("wick123");

        //20 apr 2000
        Select selectDay=new Select(driver.findElement(By.id("day")));
        selectDay.selectByVisibleText("20");

        Select selectMonth=new Select(driver.findElement(By.id("month")));
        selectMonth.selectByVisibleText("Apr");

//        selectMonth.selectByValue("4");
//          selectMonth.selectByIndex(3);

        //select year as 2000

        //click on custom radio button
        driver.findElement(By.xpath("//input[@value='-1']")).click();

        driver.quit();
    }
}
