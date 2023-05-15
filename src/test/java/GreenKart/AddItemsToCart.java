package GreenKart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class AddItemsToCart extends BaseClass{
    @Test
    public void addeelements()
    {
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String[] itemsneeded ={"Cucumber","Brocolli","Beetroot"};
        List<WebElement> products =  driver.findElements(By.cssSelector("h4.product-name"));
         for(int i=0;i<products.size();i++){

            String[] name= products.get(i).getText().split("-");
            String formattedname= name[0].trim();
            List itemsneededlist = Arrays.asList(itemsneeded);
           int j=0;
           if(itemsneededlist.contains(formattedname))
           {
               j++;
             driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
               if(j== itemsneeded.length) {
                   break;
               }
           }
         }
         driver.findElement(By.cssSelector("img[alt='Cart']")).click();
         driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
         WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
         w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Enter promo code']")));
         driver.findElement(By.cssSelector("input[placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
         driver.findElement(By.xpath("//button[text()='Apply']")).click();
         WebDriverWait w1 = new WebDriverWait(driver,Duration.ofSeconds(5));
         w1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
         System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

    }
}
