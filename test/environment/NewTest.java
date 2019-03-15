package environment;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	
	
	
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  
	  
  }
  
  
  @Test(expectedExceptions = ArithmeticException.class)
	public void test1()
	{
		Massiv massiv= new Massiv();
		Assert.assertEquals(massiv.division(1, 0), 0);
	}
  
  @Ignore
  @Test
 	public void test11()
 	{
 		Massiv massiv= new Massiv();
 		Assert.assertSame(massiv, massiv, "++++++++++++++++++");
 	}
  
  @Test
	public void test2()
	{
		Massiv massiv= new Massiv();
		Assert.assertNotNull(massiv);
	}
  
  
  @Test
 	public void test12()
 	{
 		Massiv massiv= new Massiv();
 		Assert.assertNotNull(massiv);
 	}
  
  @Test
	public void test3()
	{
		Massiv massiv= new Massiv();
		Assert.assertSame(massiv, massiv);
	}
  
  
  @Test
	public void test13()
	{
		Massiv massiv= new Massiv();
		Assert.assertSame(massiv, massiv);
	}
  
  
  @Test
 	public void test4()
 	{
 		Massiv massiv= new Massiv();
 		Assert.assertEquals(massiv.sum(1, 1), 2);
 	}
   
  
  
  @Test
 	public void test14()
 	{
 		Massiv massiv= new Massiv();
 		Assert.assertSame(massiv, massiv, "$$$$$$$$$$$$$$$$$$");
 	}
  
  
  @Test
	public void test5()
	{
		Massiv massiv= new Massiv();
		Assert.assertEquals(massiv.minus2(1, 1), 0);
	}
  
  
  
  
  @Test
 	public void test15()
 	{
 		Massiv massiv= new Massiv();
 		Assert.assertEquals(massiv.minus2(2, 2), 0);
 	}
   
  
  @Test
	public void test6()
	{
		Massiv massiv= new Massiv();
		Assert.assertNotNull(massiv);
	}
 
  
  
  @Test
	public void test16()
	{
		Massiv massiv= new Massiv();
		Assert.assertNotNull(massiv);
	}
  
  @Test
	public void test7()
	{
		Massiv massiv= new Massiv();
		Assert.assertEquals(massiv.sum2(1, 1), 2);
	}
 
  
  @Test
 	public void test17()
 	{
 		Massiv massiv= new Massiv();
 		Assert.assertNotNull(massiv);
 	}
  
  @Test
	public void test8()
	{
		Massiv massiv= new Massiv();
		Assert.assertSame(massiv, massiv, "dddddd");
	}
 
  @Test
 	public void test18()
 	{
 		Massiv massiv= new Massiv();
 		Assert.assertSame(massiv, massiv, "ddoooooodddd");
 	}
  
  
  @Test
	public void test9()
	{
		Massiv massiv= new Massiv();
		Assert.assertSame(massiv, massiv, "dddddd");
	}
  
  @Test
	public void test19()
	{
		Massiv massiv= new Massiv();
		Assert.assertSame(massiv, massiv, "dddddd");
	}
  
  
  @Test
	public void test10()
	{
		Massiv massiv= new Massiv();
		Assert.assertSame(massiv, massiv, "sdsd");
	}
  
  @Test
	public void test20()
	{
		Massiv massiv= new Massiv();
		Assert.assertSame(massiv, massiv, "sdsd");
	}
  
  
  
  @Test
	public void test21()
	{
		Massiv massiv= new Massiv();
		Assert.assertSame(massiv, massiv, "sdsd");
	}
  
  @Test
	public void test22()
	{
		Massiv massiv= new Massiv();
		Assert.assertSame(massiv, massiv, "sdsd");
	}
  
  
  @Test
	public void test23()
	{
		Massiv massiv= new Massiv();
		Assert.assertSame(massiv, massiv, "sdsd");
	}
  
  
  @Test
	public void test24()
	{
		Massiv massiv= new Massiv();
		Assert.assertSame(massiv, massiv, "sdsd");
	}
  
  @Ignore
  @Test
	public void test25()
	{
		Massiv massiv= new Massiv();
		Assert.assertSame(massiv, massiv, "sdsssssssssssssssssssssssssd");
	}
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	 
	  
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
