package com.xyz.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.BankManagerPage;

public class ExistingcustTest extends TestBase {
	BankManagerPage manager;
	public ExistingcustTest() {
		super();
	    }
	@BeforeMethod
    public void setUp() {
	initialization();
	manager = new BankManagerPage();
	}
	 @Test 
	    public void existing1() {

		manager.existing(prop.getProperty("firstname"));
	 }
	 
	
}
