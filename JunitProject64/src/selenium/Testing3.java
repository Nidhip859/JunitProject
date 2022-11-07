package selenium;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import junit.framework.Assert;

public class Testing3 {

	@Rule
	public ErrorCollector err = new ErrorCollector();
	
	@Test
	public void test6() {     // to comment this test just put //ahead @Test
		String actual = "abc";
		String expected = "abc1";
		System.out.println("Before 1st Assert");
		try{
		Assert.assertEquals(actual, expected); //we use regular Assert in Industry
		}
		catch(Throwable t) {
			err.addError(t);
			System.out.println("I'm in first catch.");
		}
		System.out.println("After 1st Assert");
		try {
		Assert.assertTrue("Verify 2>3", 2>3);
		}catch(Throwable t) {
			err.addError(t);
			System.out.println("I'm in second catch");
		}
		System.out.println("After 2nd Assert");
		
		
	}
	
	@Test
	public void test7() {
		String actual = "abc";
		String expected = "abc";
		System.out.println("Before 1st Assert");
		Assert.assertEquals(actual, expected); //we use regular Assert in Industry
		System.out.println("After 1st Assert");
		Assert.assertTrue("Verify 2>3", 2>3);
		System.out.println("After 2nd Assert");
		
		
	}

}
