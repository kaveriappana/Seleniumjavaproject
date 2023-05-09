package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


    public class Checkbox{
        public static void main(String args[]) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaveri.appana\\IdeaProjects\\Seleniumjavaproject\\chromedriver_win32 (3)\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com");

            String title = driver.getTitle();
            System.out.println(title);

            driver.manage().window().maximize();
            WebElement clickcheckbox = driver.findElement(By.cssSelector("a[href='/checkboxes']"));
            clickcheckbox.click();
            WebElement clickcheckbox2 =driver.findElement(By.xpath("//form[text()=' checkbox 1']//following::input[@type=\"checkbox\"][1]"));
            clickcheckbox2.click();

            driver.quit();
        }
    }

