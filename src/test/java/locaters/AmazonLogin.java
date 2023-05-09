package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaveri.appana\\IdeaProjects\\Seleniumjavaproject\\chromedriver_win32 (3)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/");

        String title = driver.getTitle();
        System.out.println(title);

        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("#inputValEnter")).sendKeys("Mobile phones");
        driver.findElement(By.cssSelector(".searchTextSpan")).click();
        WebElement from = driver.findElement(By.cssSelector("input.input-filter[name='fromVal']"));
        from.clear();
        from.sendKeys("1000");
        WebElement to =driver.findElement(By.cssSelector(("input[name=toVal]")));
        to.clear();
        to.sendKeys("2000");
        driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
       // driver.findElement(By.xpath("//a[@class='filter-name'][normalize-space()='boAt']")).click();

//        driver.findElement(By.cssSelector("label[for='Brand-boAt']")).click();
//        driver.findElement(By.cssSelector("//p[@title='boAt Airdopes 131/138 Twin Wireless Earbuds with IWP Technology, Bluetooth V5.0, Immersive Audio, Up to 15H Total Playback, Instant Voice Assistant and Type-C Charging,Bluetooth Earphone (Active Black)']")).click();


        driver.quit();



    }
}
