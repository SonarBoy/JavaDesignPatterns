
public class QuickSort {
	
	int partition(int array[],int low,int high) {
		
		int pivot = array[high];
		int index = (low - 1);
		
		for(int runner = low; runner < high; runner++) {
			
			if(array[runner] <= pivot) {
				index++;
				
				int temp = array[index];
				array[index] = array[runner];
				array[runner] = temp;
			}
			
		}
		
		int temp = array[index + 1];
		array[index + 1] = array[high];
		array[high] = temp;
		
		return index + 1;
	}
	
	
	void sort(int array[],int low,int high) {
		
		if(low < high) {
			this.printArray(array);
			int part = partition(array,low,high);
			
			sort(array, low, part - 1);
			sort(array, part+1, high);
			
		}
		
	}
	
	static void printArray(int array[]) {
		
		int leng = array.length;
		
		for(int runner = 0; runner < leng;runner++) {
			System.out.print(array[runner]+" ");
		}
		System.out.println();
		
	}
	
	public static void main(String args[]) {
		int array[] = {10,7,8,9,1,5};
		int n = array.length;
		
		QuickSort sorter = new QuickSort();
		sorter.sort(array,0,n-1);
		

        System.out.println("sorted array"); 
        printArray(array); 
		
		
		
	}
}
