public class quicksort {
 
  public static void sort (int [] array, int left, int right) {
	  	/*
		 * Partition the array.
		 */
		int i = left, j = right;
		int pivot = array[(left + right) / 2];
		while (i <= j) {
			for(; array[i] < pivot;	i++) ; //Increment i until value lower than pivot is found
			for(; array[j] > pivot; j--) ; //Decrement j until value higher than pivot is found
			if (i <= j) {		      // Make sure the current iteration has not put us passed i <= j.
				swap(array, i, j);
				i++;
				j--;
			}
		}
		/*
		 * Recursion.
		 */
		if (left < j)
			sort(array, left, j);
		if (i < right)
			sort(array, i, right);
	}
 
	private static void swap(int[] array, int left, int right) {
		int tmp      = array[left];
		array[left]  = array[right];
		array[right] = tmp;
	}
}
