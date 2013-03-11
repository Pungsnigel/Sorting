
public class insertionsort {

	public static void sort(int array[]){
		for (int i = 1; i < array.length; i++){
			int j = i;
			int newVal = array[i];
			while ((j > 0) && (array[j-1] > newVal)){
				array[j] = array[j-1];
				j--;
			}
			array[j] = newVal;
		}
	}
}

