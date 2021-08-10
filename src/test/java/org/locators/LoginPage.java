package org.locators;

import org.base.ReusableClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends ReusableClass{
     
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement txtUser;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//input[@id='login']")
	private WebElement login;
	
	//Getter
	
	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getLogin() {
		return login;
	}
	
	   public void login(String userName,String password) {
		   sendText(getTxtUser(),userName);
		   sendText(getTxtPassword(),password);
		   btnClick(getLogin());

	}
	
	
	
	

}
