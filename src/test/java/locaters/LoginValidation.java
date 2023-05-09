package locaters;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class LoginValidation {
    @Test
    public void login() {
        Logger logger = Logger.getLogger("LoginValidation.class");
        PropertyConfigurator.configure("C:\\Users\\kaveri.appana\\IdeaProjects\\Seleniumjavaproject\\src\\main\\resources\\log4j.properties");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaveri.appana\\IdeaProjects\\Seleniumjavaproject\\chromedriver_win32 (3)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        String title = driver.getTitle();
        System.out.println(title);
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1")).click();
        driver.findElement(By.cssSelector("input[id='ap_email']")).sendKeys("6301274046");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        driver.findElement(By.cssSelector("input[id='ap_password']")).sendKeys("Kaveri@123");
        driver.findElement(By.cssSelector("input[id='signInSubmit']")).click();


        driver.quit();
    }
}
