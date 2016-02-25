package testJava;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestInterfaceJunit{
	
	private TestInterface obj1,obj2,obj3;

	@Before
	public void setUp(){
	obj1 = new TestInterfaceAdder();
	obj2 = new TestInterfaceMultiplier();
	obj3 = new TestInterfaceSubtrator();
	}
	@Test
	public void testAdder() {
		int result = obj1.arithmeticOperation(3,4);
		assertEquals(result,7);
	}
	@Test
	public void testMultiplier() {
		int result = obj2.arithmeticOperation(3,4);
		assertEquals(result,12);
	}

	@Test
	public void testSubractor() {
		int result = obj3.arithmeticOperation(3,4);
		assertEquals(result,-1);
	}



}
