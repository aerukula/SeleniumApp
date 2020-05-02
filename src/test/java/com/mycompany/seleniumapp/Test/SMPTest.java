/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seleniumapp.Test;

import com.mycompany.seleniumapp.DriverUtils;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author shekh
 */
public class SMPTest {

    public SMPTest() {
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

    @Test // this is to verify about us page
    public void testAboutusTab() throws InterruptedException {
        driver.get("https://www.schaumburgmarketplace.com");
        Thread.sleep(5000);
        driver.findElement(By.partialLinkText("ABOUT US")).click();
        Thread.sleep(3000);
        driver.navigate().back();

    }

    @Test // this is to click on OURTeam option
    public void testAboutusOurTeam() throws InterruptedException {
        driver.get("https://www.schaumburgmarketplace.com");
        Thread.sleep(5000);
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.partialLinkText("ABOUT US"))).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[@id='menu-item-413']/a")).click();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,700)");
    }

    @Test // this is positive case scenario for contacting us
    public void testAboutusContactus() throws InterruptedException {
        driver.get("https://www.schaumburgmarketplace.com");
        Thread.sleep(5000);
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.partialLinkText("ABOUT US"))).build().perform();
        driver.findElement(By.xpath("//li[@id='menu-item-171']/a")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Potato");
        driver.findElement(By.id("wpforms-52819-field_0-last")).sendKeys("Head");
        driver.findElement(By.id("wpforms-52819-field_3")).sendKeys("1111111111");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("potato@gmail.com");
        driver.findElement(By.xpath("//input[@id='wpforms-52819-field_1-secondary']")).sendKeys("potato@gmail.com");
        driver.findElement(By.xpath("//textarea[@id='wpforms-52819-field_2']")).sendKeys("Testing The Website");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("5");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }

    @Test //this is negative case scenario to contact us
    public void testAboutusContactusn() throws InterruptedException {
        driver.get("https://www.schaumburgmarketplace.com");
        Thread.sleep(5000);
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.partialLinkText("ABOUT US"))).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[@id='menu-item-171']/a")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Potato");
        driver.findElement(By.id("wpforms-52819-field_0-last")).sendKeys("Head");
        driver.findElement(By.id("wpforms-52819-field_3")).sendKeys("111");
        driver.findElement(By.xpath("//input[@id='wpforms-52819-field_1']")).sendKeys("potato@gmail.com");
        driver.findElement(By.xpath("//input[@id='wpforms-52819-field_1-secondary']")).sendKeys("potato@gmail.com");
        driver.findElement(By.xpath("//textarea[@id='wpforms-52819-field_2']")).sendKeys("Testing The Website");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("5");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        TakesScreenshot screen = (TakesScreenshot) driver;
        File file = new File("C:\\qa\\screenshot.png");
        file = screen.getScreenshotAs(OutputType.FILE);
    }

    @Test // to verify back to top button option is working 
    public void testbacktop() throws InterruptedException {
        driver.get("https://www.schaumburgmarketplace.com");
        Thread.sleep(3000);
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//li[@id='menu-item-172']/a"))).build().perform();
        driver.findElement(By.xpath("//li[@id='menu-item-171']/a")).click();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//footer[@id='page-footer']/div/div/span/span[2]")).click();

    }

    @Test //this is for navigating to the facebook page from FAQ
    public void testAboutusFaqF() throws InterruptedException {
        driver.get("https://www.schaumburgmarketplace.com");
        Thread.sleep(5000);
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.partialLinkText("ABOUT US"))).build().perform();
        Thread.sleep(5000);
        driver.findElement(By.partialLinkText("FAQ")).click();
        Thread.sleep(5000);
        driver.findElement(By.partialLinkText("Facebook")).click();
        String str = driver.getTitle();
        System.out.println(str);
        //Alert alert = driver.switchTo().alert();
        //String alertMessage = driver.switchTo().alert().getText();
        // System.out.println(alertMessage);

    }

    @Test //this is to navigato to the linked in page from the FAQ
    public void testAboutusFaqL() throws InterruptedException {
        driver.get("https://www.schaumburgmarketplace.com");
        Thread.sleep(5000);
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.partialLinkText("ABOUT US"))).build().perform();
        Thread.sleep(5000);
        driver.findElement(By.partialLinkText("FAQ")).click();
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        driver.findElement(By.partialLinkText("LinkedIn")).click();

    }

}
