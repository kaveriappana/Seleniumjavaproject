package Automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment1 {
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
        driver.quit();
    }
    @Test
    public void Testcheckbox(){
        WebElement checked= driver.findElement(By.id("checkBoxOption1"));
        checked.click();
        Assert.assertTrue(checked.isSelected());
        checked.click();
        WebElement unchecked = driver.findElement(By.id("checkBoxOption1"));
        Assert.assertFalse(unchecked.isSelected());
        System.out.println(driver.findElements(By.cssSelector("[type='checkbox']")).size());
    }
}

