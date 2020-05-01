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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author shekh
 */
public class TourismWebsiteTest {

    public TourismWebsiteTest() {
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
        //driver.quit();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testLogin() {
        driver.get("http://newtours.demoaut.com/");
        driver.findElement(By.name("userName")).sendKeys("mercury");
        driver.findElement(By.name("password")).sendKeys("mercury");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.xpath("//input[@value='oneway']")).click();
        Select pasengers = new Select(driver.findElement(By.name("passCount")));
        pasengers.selectByValue("2");
        Select departingfrom = new Select(driver.findElement(By.name("fromPort")));
        departingfrom.selectByVisibleText("New York");
        Select departingMonth = new Select(driver.findElement(By.name("fromMonth")));
        departingMonth.selectByVisibleText("April");
        Select day = new Select(driver.findElement(By.name("fromDay")));
        day.selectByIndex(1);
        Select destination = new Select(driver.findElement(By.name("toPort")));
        destination.selectByValue("San Francisco");
        Select returnigMonth = new Select(driver.findElement(By.name("toMonth")));
        returnigMonth.selectByVisibleText("April");
        Select returnigDate = new Select(driver.findElement(By.name("toDay")));
        returnigDate.selectByIndex(5);
        driver.findElement(By.xpath("//input[@value='Coach']")).click();
        Select airLine = new Select(driver.findElement(By.name("airline")));
        airLine.selectByVisibleText("Unified Airlines");
        driver.findElement(By.xpath("//input[@src='/images/forms/continue.gif']")).click();
    }
    @Test
    public void testRadio(){
        driver.get("http://newtours.demoaut.com/");
        driver.findElement(By.name("userName")).sendKeys("mercury");
        driver.findElement(By.name("password")).sendKeys("mercury");
        driver.findElement(By.name("login")).click();
        driver.findElements(By.linkText("Type:")).get(1).click();
        
    }
}
