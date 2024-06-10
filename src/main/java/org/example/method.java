package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class method {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunil.patel.in\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://snapdeal.com/");
//get title
     //   System.out.println(driver.getTitle());

        //getcurrent url

      //  System.out.println(driver.getCurrentUrl());

        //get Page source

        //System.out.println(driver.getPageSource());

        //single browser window id
       //String window =  driver.getWindowHandle();

        //System.out.println(window);

        //return id of multiple window id

        driver.findElement(By.xpath("//*[@id=\"sdFooter\"]/div[2]/div[2]/div/div[2]/div/a[2]")).click();
        //this will open the new web page
       Set<String> window =  driver.getWindowHandles();
        System.out.println(window );


    }
}
