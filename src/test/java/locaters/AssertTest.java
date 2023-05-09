package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertTest {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaveri.appana\\IdeaProjects\\Seleniumjavaproject\\chromedriver_win32 (3)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");

        String title = driver.getTitle();
        System.out.println(title);

        driver.manage().window().maximize();
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        Assert.assertEquals("5Adult",driver.findElement(By.id("divpaxinfo")).getText());
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        Assert.assertNotEquals("Hello", "How are you");
        System.out.println("Hello...This is javaTpoint");
        driver.quit();
    }
}
