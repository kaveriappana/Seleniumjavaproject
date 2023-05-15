package GreenKart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public class Assignment3 {
    WebDriver driver;
    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.driver.chrome","C:\\Users\\kaveri.appana\\IdeaProjects\\Seleniumjavaproject\\chromedriver_win32 (3)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
    }
    @AfterTest
    public void quit(){
        driver.quit();
    }
    @Test
    public void login() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        driver.findElement(By.cssSelector("input#username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("input#password")).sendKeys("learning");
        driver.findElement(By.xpath("//span[text()=' User']")).click();
        driver.findElement(By.cssSelector("button#okayBtn")).click();

        WebElement option=driver.findElement(By.cssSelector("select[data-style='btn-info']"));
        Select select =new Select(option);
        select.selectByVisibleText("Consultant");
        driver.findElement(By.cssSelector("input[id='terms']")).click();
        driver.findElement(By.cssSelector("input#signInBtn")).click();

        WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(7000));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));


        List <WebElement> productes = driver.findElements(By.cssSelector(".card-footer .btn-info"));

        for(int i =0;i<productes.size();i++)

        {

            productes.get(i).click();

        }

//        String[] itemsneeded ={"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
//        List <WebElement> products = driver.findElements(By.cssSelector("//div/h4[@class='card-title']"));
//        for(int i=0;i<products.size();i++){
//
//            String name= products.get(i).getText();
//            List itemsneededlist = Arrays.asList(itemsneeded);
//            int j=0;
//            if(itemsneededlist.contains(name))
//            {
//                j++;
//                driver.findElements(By.className("btn btn-info")).get(i).click();
//                if(j== itemsneeded.length) {
//                    break;
//                }
//            }
//        }
//        driver.findElement(By.partialLinkText("Checkout")).click();
//
    }
}
