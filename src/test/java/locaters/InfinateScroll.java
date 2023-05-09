package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InfinateScroll {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaveri.appana\\IdeaProjects\\Seleniumjavaproject\\chromedriver_win32 (3)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");

        String title = driver.getTitle();
        System.out.println(title);

        driver.manage().window().maximize();
        driver.findElement(By.linkText("Infinite Scroll")).click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("scrollBy(0, 45000)");
//             int number= driver.findElements(By.className("jscroll-added")).size();
//            String script = "window.scrollTo(0, document.body.scrollHeight)";
//
//
//            while(number < 5) {
//                js.executeScript(script);
//            }


        driver.quit();




    }
}
