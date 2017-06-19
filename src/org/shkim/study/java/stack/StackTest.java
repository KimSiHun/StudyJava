package org.shkim.study.java.stack;

import java.util.EmptyStackException;
import java.util.Vector;

public class StackTest<E> extends Vector<E>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1224463164541339165L;

	/**
	 *  creates an empty stack
	 */
	public StackTest()
	{}
	
	public E push(E item)
	{
		addElement(item);
		return item;
	}
	
	public synchronized E peek()
	{
		int len = size();
		
		if (len ==0)
		{
			throw new EmptyStackException();
		}
		return elementAt(len -1);
	}
	
	public synchronized E pop(){
		E obj;
		int len = size();
		
		obj = peek();
		removeElementAt(len-1);
		
		return obj;
	}
	
	public boolean is_empty(){
		return size() == 0;
	}
	
	public synchronized int search(Object o){
		int i = lastIndexOf(o);
		
		if (i >=0){
			return size() -i;
		}
		return -1;
	}
}
