package com.xyz.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.xyz.qa.base.TestBase;

public class CustomerPage extends TestBase {

	@FindBy(xpath = "//button[contains(text(),'Customer Login')]")
	WebElement customerLoginButton;

	@FindBy(xpath = "//button[normalize-space()='Home']")
	WebElement homeButton;

	@FindBy(xpath = "//select[@id='userSelect']")
	WebElement userlistDDM;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement loginbtn;

	@FindBy(xpath = "//select[@id='accountSelect']")
	WebElement accSelDDM;

	@FindBy(xpath = "//button[normalize-space()='Deposit']")
	WebElement depositBtn;

	@FindBy(xpath = "//button[normalize-space()='Withdrawl']")
	WebElement withdrawalBtn;

	@FindBy(xpath = "//button[normalize-space()='Transactions']")
	WebElement transactionsBtn;

	@FindBy(xpath = "//input[@placeholder='amount']")
	WebElement inputDeposit;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement depositSubmitBtn;

	@FindBy(xpath = "//input[@placeholder='amount']")
	WebElement inputWithdraw;

	@FindBy(xpath = "//button[normalize-space()='Withdraw']")
	WebElement withdrawSubmitBtn;

	@FindBy(xpath = "//button[normalize-space()='Withdraw']")
	WebElement arrowBtn;

	@FindBy(xpath = "//button[normalize-space()='Reset']")
	WebElement resetBtn;

	@FindBy(xpath = "//strong[normalize-space()='1005']")
	WebElement accNumber;

	@FindBy(xpath = "//strong[normalize-space()='0']")
	WebElement accBalance;

	@FindBy(xpath = "//button[normalize-space()='Back']")
	WebElement backBtn;

	@FindBy(xpath = "//input[@id='start']")
	WebElement dateBtn1;

	@FindBy(xpath = "//input[@id='end']")
	WebElement dateBtn2;

	@FindBy(xpath = "//span[contains(text(),'Harry Potter')]")
	WebElement text;

	@FindBy(xpath = "(//strong[normalize-space()='Pound'])[1]")
	WebElement currency;
	
	@FindBy(xpath = "//button[contains(text(),'Logout')]")
	WebElement Logout;
	
	
	public CustomerPage() {
		PageFactory.initElements(driver, this);
	}

	public void logincustomerinfo() {
		waitForElementToBeVisible(customerLoginButton).click();
		System.out.println("Customer Login Button is clicked");

		WebElement visibleuserlistDropMenu = waitForElementToBeVisible(userlistDDM);
		Select sel = new Select(visibleuserlistDropMenu);
		for (int index = 0; index < 3; index++) {
			sel.selectByIndex(index);
			System.out.println("Drop-Down Menu is Selected");
		}

		waitForElementToBeVisible(loginbtn).click();

		WebElement visibleaccSelDropMenu = waitForElementToBeVisible(accSelDDM);

		Select sel2 = new Select(visibleaccSelDropMenu);
		for (int index = 0; index < 2; index++) {
			sel2.selectByIndex(index);

			System.out.println("Drop-Down Menu is Selected");

		}
		String S1 = accNumber.getText();
		String S2 = accBalance.getText();
		String S3 = text.getText();
		String S4 = currency.getText();

		Assert.assertEquals(S1, "1005", "Account Number is WRONG.");
		System.out.println("Actual Account Number : 1005");
		
		Assert.assertEquals(S2, "0", "Account Balance is WRONG.");
		System.out.println("Actual Account Balance : 0");
		
		Assert.assertEquals(S3, "Harry Potter", "Customer name is Wrong");
		System.out.println("Customer name matched : Harry Potter");
		
		Assert.assertEquals(S4, "Pound", "Account currency is Wrong");
		System.out.println("Account currency matched : Pound");
		driver.quit();
	}
	public void depositwithdrawal(String am1, String am2, String am3, String am4, String am5, String wd1,
			String wd2, String wd3, String wd4, String wd5, String wd6) {
		waitForElementToBeVisible(customerLoginButton).click();

		WebElement visibleuserlistDropMenu = waitForElementToBeVisible(userlistDDM);
		Select sel = new Select(visibleuserlistDropMenu);
		for (int index = 0; index < 3; index++) {
			sel.selectByIndex(index);
			System.out.println("Drop-Down Menu is Selected");
		}

		waitForElementToBeVisible(loginbtn).click();

		WebElement visibleaccSelDropMenu = waitForElementToBeVisible(accSelDDM);

		Select sel2 = new Select(visibleaccSelDropMenu);
		for (int index = 0; index < 2; index++) {
			sel2.selectByIndex(index);

			System.out.println("Drop-Down Menu Selected");

		}
		// Asserts to check whether the following data is correct
		String S1 = accNumber.getText();
		String S2 = accBalance.getText();
		String S3 = text.getText();
		String S4 = currency.getText();

		Assert.assertEquals(S1, "1005", "Account Number is WRONG.");
		System.out.println("Actual Account Number : 1005");
		
		Assert.assertEquals(S2, "0", "Account Balance is WRONG.");
		System.out.println("Actual Account Balance : 0");
		
		Assert.assertEquals(S3, "Harry Potter", "Customer name is Wrong");
		System.out.println("Customer name matched : Harry Potter");
		
		Assert.assertEquals(S4, "Pound", "Account currency is Wrong");
		System.out.println("Account currency matched : Pound");

		String[] amounts = { am1, am2, am3, am4, am5 };

		// Loop to iterate through the amounts array
		for (String amount : amounts) {
			WebElement visibledeposit = waitForElementToBeVisible(depositBtn);
			visibledeposit.click();
			System.out.println("Deposit Button is Clicked :");

			inputDeposit.sendKeys(String.valueOf(amount));
			depositSubmitBtn.click();
			System.out.println(amount + "  is Credited");
		}

		String[] withdrawalAmounts = { wd1, wd2, wd3, wd4, wd5, wd6 };

		// Loop to iterate through the withdrawalAmounts array
		for (String amount : withdrawalAmounts) {
			WebElement visiblewithdrawal = waitForElementToBeVisible(withdrawalBtn);
			visiblewithdrawal.click();
			System.out.println("Withdrawal Button is Clicked :");

			inputWithdraw.sendKeys(amount);
			withdrawSubmitBtn.click();
			System.out.println(amount + "  is Debited");
		}

		driver.quit();
	}
	public void transactionsflow(String am1, String am2, String am3, String am4, String am5, String wd1,
			String wd2, String wd3, String wd4, String wd5, String wd6) {
		waitForElementToBeVisible(customerLoginButton).click();

		WebElement visibleuserlistDropMenu = waitForElementToBeVisible(userlistDDM);
		Select sel = new Select(visibleuserlistDropMenu);
		for (int index = 0; index < 3; index++) {
			sel.selectByIndex(index);
			System.out.println("Drop-Down Menu is Selected");
		}

		waitForElementToBeVisible(loginbtn).click();

		WebElement visibleaccSelDropMenu = waitForElementToBeVisible(accSelDDM);

		Select sel2 = new Select(visibleaccSelDropMenu);
		for (int index = 0; index < 2; index++) {
			sel2.selectByIndex(index);

			System.out.println("Drop-Down Menu Selected");

		}
		// Asserts to check whether the following data is correct
		String S1 = accNumber.getText();
		String S2 = accBalance.getText();
		String S3 = text.getText();
		String S4 = currency.getText();

		Assert.assertEquals(S1, "1005", "Account Number is WRONG.");
		System.out.println("Actual Account Number : 1005");
		
		Assert.assertEquals(S2, "0", "Account Balance is WRONG.");
		System.out.println("Actual Account Balance : 0");
		
		Assert.assertEquals(S3, "Harry Potter", "Customer name is Wrong");
		System.out.println("Customer name matched : Harry Potter");
		
		Assert.assertEquals(S4, "Pound", "Account currency is Wrong");
		System.out.println("Account currency matched : Pound");

		String[] amounts = { am1, am2, am3, am4, am5 };

		// Loop to iterate through the amounts array
		for (String amount : amounts) {
			WebElement visibledeposit = waitForElementToBeVisible(depositBtn);
			visibledeposit.click();
			System.out.println("Deposit Button is Clicked :");

			inputDeposit.sendKeys(String.valueOf(amount));
			depositSubmitBtn.click();
			System.out.println(amount + "  is Credited");
		}

		String[] withdrawalAmounts = { wd1, wd2, wd3, wd4, wd5, wd6 };

		// Loop to iterate through the withdrawalAmounts array
		for (String amount : withdrawalAmounts) {
			WebElement visiblewithdrawal = waitForElementToBeVisible(withdrawalBtn);
			visiblewithdrawal.click();
			System.out.println("Withdrawal Button is Clicked :");

			inputWithdraw.sendKeys(amount);
			withdrawSubmitBtn.click();
			System.out.println(amount + "  is Debited");
		}

		waitForElementToBeVisible(transactionsBtn).click();
		System.out.println("Transactions Button is Clicked");
		waitForElementToBeVisible(arrowBtn).click();
		System.out.println("Forward Arrow Button is Clicked");
		waitForElementToBeVisible(backBtn).click();
		System.out.println("Back Button is Clicked");
		waitForElementToBeVisible(transactionsBtn).click();
		System.out.println("Transactions Button is Clicked");
		waitForElementToBeVisible(dateBtn1).click();
		System.out.println("Datepicker 1 is Clicked");
		waitForElementToBeVisible(dateBtn2).click();
		System.out.println("Datepicker 2 is Clicked");
		waitForElementToBeVisible(resetBtn).click();
		System.out.println("Reset Button is Clicked");
		waitForElementToBeVisible(backBtn).click();
		System.out.println("Back Button is Clicked");
		waitForElementToBeVisible(Logout).click();
		System.out.println("Logout Button is Clicked");
		driver.quit();

	}

	private WebElement waitForElementToBeVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
}

	



