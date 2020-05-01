/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seleniumapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author shekh
 */
public class DriverUtils {

    /**
     * @param args the command line arguments
     */
    public static WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "c:\\drive\\chromedriver.exe");
        return new ChromeDriver();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        getChromeDriver();
    }

}
