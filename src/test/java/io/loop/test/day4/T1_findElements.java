package io.loop.test.day4;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

import java.util.List;

public class T1_findElements {
    /*
     1- Open a chrome browser
     2- Go to: https://www.nba.com
     3- Locate all the links in the page.
      */
    public static void main(String[] args) throws Exception {

        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
        driver.get("https://www.nba.com");
        //Thread.sleep(5000);  // it waits all 5 seconds

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // it will not wait the whole 5 seconds, if it finds in 2 seconds it stops waiting

       List <WebElement> nbaLinks =  driver.findElements(By.tagName("a"));
        System.out.println("nbaLinks.size = " + nbaLinks.size());

        List <WebElement> nbaLinksWithXpath = driver.findElements(By.xpath("//a"));
        System.out.println("nbaLinksWithXpath " + nbaLinksWithXpath.size());

        for (WebElement nbaLink : nbaLinks){

            if(!nbaLink.getText().equals("")) {
                System.out.println("nbaLink: " + nbaLink.getText());
                nbaLink.getDomAttribute("href.getDomAttribute(\"href\") = "+ nbaLink.getDomAttribute("href"));
            }
        }

        for (int i = 0; i <nbaLinks.size() ; i++) {

            if (!nbaLinks.get(i).getText().equals("")){
                System.out.println( "nbaLinks.get(i).getText() = " + nbaLinks.get(i).getText());
            }

        }





    }
}
