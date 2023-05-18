package Automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Assignment5 {
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
    public void ass_5(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
       WebElement checkbox=  driver.findElement(By.cssSelector("input[id='checkBoxOption1']"));
       checkbox.click();
       String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]")).getText();
       System.out.println(opt);
       WebElement option = driver.findElement(By.id("dropdown-class-example"));
       Select select = new Select(option);
       select.selectByVisibleText(opt);
       driver.findElement(By.name("enter-name")).sendKeys(opt);
       driver.findElement(By.id("alertbtn")).click();
       String text=  driver.switchTo().alert().getText();
       if(text.contains(opt))
       {
            System.out.println("Alert message success");
       }
       else
            System.out.println("Something wrong with execution");
    }
}

