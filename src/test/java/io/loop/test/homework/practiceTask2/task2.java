package io.loop.test.homework.practiceTask2;
/*

1. login to docuport application
2. logout from docuport application
3. Validate successful login
4. Validate successful logout
 */

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class task2 {
    public static void main(String[] args) throws InterruptedException {

        // open chrome driver
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();

        //login to docuport application
        driver.get(DocuportConstants.DOCUPORT_TEST);

        // enter docuport username
        WebElement docuportUserName = driver.findElement(By.cssSelector("[id='input-14']"));
        docuportUserName.sendKeys(DocuportConstants.USERNAME_CLIENT);

        //enter docuport password
        WebElement docuportPassword = driver.findElement(By.cssSelector("[id='input-15']"));
        docuportPassword.sendKeys(DocuportConstants.PASSWORD);

        WebElement login = driver.findElement(By.cssSelector("[class='v-btn__content']"));
        login.click();

        Thread.sleep(5000);
        WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
        continueButton.click();

        // validate successful login
        if(continueButton.isDisplayed()){
            System.out.println("TEST PASSED:" + " for login");
        } else {
            System.out.println("TEST FAILED:" + " for login");
        }



        WebElement logoutMenu = driver.findElement(By.xpath("//span[@class='subtitle-2 text-none pl-2 pr-3 gray--text text--darken-3']"));
        logoutMenu.click();



        WebElement logoutButton = driver.findElement(By.xpath("//span[contains(@class,'body-2')and contains(text(),'Log out')]"));
        logoutButton.click();

        // validate successful logout
        if(logoutButton.isDisplayed()){
            System.out.println("TEST PASSED:" + " for logout");
        } else {
            System.out.println("TEST FAILED:" + " for logout");
        }

        }







    }

