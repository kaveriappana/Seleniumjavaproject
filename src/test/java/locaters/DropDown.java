package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaveri.appana\\IdeaProjects\\Seleniumjavaproject\\chromedriver_win32 (3)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");

        String title = driver.getTitle();
        System.out.println(title);

        driver.manage().window().maximize();
        driver.findElement(By.linkText("Dropdown")).click();
        Select dropdown = new Select(driver.findElement(By.cssSelector("select[id='dropdown']")));
        dropdown.selectByVisibleText("Option 2");
        driver.quit();

    }
}