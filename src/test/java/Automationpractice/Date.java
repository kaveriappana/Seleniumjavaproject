package Automationpractice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Date extends BaseTests{
    @Test
    public void slectcurrentdate() throws InterruptedException {
        driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        driver.findElement(By.cssSelector("a[value='BLR']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
        driver.findElement(By.cssSelector(" .ui-datepicker-days-cell-over.ui-datepicker-today")).click();
    }
    @Test
    public void buttonvalidation(){
      //  System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
        {
            System.out.println("Its enabled");
            Assert.assertTrue(true);
        }
        else{
            Assert.assertTrue(false);
        }


    }

}
