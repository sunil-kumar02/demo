package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunil.patel.in\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://snapdeal.com/");

        //name
        driver.findElement(By.name("keyword")).sendKeys("macbook");

        //linktext

        //driver.findElement(By.linkText("Tablets")).click();

        //class nad tags

        List<WebElement> header = driver.findElements(By.className("list-inline-item"));
        System.out.println("size of list element" +header.size());


    }
}
