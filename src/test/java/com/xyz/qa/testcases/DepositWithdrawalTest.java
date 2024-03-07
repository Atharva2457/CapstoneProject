package com.xyz.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.CustomerPage;

public class DepositWithdrawalTest extends TestBase {
	CustomerPage customerLoginPage;

    public DepositWithdrawalTest() {
	super();
    }

    @BeforeMethod
    public void setUp() {
	initialization();
	customerLoginPage = new CustomerPage();
    }

    @Test
    public void testCustomerLoginFlow() {
    	customerLoginPage.depositwithdrawal(prop.getProperty("deposit1"),prop.getProperty("deposit2"),prop.getProperty("deposit3"),prop.getProperty("deposit4"),prop.getProperty("deposit5"),
    	    	prop.getProperty("withdrawal1"),prop.getProperty("withdrawal2"),prop.getProperty("withdrawal3"),prop.getProperty("withdrawal4"),prop.getProperty("withdrawal5"),prop.getProperty("withdrawal6"));
	
    }

}
