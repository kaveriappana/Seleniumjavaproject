package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItemToCart {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaveri.appana\\IdeaProjects\\Seleniumjavaproject\\chromedriver_win32 (3)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");

        String title = driver.getTitle();
        System.out.println(title);

        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("a[data-nav-ref=\"nav_ya_signin\"]")).click();
        driver.findElement(By.cssSelector("input[id='ap_email']")).sendKeys("6301274046");
        driver.findElement(By.cssSelector("input[id='continue']")).click();
        driver.findElement(By.cssSelector("input[id='ap_password']")).sendKeys("Kaveri@123");
        driver.findElement(By.cssSelector("input[id='signInSubmit']")).click();

        driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("Iphone");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.linkText("Apple iPhone 14 Pro Max, 1TB, Deep Purple - Unlocked (Renewed Premium)")).click();
        driver.findElement(By.cssSelector("span[id='wishListMainButton']")).click();
      //  driver.findElement(By.xpath("//span[@id=\"huc-view-your-list-button\"]/span/a")).click();
       // driver.findElement(By.xpath("//span[@class='a-button-inner']//child::a[text()='View Your List']")).click();
        driver.findElement(By.xpath("//span[text()='Continue shopping']")).click();

        //to select the all drop down to axcess list of values
        driver.findElement(By.cssSelector("select[aria-describedby='searchDropdownDescription'] option:nth-of-type(3)")).click();
        driver.quit();
    }
}
