package Automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckBox extends BaseTests{
    @Test
    public void checkbox(){
      WebElement checkbox = driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));
      checkbox.click();
      Boolean value=checkbox.isSelected();
      Assert.assertTrue(value);
      System.out.println(value);

    }
    @Test
    public void countofcheckbox(){
       System.out.println(driver.findElements(By.cssSelector("[type='checkbox']")).size());
    }
}
