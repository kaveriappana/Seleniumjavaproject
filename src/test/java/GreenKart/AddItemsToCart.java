package GreenKart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class AddItemsToCart extends BaseClass{
    @Test
    public void addeelements(){
      List<WebElement> products =  driver.findElements(By.className("h4.product-name"));
      for(int i=0;i<products.size();i++){
         String name= products.get(i).getText();
         if(name.contains("Cucumber")){
             driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
             break;
         }
      }

    }
}
