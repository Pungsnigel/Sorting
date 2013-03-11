
public class heapsort {
	
	public static void sort (int [] array) {
		buildheap(array);
		shrinkheap(array);
	}

	private static void buildheap(int[] array) {
		int i = 1;
		while (i < array.length){
			i++;
			int child = i - 1;
			int parent = (child - 1) / 2;
			while (parent >= 0 && array[child] > array[parent]) {
				swap(array, child, parent);
				child = parent;
				parent = (child -1) / 2;
			}
		}
	}
	
	private static void shrinkheap(int[] array) {
		int i = array.length;
		while (i > 0) {
			i--;
			swap(array, 0, i);
			int parent = 0;
			while (true) {
				int leftChild = 2 * parent + 1;
				if (leftChild >= i) 
					break;		//no more children
				
				int rightChild = leftChild + 1;
				// Find larger children.
				int maxChild = leftChild;
				if (rightChild < i && array[leftChild] < array[rightChild])
					maxChild = rightChild;
				
				if (array[parent] < array[maxChild]) {
					swap(array, parent, maxChild);
					parent = maxChild;
				} else {
					break;
				}
			}
		}
	}

	public static void swap(int []array, int first, int second) {
		int tmp = array[first];
		array[first] = array[second];
		array[second] = tmp;
	}		
}
