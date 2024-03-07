package com.xyz.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.BankManagerPage;

public class OpenAccountTest extends TestBase {
	BankManagerPage manager;
	public OpenAccountTest() {
		super();
	    }
	@BeforeMethod
    public void setUp() {
	initialization();
	manager = new BankManagerPage();
	}
	 @Test 
	    public void openaccount1() {

		manager.openaccount(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("postcode"));
	 }
	 
	
}
