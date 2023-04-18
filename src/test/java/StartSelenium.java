import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StartSelenium {
    WebDriver wd;

    @BeforeMethod
    public void preCondition() {
        System.setProperty("webdriver.chrome.driver","/Users/leon/Project/Tel-Ran/Pro-Auto/StartSelenium_QA/chromedriver");

        wd = new ChromeDriver();
        // wd.navigate().to("https://google.com/"); // запоминает историю
        //   wd.navigate().forward();
        wd.get("https://loftschool.com/login/");
        // open site
    }

    @Test
    public void testName() {
        // click login button
        WebElement element = wd.findElement(By.tagName("a"));
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        System.out.println(elements.size());
    }

    @Test
    public void passwordName() {
        // click password button

    }

    @AfterMethod
    public void postCondition() {
        // wd.close(); // закрывает вкладку
        wd.quit(); // закрывает все
    }
}
