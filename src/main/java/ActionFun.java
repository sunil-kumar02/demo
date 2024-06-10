import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionFun {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunil.patel.in\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.snapdeal.com/");
//        driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[2]/i")).click();
//        WebElement fasion = driver.findElement((By.xpath("/html/body")));
        Actions action = new Actions(driver);
        WebElement input1 = driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[2]/i"));
       // WebElement input2 = driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[7]/a"));

        action.moveToElement(input1).perform();

        action.sendKeys("text").perform();

        // input1.sendKeys("welcome to snapdeals");






    }

}
