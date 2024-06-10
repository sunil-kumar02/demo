package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunil.patel.in\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //Normal alerts

        //driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();


        // dismitch and ok alerts

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();



       //driver.findElement(By.xpath("//button[normalize_space()='Click for Js Confirm']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
       //driver.switchTo().alert().dismiss();
       // Thread.sleep(5000);
       Alert alert = driver.switchTo().alert();
        alert.sendKeys("welcome");
        alert.accept();

    }
}
