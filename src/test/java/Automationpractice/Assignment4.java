package Automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;

public class Assignment4 {
    WebDriver driver;
    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.driver.chrome","C:\\Users\\kaveri.appana\\IdeaProjects\\Seleniumjavaproject\\chromedriver_win32 (3)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
    }
    @AfterTest
    public void quit(){
        driver.quit();
    }
    @Test
    public void windowhandles(){
        driver.findElement(By.linkText("Multiple Windows")).click();
        driver.findElement(By.linkText("Click Here")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it=windows.iterator();
        String parentid = it.next();
        String childid= it.next();
        driver.switchTo().window(childid);
        System.out.println(driver.findElement(By.tagName("h3")).getText());
        driver.switchTo().window(parentid);
        System.out.println(driver.findElement(By.tagName("h3")).getText());

    }
    @Test
    public void nestedframes(){
        driver.findElement(By.linkText("Nested Frames")).click();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        System.out.println(driver.findElement(By.id("content")).getText());
    }
}
