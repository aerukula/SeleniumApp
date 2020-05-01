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
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author shekh
 */
public class EbaySearchTest {

    public EbaySearchTest() {
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
        //driver.close();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
  /* @Test
    public void searchBarEbay() {
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("fashion");
        driver.findElement(By.xpath("//input[@type='submit']")).submit();
        driver.findElement(By.xpath("//a[@_sp='p2351460.m4117.l8280.c9']")).click();
        driver.findElement(By.xpath("//img[@alt='Sanctuary Clothing Womens Zambia Embroidered Knit Blouse']")).click();
        Select category = new Select(driver.findElement(By.xpath("//select[@class='gh-sb ']")));
        category.selectByVisibleText("Books");

    }*/

   /* @Test
    public void testRegistration() {
        driver.get("https://www.ebay.com/");
        driver.findElement(By.linkText("register")).click();
        //driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.name("firstname")).sendKeys("alekhya");
        driver.findElement(By.name("lastname")).sendKeys("erukula");
        driver.findElement(By.name("email")).sendKeys("alekhya_cs@yahoo.co.in");
        driver.findElement(By.name("PASSWORD")).sendKeys("Csr_reca402");
        //driver.findElement(By.linkText("Create account")).submit();
        //driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 50);

        try {

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ppaFormSbtBtn")));

        } catch (Exception e) {
            System.out.println("hi");
        }
        driver.findElement(By.id("ppaFormSbtBtn")).click();
        //  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // File destfile=new File("C:\\new pic123");
        //  FileUtils.copyFile(src,destfile);

    }*/

    @Test
    public void testusingMouse() throws InterruptedException {
        driver.get("https://www.ebay.com/");
       Actions action = new Actions(driver);
       Thread.sleep(5000);
        action.moveToElement(driver.findElement(By.linkText("Fashion"))).build().perform();
      driver.findElement(By.linkText("Watches")).click();
/*driver.findElement(By.id("gh-ac")).sendKeys("Men Cologne");
    	driver.findElement(By.id("gh-cat")).sendKeys("Health & Beauty");
    	driver.findElement(By.cssSelector("#gh-btn")).click();
    	//driver.findElement(By.className("s-item__title s-item__title--has-tags")).click();
        driver.findElement(By.xpath("//h3[@class='s-item__title s-item__title--has-tags']")).click();*/
    }
}
