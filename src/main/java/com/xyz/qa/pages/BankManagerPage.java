package com.xyz.qa.pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.xyz.qa.base.TestBase;

public class BankManagerPage extends TestBase {

	@FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
	WebElement managerLoginbtn;

	@FindBy(xpath = "//button[contains(text(),'Add Customer')]")
	WebElement addCustomer;

	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement firstname;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement lastname;

	@FindBy(xpath = "//input[@placeholder='Post Code']")
	WebElement pincode;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitbtn;

	@FindBy(xpath = "//button[contains(text(),'Open Account')]")
	WebElement openaccount;

	@FindBy(xpath = "//button[normalize-space()='Process']")
	WebElement processbtn;

	@FindBy(xpath = "(//select[@id='userSelect'])[1]")
	WebElement dropdown;

	@FindBy(xpath = "//select[@id='currency']")
	WebElement dropdown2;

	@FindBy(xpath = "//button[normalize-space()='Customers']")
	WebElement customersbtn;

	@FindBy(xpath = "//input[@placeholder='Search Customer']")
	WebElement searchbox;

	@FindBy(xpath = " (//button[normalize-space()='Delete'])[1]")
	WebElement deletebtn;

	@FindBy(xpath = "//button[normalize-space()='Home']")
	WebElement homebtn;

	public BankManagerPage() {
		PageFactory.initElements(driver, this);
	}
	// Method to add a customer using valid credentials
	public void addcustomer(String fn, String ln, String pc) {
		WebElement visiblemanagerLoginbtn = waitForElementToBeVisible(managerLoginbtn);
		visiblemanagerLoginbtn.click();
		System.out.println("Manager Login Button is Clicked :");

		WebElement visibleaddCustomer = waitForElementToBeVisible(addCustomer);
		visibleaddCustomer.click();
		System.out.println("Add Customer Button is Clicked :");

		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		pincode.sendKeys(pc);
		
		submitbtn.click();
		Alert alt = driver.switchTo().alert();
		String altertext1 = alt.getText();
		alt.accept();
		System.out.println(altertext1);

		driver.quit();

	}
	// Method to add a customer using invalid credentials
	public void invalid(String fn, String ln, String pc) {
		// Clicking on the manager login button
		WebElement visiblemanagerLoginbtn = waitForElementToBeVisible(managerLoginbtn);
		visiblemanagerLoginbtn.click();
		System.out.println("Manager Login Button is Clicked :");
		
		 // Clicking on the add customer button
		WebElement visibleaddCustomer = waitForElementToBeVisible(addCustomer);
		visibleaddCustomer.click();
		System.out.println("Add Customer Button is Clicked :");

		// Entering customer details
		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		pincode.sendKeys(pc);
		// Clicking on the submit button
		submitbtn.click();
		// Handling alert
		Alert alt = driver.switchTo().alert();
		String altertext1 = alt.getText();
		alt.accept();
		System.out.println(altertext1);
		
		driver.quit();

	}

	public void openaccount(String fn, String ln, String pc) {
		WebElement visiblemanagerLoginbtn = waitForElementToBeVisible(managerLoginbtn);
		visiblemanagerLoginbtn.click();
		System.out.println("Manager Login Button is Clicked :");

		WebElement visibleaddCustomer = waitForElementToBeVisible(addCustomer);
		visibleaddCustomer.click();
		System.out.println("Add Customer Button is Clicked :");

		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		pincode.sendKeys(pc);

		submitbtn.click();
		Alert alt = driver.switchTo().alert();
		String altertext1 = alt.getText();
		alt.accept();
		System.out.println(altertext1);

		WebElement visibleopenaccount = waitForElementToBeVisible(openaccount);
		visibleopenaccount.click();
		System.out.println("Open Account Button is Clicked :");

		WebElement visibledropdown = waitForElementToBeVisible(dropdown);
		Select sel = new Select(visibledropdown);

		for (int index = 0; index < 7; index++) {
			sel.selectByIndex(index);
			System.out.println("Atharva Deshmukh is Selected from Drop-Down Menu");
		}

		WebElement visibledropdown2 = waitForElementToBeVisible(dropdown2);
		Select sel2 = new Select(visibledropdown2);

		for (int index = 0; index < 4; index++) {
			sel2.selectByIndex(index);
			System.out.println("Rupee Selected from second Drop-Down Menu");
		}

		processbtn.click();
		String altertext2 = alt.getText();
		alt.accept();
		System.out.println(altertext2);
		driver.quit();
	}

	public void customer(String fn, String ln, String pc) {
		WebElement visiblemanagerLoginbtn = waitForElementToBeVisible(managerLoginbtn);
		visiblemanagerLoginbtn.click();
		System.out.println("Manager Login Button is Clicked :");

		WebElement visibleaddCustomer = waitForElementToBeVisible(addCustomer);
		visibleaddCustomer.click();
		System.out.println("Add Customer Button is Clicked :");

		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		pincode.sendKeys(pc);

		submitbtn.click();
		Alert alt = driver.switchTo().alert();
		String altertext1 = alt.getText();
		alt.accept();
		System.out.println(altertext1);

		WebElement visibleopenaccount = waitForElementToBeVisible(openaccount);
		visibleopenaccount.click();
		System.out.println("Open Account Button is Clicked :");

		WebElement visibledropdown = waitForElementToBeVisible(dropdown);
		Select sel = new Select(visibledropdown);

		for (int index = 0; index < 7; index++) {
			sel.selectByIndex(index);
			System.out.println("Atharva Deshmukh is Selected from Drop-Down Menu");
		}

		WebElement visibledropdown2 = waitForElementToBeVisible(dropdown2);
		Select sel2 = new Select(visibledropdown2);

		for (int index = 0; index < 4; index++) {
			sel2.selectByIndex(index);
			System.out.println("Rupee Selected from second Drop-Down Menu");
		}

		processbtn.click();
		String altertext2 = alt.getText();
		alt.accept();
		System.out.println(altertext2);

		WebElement visiblecustomersbtn = waitForElementToBeVisible(customersbtn);
		visiblecustomersbtn.click();
		System.out.println("Customers button is Clicked :");

		searchbox.sendKeys(fn);
		System.out.println("Atharva is added in the inputbox:");

		WebElement visibledelbtn = waitForElementToBeVisible(deletebtn);
		visibledelbtn.click();
		System.out.println("Atharva Deshmukh is deleted:");
		homebtn.click();
		System.out.println("Home Button is clicked:");
		driver.quit();

	}

	public void existing(String fn) {
		WebElement visiblemanagerLoginbtn = waitForElementToBeVisible(managerLoginbtn);
		visiblemanagerLoginbtn.click();
		System.out.println("Manager Login Button is Clicked :");

		WebElement visibleopenaccount = waitForElementToBeVisible(openaccount);
		visibleopenaccount.click();
		System.out.println("Open Account Button is Clicked :");

		WebElement visibledropdown = waitForElementToBeVisible(dropdown);
		Select sel = new Select(visibledropdown);

		for (int index = 0; index < 2; index++) {
			sel.selectByIndex(index);
			System.out.println("Hermoine Granger Selected from Drop-Down Menu");
		}

		WebElement visibledropdown2 = waitForElementToBeVisible(dropdown2);
		Select sel2 = new Select(visibledropdown2);

		for (int index = 0; index < 4; index++) {
			sel2.selectByIndex(index);
			System.out.println("Rupee Selected from second Drop-Down Menu");
		}

		processbtn.click();
		Alert alt = driver.switchTo().alert();
		String altertext2 = alt.getText();
		alt.accept();
		System.out.println(altertext2);
		WebElement visiblecustomersbtn = waitForElementToBeVisible(customersbtn);
		visiblecustomersbtn.click();
		System.out.println("Customers button is Clicked :");

		searchbox.sendKeys(fn);
		System.out.println("Hermoine is added in the inputbox:");

		homebtn.click();
		System.out.println("Home Button is clicked:");

		driver.quit();
	}

	protected WebElement waitForElementToBeVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	
}