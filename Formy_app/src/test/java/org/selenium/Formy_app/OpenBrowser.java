package org.selenium.Formy_app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;

public class OpenBrowser 
{
	WebDriver driver;

	@BeforeClass
	public void open_formy_app()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void verify_title ()
	{
		driver.get("");
	}
}


