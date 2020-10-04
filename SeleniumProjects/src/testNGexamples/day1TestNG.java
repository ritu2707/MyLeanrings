package testNGexamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1TestNG {

	@BeforeSuite
	public void setup()
	
	{
		System.out.println("before suite");
	}
	
	
	@BeforeTest
	public void set2()
	{
		System.out.println("before test");
	}
	
	@BeforeClass
	public void set3()
	{
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void set4()
	{
		System.out.println("before Method");
	}
	
	@Test
	public void testcase()
	{
		System.out.println("actual test case");
	}
	
	@AfterTest
	public void set5()
	{
		System.out.println("after test");
	}
	
	@AfterMethod
	public void set6()
	{
		System.out.println("After method");
	}
	
	@AfterClass
	public void set7()
	{
		System.out.println("After class");
	}
	
	@AfterSuite
	public void set8()
	{
		System.out.println("After suite");
	}
}
