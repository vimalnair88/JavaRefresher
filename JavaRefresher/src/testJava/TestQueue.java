package testJava;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class TestQueue {
	public Queue<Integer> oneQ = new LinkedList<Integer>();
	public Queue<Integer> twoQ = new LinkedList<Integer>();
	
	public void push(int x){
		if(twoQ.size()>0){
			oneQ.offer(x);
			int sizeTwo = twoQ.size();
			while(sizeTwo>0){
				oneQ.offer(twoQ.poll());
				sizeTwo--;
			}			
		}else if(oneQ.size()>0){
			twoQ.offer(x);
			int sizeOne = oneQ.size();
			while(sizeOne>0){
				twoQ.offer(oneQ.poll());
				sizeOne--;
			}
		}else{
			twoQ.offer(x);
		}
	}
	public void pop(){
	if(oneQ.size()>0){
		oneQ.poll();
	}else if(twoQ.size()>0){
		twoQ.poll();
	}else{
		System.out.println("Empty Stack!!");
	}
	}
	public int peek(){
		if(oneQ.size()>0){
			return oneQ.peek();
		}else if(twoQ.size()>0){
			return twoQ.peek();
		}else{
			return 0;
		}		
	}
	public void display(){
		if (oneQ.size()>0){
            Iterator it = oneQ.iterator();
            while (it.hasNext())
                System.out.print(it.next()+" ");
            System.out.println();
		}
		if(twoQ.size()>0){
            Iterator it = twoQ.iterator();
            while (it.hasNext())
                System.out.print(it.next()+" ");
            System.out.println();
		}
	}
	@Test
	public void testStack(){
		push(10);
		push(20);
		push(30);
		push(78);
		push(90);
		pop();
		push(77);
		assertEquals(peek(),77);
	}
}
