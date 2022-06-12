package com.vytrack.test_features.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VyTrackLogin {
    public static void loginVytrack(WebDriver driver, String username, String password){
        driver.findElement(By.xpath("//input[@name='_username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name='_password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
