package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewItemsFromList {
    public static void main(String[]args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaveri.appana\\IdeaProjects\\Seleniumjavaproject\\chromedriver_win32 (3)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        String title = driver.getTitle();
        System.out.println(title);

        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("a[data-nav-ref=\"nav_ya_signin\"]")).click();
        driver.findElement(By.cssSelector("input[id='ap_email']")).sendKeys("6301274046");
        driver.findElement(By.cssSelector("input[id='continue']")).click();
        driver.findElement(By.cssSelector("input[id='ap_password']")).sendKeys("Kaveri@123");
        driver.findElement(By.cssSelector("input[id='signInSubmit']")).click();

        driver.findElement(By.cssSelector("//span[text()='Hello, kaveri']")).click();
        driver.findElement(By.xpath("//span[text()='Shopping List']")).click();

    }

}
