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
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author shekh
 */
public class SchamburgMarketPlaceTest {

    public SchamburgMarketPlaceTest() {
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
        // driver.quit();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    /* @Test
    public void testEventsSmp() {
        //driver.get("https://www.schaumburgmarketplace.com");
        //driver.findElement(By.linkText("Business Directory")).click();
        //driver.findElement(By.xpath("//a[@href='https://www.schaumburgmarketplace.com/services/']")).click();
        //driver.findElement(By.linkText("Offers")).click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.get("https://www.schaumburgmarketplace.com/events/");
        driver.findElement(By.name("tribe-bar-date")).sendKeys("4/6/2020");
        //driver.findElement(By.name("tribe-bar-search")).sendKeys("4/6/2020");
        driver.findElement(By.xpath("//input[@name='tribe-bar-search']")).sendKeys("family");
        //driver.findElement(By.xpath("//input[@aria-label='Submit Events search']")).click();
        try {

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Submit Events search']")));

        } catch (Exception e) {
            System.out.println("oh");
        }
        driver.findElement(By.xpath("//input[@aria-label='Submit Events search']")).click();

    }*/

 /*@Test
    public void testEvents1() {
        driver.get("https://www.schaumburgmarketplace.com/events/");
        WebDriverWait wait = new WebDriverWait(driver, 5);

        try {

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='tribe-events-nav-previous']//a[@rel='prev']")));
        } catch (Exception e) {
            System.out.println("hi");
        }
        driver.findElement(By.xpath("//li[@class='tribe-events-nav-previous']//a[@rel='prev']")).click();
    }*/
    @Test
    public void testEvents2() {

        driver.get("https://www.schaumburgmarketplace.com/events/");
        WebElement e = driver.findElement(By.name("s"));
        e.sendKeys("family");
        e.submit();
    }

    /* @Test
    public void testEvents3() {

        driver.get("https://www.schaumburgmarketplace.com");
        // driver.findElement(By.linkText("Offers")).click();
        // driver.findElement(By.xpath("//a[@href='https://www.schaumburgmarketplace.com/services']")).click();
        //  driver.findElement(By.xpath("//a[@text()='Offers']")).click();
        //driver.findElement(By.partialLinkText("offers")).click();
        WebDriverWait wait = new WebDriverWait(driver, 50);

        try {

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@href,'offers')]")));

        } catch (Exception e) {
            System.out.println("hi");
        }
        driver.findElement(By.xpath("//*[contains(@href,'offers')]")).click();
    }*/
   /* @Test
    public void testEvents4() {
        driver.get("https://www.schaumburgmarketplace.com");
        WebDriverWait wait = new WebDriverWait(driver, 50);

        try {

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//*[@id='menu-item-949']/a//parent::li"))));

        } catch (Exception e) {
            System.out.println("hi");
        }
        driver.findElement(By.xpath("//*[@id='menu-item-949']/a//parent::li")).click();

    }*/

  /*  @Test
    public void testEvents5() {
        driver.get("https://www.schaumburgmarketplace.com");
        WebDriverWait wait = new WebDriverWait(driver, 50);
        try {

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@aria-current='page']")));

        } catch (Exception e) {
            System.out.println("hi");
        }
        driver.findElement(By.xpath("//a[@aria-current='page']")).click();
    }*/

  /*  @Test
    public void testEvents6() {
        driver.get("https://www.schaumburgmarketplace.com");
        WebDriverWait wait = new WebDriverWait(driver, 50);

        // WebDriverWait wait = new WebDriverWait(driver, 50);
        //try {
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@aria-current='page']")));
        //  } catch (Exception e) {
        //  System.out.println("hi");
        // }
        //driver.findElement(By.linkText("About Us")).click();
        try {

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://www.schaumburgmarketplace.com/offers/']")));

        } catch (Exception e) {
            System.out.println("hi");
        }
        //System.out.println("done");
        driver.findElement(By.xpath("//a[@href='https://www.schaumburgmarketplace.com/offers/']")).click();

    }*/
    WebDriver wait;

    @Test
    public void mouse() throws InterruptedException {
        driver.get("https://www.schaumburgmarketplace.com");
        Thread.sleep(3000);
        // Actions action = new Actions(driver);

        // action.moveToElement(driver.findElement(By.linkText("Offers"))).click().build().perform();
        //  driver.findElement(By.cssSelector(a:contains("Offers"))).
        // driver.findElement(By.className("mobile-menu-btn")).click();
        //Thread.currentThread().sleep(3000);
        //driver.findElement(By.xpath("//li[@id='menu-item-949']")).click();
        // new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(e));
        driver.findElement(By.xpath("//*[@id='menu-item-949']/a")).click();
    }

    @Test
    public void testServices() throws InterruptedException {
        driver.get("https://www.schaumburgmarketplace.com");
        Thread.sleep(3000);
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//*[@id='menu-item-169']/a"))).build().perform();
        //driver.findElement(By.xpath("//li[@id='menu-item-169']")).click();
        driver.findElement(By.id("menu-item-336")).click();

    }

   /* @Test
    public void testServicesSelect() throws InterruptedException {
        driver.get("https://www.schaumburgmarketplace.com");
        Thread.sleep(5000);
        // driver.findElement(By.xpath("//*[@id='menu-item-169']/a")).click();
        Select dropDown = new Select(driver.findElement(By.xpath("//*[@id='menu-item-169']/a")));
        dropDown.selectByIndex(0);
        // driver.get("https://www.schaumburgmarketplace.com/local-community/");
        //  Thread.sleep(5000); 

        //driver.findElement(By.xpath("//img[@alt='Parks']")).click();
    }*/

    @Test
    public void testBusiness() throws InterruptedException {

        driver.get("https://www.schaumburgmarketplace.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[@id='menu-item-361']//a[contains(text(),'Business Directory')]")).click();
        driver.findElement(By.id("wpbdp-main-box-keyword-field")).sendKeys("Accounting");
        driver.findElement(By.name("zipcodesearch[radius]")).clear();
        driver.findElement(By.name("zipcodesearch[radius]")).sendKeys("15");
        driver.findElement(By.className("wpbdp-zipcodesearch-zip")).sendKeys("60056");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='wpbdp-bar-view-listings-button']")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("New York Life Insurance Company")).click();
    }

    @Test
    public void tsetPar() throws InterruptedException {
        driver.get("https://www.schaumburgmarketplace.com");
        Thread.sleep(3000);

        driver.findElement(By.partialLinkText("OFFERS")).click();
        //driver.findElement(By.id("menu-item-169")).click();

    }

    /* @Test
    public void scrollTest(){
       driver.get("http://www.infotekguide.com");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        //Scrolling
       js.executeScript("window.scrollBy(0,2000)");
        //Opening a new tab
       // js.executeScript("window.open()");
       TakesScreenshot screen=(TakesScreenshot)driver;
        File file=new File("C:\\Users\\shekh\\OneDrive\\Pictures\\screenshot.png");
        file=screen.getScreenshotAs(OutputType.FILE);
        
        
       
    }*/
    @Test
    public void TestServices() throws InterruptedException {
        driver.get("https://www.schaumburgmarketplace.com");
        Thread.sleep(3000);
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//nav[@class='main-menu-container']//a[contains(text(),'Services')]"))).build().perform();
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//li[@id='menu-item-339']/a")).click();

    }

    @Test
    public void testbacktop() throws InterruptedException {
        driver.get("https://www.schaumburgmarketplace.com");
        Thread.sleep(3000);
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//li[@id='menu-item-172']/a"))).build().perform();
        driver.findElement(By.xpath("//li[@id='menu-item-171']/a")).click();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,2000)");
        driver.findElement(By.xpath("//*[@id='page-footer']/div/div/span/span[2]")).click();

    }

}
