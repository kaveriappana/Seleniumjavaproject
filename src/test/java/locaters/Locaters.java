package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Locaters {
    WebDriver driver;
    @Test
    public void findinglocaters(){
        System.getProperty("webdriver.chrome.driver","C:\\Users\\kaveri.appana\\IdeaProjects\\Seleniumjavaproject\\chromedriver_win32 (3)\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.meesho.com/");
        WebElement ele = driver.findElement(By.cssSelector("span[class ='sc-eDvSVe cFWNZH hover hover']"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//span[text()='Sign Up']")).click();

        driver.findElement(By.xpath("Phone Number")).sendKeys("6301274046");





    }
}
