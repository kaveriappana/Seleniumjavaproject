package Automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Calender {
    WebDriver driver;
    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.driver.chrome","C:\\Users\\kaveri.appana\\IdeaProjects\\Seleniumjavaproject\\chromedriver_win32 (3)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.path2usa.com/travel-companions");
    }
    @AfterTest
    public void quit(){
        //driver.quit();
    }
    @Test
    public void pickdate(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.name("form_fields[travel_comp_date]")).click();
       List<WebElement> dates =  driver.findElements(By.className("flatpickr-day"));
       int count = driver.findElements(By.className("flatpickr-day")).size();
       for(int i =0;i<count;i++){
          String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();
          if(text.equalsIgnoreCase("18")){
              driver.findElements(By.className("flatpickr-day")).get(i).click();
              break;
          }
       }

    }
}
