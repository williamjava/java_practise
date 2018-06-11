package com.gui.practise.list;

/**
 * ArrayList集合类的扩容
 * 
 * if the capacity of list larger than the default capacity of list, list needs
 * to grow capacity.
 * 
 * strategy: >>1(equals to divide 2)
 * 
 * @author wuhoujian
 *
 */
public class ArrayListCapacityGrow {
	public static void main(String[] args) {
		System.out.println("new capacity is : " + getNewCapacity(13));
		System.out.println("new capacity is : " + getNewCapacity(20));
	}

	/**
	 * get new capacity of list
	 * 
	 * @return
	 */
	private static int getNewCapacity(int minCapacity) {
		int defaultCapacity = 10;// default capacity is 10
		int newCapacity = defaultCapacity + (defaultCapacity >> 1);

		if (newCapacity - minCapacity < 0) {
			newCapacity = minCapacity;
		}

		return newCapacity;
	}
}
