/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seleniumapp.Test;

import com.mycompany.seleniumapp.DriverUtils;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author shekh
 */
public class DragandDropTest {

    public DragandDropTest() {
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
        driver.manage().deleteAllCookies();
        option.timeouts().implicitlyWait(50, TimeUnit.SECONDS);

    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    // Actions action = new Actions(driver);
    Actions action;

    @Test
    public void testDrag() {
        driver.get("https://jqueryui.com/");
        driver.findElement(By.linkText("Droppable")).click();
        driver.switchTo().frame(0);
        action = new Actions(driver);
        action.clickAndHold(driver.findElement(By.id("draggable")))
                .moveToElement(driver.findElement(By.id("droppable")))
                .release().build().perform();

    }

    @Test
    public void testMouse() throws InterruptedException {
        driver.get("https://jqueryui.com/");
        Thread.sleep(5000);

        action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("Resizable"))).click().build().perform();
       // Action rightClick = action.contextClick(driver.findElement(By.linkText("Resizable"))).contextClick().build();
       // rightClick.perform();
       // driver.findElement(By.linkText("Resizable")).sendKeys(Keys.ARROW_DOWN);

    }
}
