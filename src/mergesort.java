
public class mergesort {
	
	public static void sort (int [] array) {
		if (array.length <= 1)
			return;
		int middle = array.length / 2;
		// Create the two subarrays
		int [] leftArray = new int[middle];
		int [] rightArray = new int[array.length - middle];
		// Fill the two subarrays
		System.arraycopy(array, 0, leftArray, 0, middle);
		System.arraycopy(array, middle, rightArray, 0, array.length - middle);
		sort(leftArray);
		sort(rightArray);
		
		merge(array, leftArray, rightArray);
	}

	private static void merge(int [] array, int[] leftArray, int[] rightArray) {
		int i = 0;
		int j= 0;
		int k = 0;
		while (i < leftArray.length && j < rightArray.length) {
			if (leftArray[i] < rightArray[j]) {
				array[k++] = leftArray[i++];
			}else {
				array[k++] = rightArray[j++];
			}
		}
		if (i == leftArray.length) {
			for (; j < rightArray.length; j++ ){
				array[k++] = rightArray[j];
			}
		}
		for (; i < leftArray.length; i++ ){
			array[k++] = rightArray[i];
		}
	}
}
