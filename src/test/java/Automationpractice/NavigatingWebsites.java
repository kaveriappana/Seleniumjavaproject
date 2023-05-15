package Automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class NavigatingWebsites {
    WebDriver driver;
    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.driver.chrome","C:\\Users\\kaveri.appana\\IdeaProjects\\Seleniumjavaproject\\chromedriver_win32 (3)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
    }
    @AfterTest
    public void quit(){
        driver.quit();
    }
    @Test
    public void switchwindows(){
        driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it=windows.iterator();
        String parentid = it.next();
        String childid= it.next();
        driver.switchTo().window(childid);
       // System.out.println(driver.findElement(By.cssSelector("p[class='im-para red']")).getText());
        System.out.println(driver.findElement(By.cssSelector("p[class='im-para red']")).getText().split("at")[1].trim().split(" ")[0]);


       // driver.switchTo().window(parentid);
    }
}
