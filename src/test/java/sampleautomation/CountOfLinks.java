package sampleautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class CountOfLinks {
    WebDriver driver;
    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.driver.chrome","C:\\Users\\kaveri.appana\\IdeaProjects\\Seleniumjavaproject\\chromedriver_win32 (3)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    }
    @AfterTest
    public void quit(){
        //driver.quit();
    }
    @Test
    public void countoflinks() throws InterruptedException
    {
        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footercount = driver.findElement(By.id("gf-BIG"));
        System.out.println(footercount.findElements(By.tagName("a")).size());
        WebElement columdriver =footercount.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columdriver.findElements(By.tagName("a")).size());
        for(int i=1;i<columdriver.findElements(By.tagName("a")).size();i++)
        {
            String clickonlinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
            columdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinks);
            Thread.sleep(5000);
        }
            Set<String> windows = driver.getWindowHandles();
            Iterator<String> it=windows.iterator();
            while(it.hasNext())
            {
                driver.switchTo().window(it.next());
                System.out.println(driver.getTitle());
            }


    }
}

