package io.loop.test.homework.practiceTask2;
/*

1. go to https://loopcamp.vercel.app/forgot-password.html
2. locate 5 elements, forgot password, email, email input, retrieve password, powered by LOOPCAMP
3. use css
4. Validate those elements are displayed
 */

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class task1 {
    public static void main(String[] args) {

        //open chrome driver
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();

        //go to https://loopcamp.vercel.app/forgot-password.html
        driver.get("https://loopcamp.vercel.app/forgot-password.html");

        //locate 5 elements, forgot password, email, email input, retrieve password, powered by LOOPCAMP

        WebElement forgetPassword = driver.findElement(By.cssSelector("div[class='example']>h2"));
        // validate forgot password
        if (forgetPassword.isDisplayed()){
            System.out.println("TEST PASSED:" + " for forgot password");
        } else {
            System.out.println("TEST FAILED:" + " for forgot password");
        }

        WebElement email = driver.findElement(By.cssSelector("div[class='large-6 small-12 columns']>label"));
        // validate email
        if (email.isDisplayed()){
            System.out.println("TEST PASSED:" + " for email");
        } else {
            System.out.println("TEST FAILED:" + " for email");
        }

        WebElement emailInput = driver.findElement(By.cssSelector("div[class='large-6 small-12 columns']>input"));
        //validate emailInput
        if (emailInput.isDisplayed()){
            System.out.println("TEST PASSED:" + " for emailInput");
        } else {
            System.out.println("TEST FAILED:" + " for emailInput");
        }


        WebElement retrievePassword = driver.findElement(By.cssSelector("[class='icon-2x icon-signin']"));
        //validate retrievePassword
        if (retrievePassword.isDisplayed()){
            System.out.println("TEST PASSED:" + " for retrieve Password");
        } else {
            System.out.println("TEST FAILED:" + " for retrieve Password");
        }

        WebElement poweredByLoopCamp = driver.findElement(By.cssSelector("[style='text-align: center;']"));
        // validate poweredByLoopCamp
        if (poweredByLoopCamp.isDisplayed()){
            System.out.println("TEST PASSED:" + " for poweredByLoopCamp");
        } else {
            System.out.println("TEST FAILED:" + " for poweredByLoopCamp");
        }



    }
}
