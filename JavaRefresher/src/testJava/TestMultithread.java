package testJava;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMultithread {
	
	private TestThread1 obj1;
	private TestThread2 obj2;

	@Before
	public void testSetup() {
		obj1=new TestThread1();
		obj2=new TestThread2();
	}
	@Test
	public void testRun(){
		obj1.start();		
		obj2.start();
	}

}