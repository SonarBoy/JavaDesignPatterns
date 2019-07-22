
public class QuickSort implements Sort{
	
	//Picks an Element as a pivot and partitions the give array around
	//the given array aroun the picked pivot.
	
	int partition(int array[],int low,int high) {
		
		//Usually last element of the first array is the pivot element
		int pivot = array[high];
		int index = (low - 1);
		
		
		for(int runner = low; runner < high; runner++) {
			
			//If the end of the array is less than or equal to the pivot
			if(array[runner] <= pivot) {
				
				//Increase the index variable by 
				index++;
				
				//Take the element at the array index store it in a temp
				//variable. Assing the current value at the current position
				//in the array in the previous index. Re assign the index at 
				//runner value.
				int temp = array[index];
				array[index] = array[runner];
				array[runner] = temp;
			}
			
		}
		
		//Same thing as above but this is a shift for when 
		//the current value is greater than the pivot
		int temp = array[index + 1];
		array[index + 1] = array[high];
		array[high] = temp;
		
		//Returns the current index plus 1 to start of the next array.
		return index + 1;
	}
	
	
	public void sort(int array[],int low,int high) {
		
		if(low < high) {
			this.printArray(array);
			
			int part = partition(array,low,high);
			
			sort(array, low, part - 1);
			sort(array, part+1, high);
			
		}
		
	}
	
	public void printArray(int array[]) {
		
		int leng = array.length;
		
		for(int runner = 0; runner < leng;runner++) {
			System.out.print(array[runner]+" ");
		}
		System.out.println();
		
	}
	
	public static void main(String args[]) {
		int array[] = {10,9,8,7,6,5,4,3,2,1};
		int n = array.length;
		
		QuickSort sorter = new QuickSort();
		sorter.sort(array,0,n-1);
		

        System.out.println("sorted array"); 
       // printArray(array); 
		
		
		
	}


	@Override
	public void sort(int[] array) {
		// TODO Auto-generated method stub
		
	}
}
