package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper 
{
	public WebDriver driver;
	public	WebElement element ;
	public	WebDriverWait wait;
	public WaitHelper(WebDriver driver)
	{
		this.driver=driver;
	}

	public void waitForElement(WebElement camIcon, int i) 
	{
		wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));

	}


}
