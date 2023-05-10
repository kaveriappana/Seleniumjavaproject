package Automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTests {
   public WebDriver driver;
    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.driver.chrome","C:\\Users\\kaveri.appana\\IdeaProjects\\Seleniumjavaproject\\chromedriver_win32 (3)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    }
    @AfterTest
    public void quit(){
        //driver.quit();
    }
}
