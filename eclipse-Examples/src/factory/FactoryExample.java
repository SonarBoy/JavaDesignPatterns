package factory;

public class FactoryExample {
	public static void main(String[] args) {
		SortFactory sorter = new SortFactory();
		
		int array_Insertion[] = {10,9,8,7,6,5,4,3,2,1};
		
		Sort insertion = sorter.getSorter("INSERTION");
		System.out.println("Insertion Sort: ");
		insertion.sort(array_Insertion);
		insertion.printArray(array_Insertion);
		
		
		int array_Quick[] = {10,9,8,7,6,5,4,3,2,1};
		int n = array_Quick.length;
		
		Sort quick = sorter.getSorter("QUICK");
		System.out.println("Quick Sort: ");
		quick.sort(array_Quick,0,n-1);
		quick.sort(array_Quick);
		
		
		int array_Selection[] = {10,9,8,7,6,5,4,3,2,1};
		
		Sort selection = sorter.getSorter("SELECTION");
		System.out.println("Selection Sort: ");
		selection.sort(array_Selection);
		selection.printArray(array_Selection);
	}
}
