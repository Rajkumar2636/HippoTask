package com.hippo.driver;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.thucydides.core.webdriver.DriverSource;

public class DriverFactory implements DriverSource{

	@Override
	public WebDriver newDriver() {
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\libs\\chromedriver.exe");		
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 0);
		prefs.put("download.default_directory", System.getProperty("user.dir") + "\\reports");
		prefs.put("safebrowsing.enabled", "true");
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--start-maximized");
		options.addArguments("disable-extensions");
		driver = new ChromeDriver(options);
		return driver;
	}

	@Override
	public boolean takesScreenshots() {
		// TODO Auto-generated method stub
		return false;
	}

}
