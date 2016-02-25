package testJava;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

public class TestArray {
	public int[] array;
	public TestArray()
	{
	Scanner reader = new Scanner(System.in);  	
	System.out.println("Enter a number of elements in the Array: ");
	int n = reader.nextInt();
	array = 	new int[n];
	System.out.println("Enter the Elements :");
	for (int i=0; i<n; i++)
	{
	array[i]=reader.nextInt();
	}
	}
	
	public int largest(){
		int large=array[0];
		for (int i=1;i<array.length;i++)
		{
			if(array[i]>large)
				large=array[i];
		}
		return large;
	
	}
	public  int smallest(){
		int small=array[0];
		for (int i=1;i<array.length;i++)
		{
			if(array[i]<small)
				small=array[i];
		}
		return small;
	}
	 @Test
	    public void testLargest() {
		 // Positive Test Case
		assertEquals(largest(),84);
	    }

}
