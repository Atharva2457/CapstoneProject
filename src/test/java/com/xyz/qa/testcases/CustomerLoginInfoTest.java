package com.xyz.qa.testcases;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.CustomerPage;

public class CustomerLoginInfoTest extends TestBase {

    CustomerPage customerLoginPage;

    public CustomerLoginInfoTest() {
	super();
    }

    @BeforeMethod
    public void setUp() {
	initialization();
	customerLoginPage = new CustomerPage();
    }

    @Test
    public void testCustomerLoginFlow() {
    	customerLoginPage.logincustomerinfo();

	
    }
}