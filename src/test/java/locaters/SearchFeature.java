package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchFeature {
    @Test
    public void search(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaveri.appana\\IdeaProjects\\Seleniumjavaproject\\chromedriver_win32 (3)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        String title = driver.getTitle();
        System.out.println(title);

        driver.manage().window().maximize();

        WebElement element= driver.findElement(By.cssSelector("input[placeholder='Search Amazon']"));
        element.sendKeys("Iphone");
        String text1 =element.getText();
       // Assert.assertEquals(text1,"Iphone");
        driver.findElement(By.cssSelector("span[id='nav-search-submit-text']")).click();
        driver.findElement(By.cssSelector("input[id='low-price']")).sendKeys("400");
        driver.findElement(By.cssSelector("input[id='high-price']")).sendKeys("600");
        driver.findElement(By.cssSelector("input[aria-labelledby='a-autoid-1-announce']")).click();
        driver.findElement(By.linkText("Apple iPhone 12 Mini, 128GB, Black - Unlocked (Renewed)")).click();
        WebElement text= driver.findElement(By.xpath("//span[@class='a-price a-text-price a-size-medium apexPriceToPay']//span[@aria-hidden='true'][normalize-space()='$324.00']"));
        String data= text.getText();
        System.out.println(data);

         //System.out.println(driver.findElement(By.xpath("//span[@class='a-price a-text-price a-size-medium apexPriceToPay']//span[@aria-hidden='true'][normalize-space()='$324.00']")).getText());
        Assert.assertEquals( data,"$324.00");
        driver.quit();


    }
}
