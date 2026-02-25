package com.testng;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class Assessment2 {

    @Test
    public void handleAdvancedControls() {

        // TODO 1: Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // TODO 2: Create WebDriverWait with 10 seconds timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {

            driver.manage().window().maximize();

            // ================= ALERT HANDLING =================

            // TODO 3: Navigate to JavaScript Alerts page
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");

            // TODO 4: Click "Click for JS Alert" button
            driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
            //driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

            // TODO 5: Wait for alert to be present
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());

            // TODO 6: Accept the alert
            alert.accept();


            // ================= WINDOW HANDLING =================

            // TODO 7: Navigate to Multiple Windows page
            driver.get("https://the-internet.herokuapp.com/windows");

            // TODO 8: Click "Click Here" link
            String parentWindow = driver.getWindowHandle();
            driver.findElement(By.linkText("Click Here")).click();

            // TODO 9 & 10: Switch to newly opened window
            Set<String> allWindows = driver.getWindowHandles();

            for (String window : allWindows) {
                if (!window.equals(parentWindow)) {
                    driver.switchTo().window(window);
                }
            }


            // ================= IFRAME HANDLING =================

            // TODO 11: Navigate to iframe page
            driver.get("https://the-internet.herokuapp.com/iframe");

            // TODO 12: Switch into iframe using id mce_0_ifr
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mce_0_ifr"));

            // TODO 13: Locate editor element and retrieve text
            WebElement editor = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("tinymce"))
            );

            String text = editor.getText();
            System.out.println("Iframe text content: " + text);

        }
        catch (Exception e) {

            // TODO 14: Handle exception
            System.out.println("Exception occurred: " + e.getMessage());
        }
        finally {

            // TODO 15: Quit the browser
            driver.quit();
        }
    }
}

