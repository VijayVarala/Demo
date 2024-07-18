package com.titrate.testCases;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.titrate.pageObjects.LoginPage;
import com.titrate.utilities.Capture;

public class TC_001_VerifyLogin extends BaseClass 
{
	@Test
	public void login() throws InterruptedException, IOException 
	{
		driver.get(baseURL);

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		LoginPage lp =new LoginPage(driver);
		lp.setUserName(uname);
		//Thread.sleep(1000);
		lp.setPassword(password);
		//Thread.sleep(2000);
		lp.clickSubmit();
		Thread.sleep(2000);
		if(driver.getCurrentUrl().equals("http://183.82.108.168/dashboard")) 
		{
			Assert.assertTrue(true);

			System.out.println("Login done successfully");
			captureScreen(driver, "login");
		}
		else
		{
			System.out.println("Login failed");
			
			Capture.CaptureScreenshot(driver, "img.png");
			Assert.assertTrue(false);
		}

	}


}
