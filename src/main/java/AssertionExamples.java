import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertionExamples {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\USERDATA\\Downloads\\chromedriver-test\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
}

//    @Test
//    void logoTest()
//    {
//        WebElement logo = driver.findElement(By.xpath("//input[@id='input']"));
//        Assert.assertTrue(logo.isDisplayed(), "displayed");
//    }
//    @Test
//    void titleOfPage() {
//        String title = driver.getTitle();
//        Assert.assertEquals("Google", title, "title is not matching");
//    }
//    @AfterTest
//    void tearDown()
//    {driver.close();}

//}
