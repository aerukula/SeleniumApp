/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seleniumapp.Test;

import com.mycompany.seleniumapp.DriverUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;

/**
 *
 * @author shekh
 */
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MyOwnSeleniumTest {

    public MyOwnSeleniumTest() {
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
        driver.manage().window().maximize();
        //Options option=driver.manage();

        // Window w=option.window();
        // w.maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    //@FixMethodOrder(MethodSorters.NAME_ASCENDING)
    @Test
    public void testGmailLogin() {
        driver.get("https:\\www.google.com");
        driver.findElement(By.className("gb_g")).click();

    }

    @Test
    public void testRandom() {
        driver.get("https://www.itexps.net");

    }

    @Test
    public void testGoogleImages() {
        // Assume.assumeTrue(false);
        driver.get("https:\\www.google.com");
        driver.findElement(By.linkText("Images")).click();

    }
}
