package com.xyz.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.BankManagerPage;

public class CustomerCompleteInfoTest extends TestBase {
	BankManagerPage manager;
	public CustomerCompleteInfoTest() {
		super();
	    }
	@BeforeMethod
    public void setUp() {
	initialization();
	manager = new BankManagerPage();
	}
	 @Test 
	    public void customercompleteinfo1() {

		manager.customer(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("postcode"));
	 }
	 


}
