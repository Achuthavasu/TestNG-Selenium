package ParallelTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParallelTest1 {

    WebDriver driver;
    @Test
    void logoTest() throws InterruptedException

    { System.setProperty("webdriver.chrome.driver", "E:\\USERDATA\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement logo = driver.findElement(By.xpath("//img[@alt='Google']"));
        Assert.assertTrue(logo.isDisplayed(), "not displayed");
    Thread.sleep(3000);}
    @Test
    void titleTest() throws InterruptedException {System.setProperty("webdriver.chrome.driver", "E:\\USERDATA\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getTitle(), "Google");
    Thread.sleep(3000);}

    @AfterMethod
    void tearDown() throws InterruptedException {
        driver.close();
        Thread.sleep(3000);
        }
}
