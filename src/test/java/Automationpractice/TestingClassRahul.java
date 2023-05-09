package Automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestingClassRahul {
    WebDriver driver;
@Test
    public void login() throws InterruptedException {
//    System.setProperty("webdriver.chrome.driver","C:\\Users\\kaveri.appana\\IdeaProjects\\Seleniumjavaproject\\chromedriver_win32 (3)\\chromedriver.exe");
//    driver = new ChromeDriver();
    System.setProperty("webdriver.edge.driver","C:\\Users\\kaveri.appana\\IdeaProjects\\Seleniumjavaproject\\chromedriver_win32 (3)\\msedgedriver.exe");
    driver = new EdgeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    String password =  resetpassword(driver);
    driver.get("https://rahulshettyacademy.com/locatorspractice/");
    driver.findElement(By.id("inputUsername")).sendKeys("rahul");
    driver.findElement(By.name("inputPassword")).sendKeys(password);
    driver.findElement(By.className("signInBtn")).click();
    Thread.sleep(3000);
    WebElement value = driver.findElement(By.tagName("p"));
    String value2= value.getText();
    System.out.println(value2);
   Assert.assertEquals(value2,"You are successfully logged in.");

}
    public String resetpassword(WebDriver driver) throws InterruptedException {
    driver.get("https://rahulshettyacademy.com/locatorspractice/");
    driver.findElement(By.linkText("Forgot your password?")).click();
    Thread.sleep(2000);
    driver.findElement(By.className("reset-pwd-btn")).click();
    String passwordText=driver.findElement(By.cssSelector("form p")).getText();
    String[] pass1 = passwordText.split("'");
    String password = pass1[1].split("'")[0];
    return password;

}
}
