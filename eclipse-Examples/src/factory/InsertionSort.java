package factory;

public class InsertionSort implements Sort{
	
	public void sort(int array[]) {
		int arrayLength = array.length;
		
		for(int runner = 1; runner < arrayLength; runner++) {
			
			//Get the Current value in the array.
			//Get the previous position in the array. 
			int key = array[runner];
			int jValue = runner - 1;
			
			//While the Previous position in the array is greater than 0
			//and the value at the jValue index is greater than the key
			while(jValue >= 0 && array[jValue] > key) {
				
				//Assign the value in the jValue to 1+ 
				//the jValue index position.
				//and shift it down.
				array[jValue + 1] = array[jValue];
				jValue = jValue - 1;
				
				printArray(array);
			}
			
			//the index after the jValue's value is the the key.
			array[jValue + 1] = key;
			
		}
		
	}
	
	
	public void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
	
	
	public static void main(String[] args) {
		
		int array[] = {10,9,8,7,6,5,4,3,2,1};
		
		InsertionSort sorter = new InsertionSort();
		sorter.sort(array);
		
		System.out.println("Sorted Array: ");
		//printArray(array);
	}


	@Override
	public void sort(int[] array, int x, int y) {
		// TODO Auto-generated method stub
		
	}

}
