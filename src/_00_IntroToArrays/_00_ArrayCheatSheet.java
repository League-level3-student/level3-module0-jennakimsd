package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] a = new String[5];
		//2. print the third element in the array
		System.out.println(a[3]);
		//3. set the third element to a different value
		a[3] = "cool";
		//4. print the third element again
		System.out.println(a[3]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0; i < a.length; i++) {
			a[i] = "one direction";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		//7. make an array of 50 integers
		int[] b = new int[50];
		
		//8. use a for loop to make every value of the integer array a random number
		Random r = new Random();
		for (int i = 0; i < b.length; i++) {
			b[i] = r.nextInt();
		}
		//9. without printing the entire array, print only the smallest number on the array
		int smallest = b[0];
		for (int i = 1; i < b.length; i++) {
			if(b[i]<smallest) {
				smallest = b[i];
			}
		}
		System.out.println(smallest);
		//10 print the entire array to see if step 8 was correct
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		//11. print the largest number in the array.
		int largest = b[0];
		for (int i = 1; i < b.length; i++) {
			if(b[i]>largest) {
				largest = b[i];
			}
		}
		System.out.println(largest);
		//12. print only the last element in the array
		System.out.println(b[b.length-1]);
	}
}
