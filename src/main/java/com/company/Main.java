package com.company;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {


        // it save us from https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/4.3.1

        //ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        WebDriver drievr = new ChromeDriver();

        drievr.get("https://amazon.com");
    }
}