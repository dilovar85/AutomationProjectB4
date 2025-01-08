package io.loop.test.day3;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Credentials;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Personal {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://www.philapark.org");

        Thread.sleep(2000);

        WebElement payTicket = driver.findElement(By.xpath("//a[@class='ls-layer-link' and @href='https://philapark.org/violations/']"));
        payTicket.click();

        Thread.sleep(2000);

        WebElement payTickets = driver.findElement(By.xpath("//a[@href='https://onlineserviceshub.com/ParkingPortal/Philadelphia']"));
        payTickets.click();

        Thread.sleep(2000);

        WebElement termsAgreement = driver.findElement(By.id("termsAgreement"));
        termsAgreement.click();
        Thread.sleep(5000);


        WebElement continueButton = driver.findElement(By.className("button button--primary button--full-width h-100"));
        continueButton.click();
    }
}
