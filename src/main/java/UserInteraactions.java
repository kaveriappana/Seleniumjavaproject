import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UserInteraactions {

    public static void main(String args[]) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kaveri.appana\\IdeaProjects\\Seleniumjavaproject\\chromedriver_win32 (3)\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://www.amazon.com/");
        //WebElement ele = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
        Actions action = new Actions(driver);
        //action.moveToElement(ele).build().perform();
        action.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();


    }
}
