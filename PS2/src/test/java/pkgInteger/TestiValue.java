package pkgInteger;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestiValue {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestMyInt() {
		
		MyInteger myint1 = new MyInteger(10);
		boolean bExpectedisEven = true;
		boolean bExpectedisOdd = false;
		boolean bExpectedisPrime = false;
		
		assertEquals(bExpectedisEven,myint1.isEven());
		assertEquals(bExpectedisOdd,myint1.isOdd());
		assertEquals(bExpectedisPrime,myint1.isPrime());
		
		MyInteger myint2 = new MyInteger(7);
		boolean tExpectedisEven = false;
		boolean tExpectedisOdd = true;
		boolean tExpectedisPrime = true;
		
		assertEquals(tExpectedisEven,myint2.isEven());
		assertEquals(tExpectedisOdd,myint2.isOdd());
		assertEquals(tExpectedisPrime,myint2.isPrime());
		
		MyInteger myint3 = new MyInteger(15);
		boolean mExpectedisEven = false;
		boolean mExpectedisOdd = true;
		boolean mExpectedisPrime = false;
		
		assertEquals(mExpectedisEven,myint3.isEven());
		assertEquals(mExpectedisOdd,myint3.isOdd());
		assertEquals(mExpectedisPrime,myint3.isPrime());
		
	}

}
