package com.xyz.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.BankManagerPage;

public class AddCustomerTest extends TestBase{
	BankManagerPage manager;
	public AddCustomerTest() {
		super();
	    }
	@BeforeMethod
    public void setUp() {
	initialization();
	manager = new BankManagerPage();
	}
	 @Test (priority = 1)
	    public void addcust1() {

		manager.addcustomer(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("postcode"));
	 }
	 @Test (priority =2 )
	    public void addcustomerinvalid() throws InterruptedException {

		manager.invalid(prop.getProperty("firstnameiv"),prop.getProperty("lastnameiv"),prop.getProperty("postcodeiv"));
		
	 }	 
		
}
