/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seleniumapp.Test;

import com.mycompany.seleniumapp.DriverUtils;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;

/**
 *
 * @author shekh
 */
public class TkeScreenShot {

    public TkeScreenShot() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }
    WebDriver driver;

    @Before
    public void setUp() {

        driver = DriverUtils.getChromeDriver();
        WebDriver.Options option = driver.manage();
        WebDriver.Window w = option.window();
        w.maximize();
        option.timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void scrollTest() {
        driver.get("http://www.infotekguide.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Scrolling
        js.executeScript("window.scrollBy(0,2000)");
        //Opening a new tab
        // js.executeScript("window.open()");
        TakesScreenshot screen = (TakesScreenshot) driver;
        File file = new File("C:\\qa\\screenshot.png");
        file = screen.getScreenshotAs(OutputType.FILE);
    }

    @Test
    public void screenShot() throws IOException {

        driver.get("http://learn-automation.com/");

        System.out.println("Title is " + driver.getTitle());

        TakesScreenshot ts = (TakesScreenshot) driver;

        try {
            FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\shekh\\OneDrive\\Pictures\\screenshots"));
        } catch (WebDriverException e) {

        } catch (IOException e) {

        }
    }

    @Test
    public void testScreen() {
        driver.get("http://demo.guru99.com/V4/");
        try {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            //The below method will save the screen shot in destination directory with name "screenshot.png"
            FileHandler.copy(scrFile, new File("C:\\Users\\shekh\\OneDrive\\Pictures\\screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
