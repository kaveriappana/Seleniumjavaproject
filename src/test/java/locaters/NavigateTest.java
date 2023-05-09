package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaveri.appana\\IdeaProjects\\Seleniumjavaproject\\chromedriver_win32 (3)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org");

        String title = driver.getTitle();
        System.out.println(title);
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Talk")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to("https://en.wikipedia.org");
        driver.navigate().refresh();
        driver.quit();

    }
}
