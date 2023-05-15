package Automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Actions {
   public  WebDriver driver;

    @Test
    public void userinterations(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kaveri.appana\\IdeaProjects\\Seleniumjavaproject\\chromedriver_win32 (3)\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement ele = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
        org.openqa.selenium.interactions.Actions action = new org.openqa.selenium.interactions.Actions(driver);
        action.moveToElement(ele).build().perform();
        //action.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(keys.shift)


    }


}
