/**
 * 
 */
package ie.gcd.test;

import static org.junit.Assert.*;
import ie.gcd.maths.Calc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Chris Bannon
 *
 */
public class CalcTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link ie.gcd.maths.Calc#add(int,int)}.
	 */
	@Test
	public void testAdd() {
		Calc u = new Calc();
		assertEquals(5, u.add(2,3));
	}

}
