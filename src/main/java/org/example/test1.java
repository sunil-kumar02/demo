package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class test1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunil.patel.in\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://m.snapdeal.com/signin");
  //WebElement inp1 = driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[2]/i"));

        WebElement inp = driver.findElement(By.id("Email"));
    //inp1.sendKeys("welcome");


     //  WebElement fasion = driver.findElement((By.xpath("/html/body")));


       Actions action = new Actions(driver);
       action.moveToElement(inp).click().sendKeys(inp,"snapdeal").perform();




//        action.sendKeys(Keys.ENTER).perform();
//       // Thread.sleep(3000);
//        action.sendKeys(Keys.CANCEL).perform();
//        //Thread.sleep(3000);
//        action.sendKeys(Keys.SPACE).perform();
//        //Thread.sleep(3000);
//        action.sendKeys(Keys.BACK_SPACE).perform();








        //driver.close();
//        WebElement username=driver.findElement(By.id("user_email_Login"));
//        WebElement password=driver.findElement(By.id("user_password"));
//        WebElement login=driver.findElement(By.name("commit"));
//        username.sendKeys("abc@gmail.com");
//        password.sendKeys("your_password");
//        login.click();
//        String actualUrl="https://live.browserstack.com/dashboard";
//        String expectedUrl= driver.getCurrentUrl();

    }
}
