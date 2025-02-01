package io.loop.test.day3;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Credentials;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Personal {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://www.philapark.org");


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebElement payTicket = driver.findElement(By.xpath("//a[@class='ls-layer-link' and @href='https://philapark.org/violations/']"));
        payTicket.click();

        //Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebElement payTickets = driver.findElement(By.xpath("//a[@href='https://onlineserviceshub.com/ParkingPortal/Philadelphia']"));
        payTickets.click();


        //hellonbjhd:


       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebElement termsAgreement = driver.findElement(By.id("termsAgreement"));
        termsAgreement.click();

       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      //  WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(15));


        WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit' and @id='disclaimerSubmitBtn']"));

        if(continueButton.isEnabled()){
            continueButton.click();
        }else {
            System.out.println("continue button is disabled");
        }

        WebElement searchBy = driver.findElement(By.xpath("//select[@id='searchBy']"));
        searchBy.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebElement searchByTicketAndCitationNumber = driver.findElement(By.xpath("//option[@value='ticketNumber']"));
        searchByTicketAndCitationNumber.click();
        System.out.println("Text" + searchByTicketAndCitationNumber.getText());

        WebElement enterTicketNumber = driver.findElement(By.xpath("//input[@class='material-input material-text-field__input' and @id='otherFirstField']"));
        enterTicketNumber.sendKeys("937013225");

        WebElement licensePlate = driver.findElement(By.xpath("//input[@class='material-input material-text-field__input' and @id='otherSecondField']"));
        licensePlate.sendKeys("MMT5973");

        WebElement iAmNotRobot = driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-borderAnimation' and @role='presentation']"));
        iAmNotRobot.click();

    }
}
