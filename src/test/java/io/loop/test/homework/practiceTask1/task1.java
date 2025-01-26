package io.loop.test.homework.practiceTask1;
/*

1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Validate title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Validate title equals:
Expected: Google
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    public static void main(String[] args) {

        // Open a chrome browser
        WebDriver driver = new ChromeDriver();

        //Go to: https://google.com
        driver.get("https://google.com");
        driver.manage().window().maximize();

        //Click to Gmail from top right.
        WebElement clickGmail = driver.findElement(By.linkText("Gmail"));
        clickGmail.click();


        //Validate title contains: Expected: Gmail
        String gmailTitleContain = driver.getTitle();
        if(gmailTitleContain.contains("Gmail")){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        //Go back to Google by using the .back();
        driver.navigate().back();

        //Validate title equals: Expected: Google
        String googleTitle = driver.getTitle();
        if(googleTitle.contains("Google")){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }





    }
}
