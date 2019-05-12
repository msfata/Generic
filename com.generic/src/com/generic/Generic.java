/**
 * 
 */
package com.generic;

/**
 * @author msfata ProgrammingHelp
 *
 */
public class Generic {
	/*
	 * generic loop
	 */
	public static <E> void loopIt(E[] array) {
		for (E e : array) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

	/*
	 * main method
	 */
	public static void main(String[] args) {
		/*
		 * String array test
		 */
		String[] stringArray = { "Mohammed", "Shafiq", "Fata" };
		loopIt(stringArray);

		/*
		 * Iteger array test
		 */
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		loopIt(intArray);

		/*
		 * Char array test
		 */
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		loopIt(charArray);

		/*
		 * double array test
		 */
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		loopIt(doubleArray);
	}
}
