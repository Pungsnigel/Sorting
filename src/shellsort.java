
public class shellsort {
	
	public static void sort (int[] array) {
		int gap = array.length / 2;
		while (gap > 0) {
			for (int nextPos = gap; nextPos < array.length; nextPos++) {
				int tmp = array[nextPos];
				int j = nextPos;
				while (j >= gap && array[j - gap] > tmp) {
					array[j] = array[j - gap];
					j = j - gap;
				}
				array[j] = tmp;
			}
			if (gap == 2) {
				gap = 1;
			}else {
				gap = (int)(gap / 2.2);		// Constant 2.2 derived from testing. Well used and documented for Shellsort.
			}
		}
	}

}

