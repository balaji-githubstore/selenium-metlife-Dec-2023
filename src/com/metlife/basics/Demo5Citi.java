package com.metlife.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Demo5Citi {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.citibank.co.in/ssjsps/forgetuseridmidssi.jsp");


//        5. Choose Credit Card
        driver.findElement(By.linkText("select your product type")).click();
        driver.findElement(By.linkText("Credit Card")).click();
//        6.  Enter credit card number as 4545 5656 8887 9998
        driver.findElement(By.id("citiCard1")).sendKeys("2233");
        driver.findElement(By.cssSelector("#citiCard2")).sendKeys("2233");
        driver.findElement(By.cssSelector("[name='citiCard3']")).sendKeys("2233");
        driver.findElement(By.id("citiCard4")).sendKeys("2233");

//        7.  Enter cvv number
        driver.findElement(By.id("cvvnumber")).sendKeys("2233");

//        8.  Enter date as “14/04/2022”
        //approach 1
//        driver.findElement(By.id("bill-date-long")).sendKeys("14/04/2022");
//        approach 2
        driver.findElement(By.id("bill-date-long")).click();

        Select selectYear=new Select(driver.findElement(By.xpath("//select[@data-handler='selectYear']")));
        selectYear.selectByVisibleText("2022");

        Select selectMonth=new Select(driver.findElement(By.xpath("//select[@data-handler='selectMonth']")));
        selectMonth.selectByVisibleText("Apr");

        driver.findElement(By.linkText("14")).click();

        driver.findElement(By.xpath("//input[@value='PROCEED']")).click();

//        9.  Click on Proceed\
//        10.  Get the text and print it “Please accept Terms and Conditions”
        String actualError=driver.findElement(By.xpath("//div[@role='dialog']")).getText();
        System.out.println(actualError);
    }
}
