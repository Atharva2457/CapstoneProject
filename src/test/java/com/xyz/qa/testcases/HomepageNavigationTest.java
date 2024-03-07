package com.xyz.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.HomePageNavigationPage;

public class HomepageNavigationTest extends TestBase {
HomePageNavigationPage homepage;

public HomepageNavigationTest() {
	super();
}
@BeforeMethod
public void setUp() {
initialization();
homepage = new HomePageNavigationPage();
}
@Test
public void Homepagefun() {
	homepage.Homepagefunction();

}
}
