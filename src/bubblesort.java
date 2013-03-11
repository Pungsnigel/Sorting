
public class bubblesort {

	public static void sort(int [] array){
		boolean swapped = true;
		int counter = 1;
		while (swapped) {
			swapped = false;
			for (int i = 0; i < array.length - counter; i++) {
				if (array[i] > array[i + 1]){
					swap(array, i, i + 1);
					swapped = true;
				}
			}
		}
	}

	private static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[i + 1];
		array[i + 1] = tmp;
	}
}
