package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

public class task1 {
    public static <Actions> void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunil.patel.in\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://snapdeal.com/");

 //       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(2000);
      System.out.println("App lounch");

    //  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/h3")).clear();
        System.out.println("mens section");

        WebElement window = driver.findElement(By.name("keyword"));
        window.sendKeys("mens TShirt");


        WebDriverWait wait = new WebDriverWait(driver, 10);

        // Wait until the element is visible
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("keyword")));

        //searh the tshrt
        
        driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[2]/button/span")).click();

       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//id for the single web browser window
        String mainPage = driver.getWindowHandle();
        System.out.println(mainPage);

//selectin the size of the tshirt

        driver.findElement(By.xpath("//*[@id=\"7493990446475918430\"]/div[3]/div[1]/a")).click();


//moving to the next page
        Set<String> allPages=driver.getWindowHandles();
        for(String page : allPages) {
            if(!page.equals(mainPage)) {
                driver.switchTo().window(page);
                break;
            }
        }
        System.out.println(driver.getCurrentUrl());

        Thread.sleep(4000);

        driver.findElement(By.xpath("//*[@id=\"attribute-select-1\"]/div[2]/div/div/div[6]/div")).click();

       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds("5"));

        Thread.sleep(4000);
//buy now button

        driver.findElement(By.xpath("//*[@id=\"buy-button-id\"]")).click();
//entering the email id and password........

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("dsuthar1107@gmail.com");

        //click on the login button

        driver.findElement(By.xpath("//*[@id=\"login-continue\"]")).click();

        WebDriverWait wait1= new WebDriverWait(driver, 10);

        // Wait until the element is visible
        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

        Thread.sleep(4000);
        WebElement password= driver.findElement(By.id("w_password"));
        password.sendKeys("d1i1n0s7");

        driver.findElement(By.xpath("//*[@id=\"login-done\"]")).click();

        Thread.sleep(4000);

       driver.findElement(By.xpath("//*[@id=\"make-payment\"]")).click();

       Thread.sleep(4000);
         //card details entering

        System.out.println("card details");

        driver.findElement(By.xpath("//*[@id=\"payment-nav-id\"]/div[2]/span")).click();

        Thread.sleep(4000);

        WebElement username1 = driver.findElement(By.name("card_number_mask"));
        username1.sendKeys("6081711603004129");

        Thread.sleep(4000);

        //dropdown select tag ..........

        WebElement monthDropdown = driver.findElement(By.name("expMonth"));

        // Initialize Select class with the dropdown element
        Select selectMonth = new Select(monthDropdown);

        selectMonth.selectByIndex(2);

        Thread.sleep(4000);

        WebElement yyear = driver.findElement(By.name("expYear"));

        Select select = new Select(yyear);

        select.selectByIndex(3);

        Thread.sleep(4000);

        WebElement cvv = driver.findElement(By.name("cvvValidate"));
        cvv.sendKeys("345");





        // Select the option by visible text
        //selectMonth.selectByVisibleText("August");



//        WebElement exdate = driver.findElement(By.id("CS2"));
//        exdate.sendKeys("02");
//
//        WebElement exdate1 = driver.findElement(By.id("CS3"));
//        exdate1.sendKeys("25");
//
//        WebElement exdate2 = driver.findElement(By.name("cvvValidate"));
//        exdate2.sendKeys("234");
//

        driver.findElement(By.xpath("//*[@id=\"creditcard-continue\"]")).click();











//        driver.findElement(By.name("//*[@id=\"category1Data\"]/div[1]/div/div/p[2]/a")).click();
//        //ele.click();
//        System.out.println("Shoes Click");
       //WebElement step2 = driver.findElement(By.xpath("//*[@id=\"5764608167357904200\"]/div[2]/a/picture/img"));

      // step2.click();

    }
}
