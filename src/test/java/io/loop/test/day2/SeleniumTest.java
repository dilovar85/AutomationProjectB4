package io.loop.test.day2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {

        // Setting up the web driver
        // WebDriverManager.chromedriver().setup();
        // if you use older version of selenium

        // create the instance of the driver
        WebDriver driver = new ChromeDriver();

        // maximize the window
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();

        // navigate to the page
        driver.get("https://www.loopcamp.io");

        //wait
        Thread.sleep(3000);

        // navigate to the page
        driver.navigate().to("https://www.google.com");

        //naviagte back

        driver.navigate().back();

        // navigate forward
        driver.navigate().forward();

        // for refreshinh the page
        driver.navigate().refresh();

        // quitting thbe browser
        driver.quit();

    }
}
