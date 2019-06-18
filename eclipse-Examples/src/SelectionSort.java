
public class SelectionSort {
	
	void sort(int array[]) {
		int arrayLength = array.length;
		
		//The outer loop moves the boundary of the unsorted subarray
		for(int runner = 0; runner < arrayLength-1;runner++) {
			
			//Here we find the minimun element in the unsorted array
			int minimum_idx = runner;
			
			//If the value at index(runnerTwo) is less than the value at index(minimum_idx)
			//we re-assign the minimum index to runnerTwo
			for(int runnerTwo = runner + 1; runnerTwo < arrayLength; runnerTwo++) {
				
				if(array[runnerTwo] < array[minimum_idx]) {
					minimum_idx = runnerTwo;
				}
				
				printArray(array);
			}
			
			//here we switch out the minimum value found with the first element
			int temp = array[minimum_idx];
			array[minimum_idx] = array[minimum_idx];
			array[runner] = temp;
		}
	}
	
	// Prints the array 
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
	
	public static void main(String[] args) {
		SelectionSort obj = new SelectionSort();
		int array[] = {10,9,8,7,6,5,4,3,2,1};
		obj.sort(array);
		
		System.out.println("Sorted Array: ");
		obj.printArray(array);
	}

}
