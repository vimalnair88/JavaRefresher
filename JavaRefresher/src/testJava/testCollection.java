package testJava;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import org.junit.Test;

public class testCollection {
	public ArrayList<String> name;
	public void getName(){
		name = new ArrayList<String>();
		System.out.println("Enter the number of Names that has to be compared: ");
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		System.out.println("Enter the elements : ");
		while(n!=0)
		{
			name.add(reader.next());
			--n;
		}
	}
	public void sortName(ArrayList<String> name){		
		Collections.sort(name);
		for(int i=0; i < name.size();i++)
		{
			System.out.println(name.get(i));
		}
	}
	@Test
	public void testSortName()
	{
		getName();
		sortName(name);
		assertEquals(name.get(0),"Arsenal");
	}
}
