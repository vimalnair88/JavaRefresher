package testJava;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestGenerics {

	public static void listSum(List<? extends Number> num) {
		
		double sum=0.0;
		for(Number n: num )
		{
			sum+= n.doubleValue();
		}
		System.out.println(sum);
	    
	}

	
	@Test
	public void test() {
	
		listSum(Arrays.asList(1,2,3,4,5));
		listSum(Arrays.asList(1.2,3.4,5.6,7.7));
		listSum(Arrays.asList(1L,2L,3L,5L));
	}
	
	
}
