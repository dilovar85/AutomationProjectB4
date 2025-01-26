package io.loop.test.homework.practiceTask1;
/*

1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Validate title:
Expected: “Wooden spoon | Etsy”
 */

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;

public class task2 {
    public static void main(String[] args) {

        // Open Chrome browser
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);

        //Go to https://www.etsy.com
        driver.get("https://www.etsy.com");
        driver.manage().window().maximize();

        // Search for “wooden spoon”

    }
}
