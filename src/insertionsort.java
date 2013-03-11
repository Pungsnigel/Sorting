
public class insertionsort {
	
	public static void sort (int [] array) {
		for (int i = 0; i < array.length; i++) {
			int smallest = array[i];
			int indexOfSmallest = 0;
			for (int j = i; j < array.length; j++) {
				if (array[j] < smallest){
					smallest = array[j];
					indexOfSmallest = j;
				}
			}
			shiftBetween(array, i, indexOfSmallest);
			array[i] = smallest;
		}
	}
	
	public static void shiftBetween(int [] array, int start, int stop) {
		for (int i = stop; i > start; i--) {
			array[i] = array[i - 1];
		}
	}
}

	