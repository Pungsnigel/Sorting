import java.util.Random;
import java.util.Scanner;


public class timer {
	
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Size of n?");
		int size = scanner.nextInt();
		
		int [] array = new int[size];
		/*
		 * ---------------------------------------------------------------------------------
		 * Quicksort
		 */
		scrambleArray(array);
		
		long time = System.currentTimeMillis();
		quicksort.sort(array, 0, array.length - 1);
		System.out.print("Quicksort:\t Unsorted: " + (System.currentTimeMillis() - time + "ms"));

		time = System.currentTimeMillis();
		quicksort.sort(array, 0, array.length - 1);
		System.out.println("\t Sorted: " + (System.currentTimeMillis() - time) + "ms");
		/*
		 * ---------------------------------------------------------------------------------
		 * Bubblesort - Takes to long time with values > 75 000
		 */
		if (array.length < 75000) {
			scrambleArray(array);
			
			time = System.currentTimeMillis();
			bubblesort.sort(array);
			System.out.print("Bubblesort:\t Unsorted: " + (System.currentTimeMillis() - time + "ms"));
			
			time = System.currentTimeMillis();
			bubblesort.sort(array);
			System.out.println("\t Sorted: " + (System.currentTimeMillis() - time) + "ms");
			
		}
		/*
		 * ---------------------------------------------------------------------------------
		 * InsertionSort
		 */
		scrambleArray(array);
		
		time = System.currentTimeMillis();
		insertionsort.sort(array);
		System.out.print("Insertionsort:\t Unsorted: " + (System.currentTimeMillis() - time + "ms"));
		
		time = System.currentTimeMillis();
		insertionsort.sort(array);
		System.out.println("\t Sorted: " + (System.currentTimeMillis() - time) + "ms");
		/*
		 * ---------------------------------------------------------------------------------
		 * Shellsort
		 */
		scrambleArray(array);
		
		time = System.currentTimeMillis();
		shellsort.sort(array);
		System.out.print("Shellsort:\t Unsorted: " + (System.currentTimeMillis() - time + "ms"));
		
		time = System.currentTimeMillis();
		shellsort.sort(array);
		System.out.println("\t Sorted: " + (System.currentTimeMillis() - time) + "ms");
		/*
		 * ---------------------------------------------------------------------------------
		 * Mergesort
		 */
		scrambleArray(array);
		
		time = System.currentTimeMillis();
		mergesort.sort(array);
		System.out.print("Mergesort:\t Unsorted: " + (System.currentTimeMillis() - time + "ms"));
		
		time = System.currentTimeMillis();
		mergesort.sort(array);
		System.out.println("\t Sorted: " + (System.currentTimeMillis() - time) + "ms");
		/*
		 * ---------------------------------------------------------------------------------
		 * Heapsort
		 */
		scrambleArray(array);
		
		time = System.currentTimeMillis();
		heapsort.sort(array);
		System.out.print("Heapsort:\t Unsorted: " + (System.currentTimeMillis() - time + "ms"));
		
		time = System.currentTimeMillis();
		heapsort.sort(array);
		System.out.println("\t Sorted: " + (System.currentTimeMillis() - time) + "ms");
		/*
		 * ---------------------------------------------------------------------------------
		 * Selectionsort
		 */
		scrambleArray(array);
		
		time = System.currentTimeMillis();
		selectionsort.sort(array);
		System.out.print("Selectionsort:\t Unsorted: " + (System.currentTimeMillis() - time + "ms"));
		
		time = System.currentTimeMillis();
		selectionsort.sort(array);
		System.out.println("\t Sorted: " + (System.currentTimeMillis() - time) + "ms");
		
		int []myArray = {23,6,2,3,2,5,8,0,78,5,2};
		insertionsort.sort(myArray);
		for (Integer i : myArray) {
			System.out.print(" " + i);
		}
	}
	
	public static void scrambleArray(int [] array) {
		Random generator = new Random();
		for (int i = 0; i < array.length - 1; i++) {
			array[i] = generator.nextInt();
		}
	}
	
}
