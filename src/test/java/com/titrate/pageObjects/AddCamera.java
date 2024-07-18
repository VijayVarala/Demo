package com.titrate.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddCamera
{
	
		public AddCamera(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//*[@src='/src/assets/addCam1.svg']")
		WebElement camIcon;
		
		@FindBy(xpath="//img[@src='/src/assets/add.svg']")
		WebElement addCam;
		
		@FindBy(name="camera_name")
		WebElement txtCamName;
		
		
		@FindBy(name="serial_number")
		WebElement txtSlno;
		
		@FindBy(xpath="(//div[@role='combobox'])[2]")
		WebElement modeldropdown;
		
		@FindBy(xpath="(//li[@role='option'])[3]")
		WebElement models;
		
	
		@FindBy(name="url")
		WebElement txtUrl;
		
		@FindBy(xpath="//*[@data-testid='AddCircleOutlinedIcon']")
		WebElement btnSave;
		
		
		public void clickCamIcon()
		{
			camIcon.click();
		}
		
		public void clickAddCam()
		{
			addCam.click();
		}
		
		public void setCamName(String camname) 
		{
			txtCamName.sendKeys(camname);
		}
		
		public void setSlno(String slno) 
		{
			txtSlno.sendKeys(slno);
		}
		
		public void clickModel()
		{
			modeldropdown.click();
		}
		
		public void setModel() 
		{
			models.click();
		}
		
		public void setUrl(String url) 
		{
			txtUrl.sendKeys(url);
		}
		
		public void clickSave()
		{
			btnSave.click();
		}
		

}
