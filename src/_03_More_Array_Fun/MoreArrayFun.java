package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
	
	}
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void printString(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void reverseString(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void skipString(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			i++;
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void randomString(String[] arr) {
		Random r = new Random();
		for(int i = 0; i < arr.length; i++) {
			
		}
	}
	
}
