package com.framework.hooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import com.framework.base.BaseTest;
import com.framework.utilities.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
    private BaseTest baseTest = new BaseTest();

    @Before
    public void setUp() {
        baseTest.reader = new ConfigReader();
        String baseUrl = baseTest.reader.getProperty("base.url");
        WebDriverManager.chromedriver().setup();
        BaseTest.driver = new ChromeDriver();
        BaseTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        BaseTest.driver.manage().window().maximize();
        BaseTest.driver.get(baseUrl);
    }

    @After
    public void tearDown() {
        if (BaseTest.driver != null) {
            BaseTest.driver.quit();
        }
    }
}
