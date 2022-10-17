package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {

        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "C:/Users/azadr/selenium/chromedriver/chromedriver.exe");
            WebDriver driver= new ChromeDriver();

            //Test
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //maximize window
            driver.manage().window().maximize();

            //closing the browser
            driver.close();

            //open browser with desried URL
            driver.get("https://www.google.com");
        }


}