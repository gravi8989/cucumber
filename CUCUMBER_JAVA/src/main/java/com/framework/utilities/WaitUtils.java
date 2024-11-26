package com.framework.utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.base.BaseTest;

public class WaitUtils extends BaseTest {

	public static void waitForElementVisible(By locator, Duration timeout) {
	
		By b = By.xpath("vvg");
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
