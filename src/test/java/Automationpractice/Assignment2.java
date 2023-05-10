package Automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment2 {
    WebDriver driver;
    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.driver.chrome","C:\\Users\\kaveri.appana\\IdeaProjects\\Seleniumjavaproject\\chromedriver_win32 (3)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
    }
    @AfterTest
    public void quit(){
        driver.quit();
    }
    @Test
    public void form(){
        driver.findElement(By.cssSelector("input[minlength='2']")).sendKeys("name");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("name@gmail.com");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("name123");
        driver.findElement(By.cssSelector("[type='checkbox']")).click();
        WebElement option = driver.findElement(By.cssSelector("select[id='exampleFormControlSelect1']"));
        Select select=new Select(option);
        select.selectByVisibleText("Female");
        driver.findElement(By.cssSelector("input[id='inlineRadio1']")).click();
        driver.findElement(By.cssSelector("input[type='date']")).sendKeys("05/10/2023");
        driver.findElement(By.cssSelector("input[value='Submit']")).click();
        System.out.println(driver.findElement(By.tagName("strong")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("strong")).getText(),"Success!");
    }
}
