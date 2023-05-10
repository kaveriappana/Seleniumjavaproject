package Automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class DropDownPractice extends BaseTests{
    @Test
    public void staticdropdown(){

       WebElement staticdropdown= driver.findElement(By.xpath("//div/span[@class='left guestlbl']/following-sibling::select"));
        Select dropdown = new Select(staticdropdown);
        dropdown.selectByIndex(2);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("USD");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());

    }
    @Test
    public void updateddropdown() throws InterruptedException {
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        for(int i=0;i<4;i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        WebElement data = driver.findElement(By.id("divpaxinfo"));
        String value= data.getText();
        System.out.println(value);
        Assert.assertEquals(value,"5 Adult");

    }
    @Test
    public void Fromandtodestination() throws InterruptedException {
        driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        driver.findElement(By.cssSelector("a[value='BLR']")).click();
        Thread.sleep(2000);
       // driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        //using parent child
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();

    }
    @Test
    public void autofill() throws InterruptedException {
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(1000);
       List<WebElement> options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
       for(WebElement option :options){
           if(option.getText().equalsIgnoreCase("india")) {
               option.click();
               break;
           }
       }
    }
}
