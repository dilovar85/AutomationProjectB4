package io.loop.test.day5;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class T5_multi_dropdown{
           /*
    1. Open Chrome browser
    2. Go to https://demoqa.com/select-menu
    3. Select all the options from multiple select dropdown.
    4. Print out all selected values.
    5. Deselect all values.
     */

    WebDriver driver;

    @BeforeMethod
    public void
    setUpMethod() {
        driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }
    @AfterMethod
    public void tearDownMethod() {

    }

    @Test
    public void multiSelect() throws Exception{
        Select dropDown = new Select(driver.findElement(By.xpath("//select[@id='cars']")));
        Assert.assertTrue(dropDown.isMultiple(), "Dropdown is not multi select");

       /*
        dropDown.selectByIndex(0);
        Thread.sleep(3000);

        dropDown.selectByVisibleText("Opel");
        Thread.sleep(3000);

        dropDown.selectByContainsVisibleText("Au");

        */

        List<WebElement> options;
        options = dropDown.getOptions();

        /*
        for ( WebElement option : options){
            option.click();
            System.out.println(option.getText());
        }

         */

       /*
        options.forEach(option -> {
            option.click();
            System.out.println(option.getText());
        });

        */

        options.forEach(WebElement::click);

        dropDown.deselectAll();

        Thread.sleep(3000);


        try{
            dropDown.getFirstSelectedOption().getText();
        } catch (Exception e){
            System.out.println("No option selelceted");
        }




        try {
            Assert.assertEquals(dropDown.getFirstSelectedOption().getText(), "");

        } catch (Exception e){
            System.out.println("No option selected");
        }

       Assert.assertThrows(org.openqa.selenium.NoSuchElementException.class, dropDown::getFirstSelectedOption);




    }
}
