
public class selectionsort {
	
	public static void sort (int [] array) {
		for (int nextPos = 0; nextPos < array.length - 1; nextPos++) {
			int indexOfSmallest = nextPos;
			for (int j = nextPos + 1; j < array.length; j++) {
				if (array[j] < array[indexOfSmallest]){
					indexOfSmallest = j;
				}
			}
			swap(array, nextPos, indexOfSmallest);
		}
	}
	
	public static void swap(int [] array, int first, int second) {
		int tmp = array[first];
		array[first] = array[second];
		array[second] = tmp;
	}
}
