package java.tutorial.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Create a new instance of the Firefox driver

        System.setProperty("webdriver.chrome.driver", "libs/drivers/chrome/mac/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Launch the Online Store Website
        driver.get("http://www.store.demoqa.com");

        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");

        //Wait for 5 Sec
        Thread.sleep(5);

        // Close the driver
        driver.quit();
    }
}