package com.xyz.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.xyz.qa.base.TestBase;

public class HomePageNavigationPage extends TestBase {

	@FindBy(xpath = "//button[contains(text(),'Customer Login')]")
	WebElement customerLoginButton;

	@FindBy(xpath = "//button[normalize-space()='Home']")
	WebElement homeButton;

	@FindBy(xpath = "(//button[normalize-space()='Bank Manager Login'])[1]")
	WebElement BankManagerBtn;



public HomePageNavigationPage() {
	PageFactory.initElements(driver, this);
}

public void Homepagefunction() {
	
	String title = driver.getTitle();
	Assert.assertEquals(title, "XYZ Bank", "Title is Wrong");
	System.out.println("Title Matched : XYZ Bank");

	waitForElementToBeVisible(customerLoginButton).click();
	System.out.println("Customer Login Button Clicked");
	waitForElementToBeVisible(homeButton).click();
	System.out.println("Home Button Clicked");
	waitForElementToBeVisible(BankManagerBtn).click();
	System.out.println("Bank Manager Login Button Clicked");
	waitForElementToBeVisible(homeButton).click();
	System.out.println("Home Button Clicked");
	driver.quit();
}
private WebElement waitForElementToBeVisible(WebElement element) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	return wait.until(ExpectedConditions.visibilityOf(element));
}
}
