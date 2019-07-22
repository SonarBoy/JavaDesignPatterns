
public class SortFactory {

	public Sort getSorter(String type) {
		
		if(type == null) {
			return null;
		}
		
		if(type.equalsIgnoreCase("INSERTION")) {
			return new InsertionSort();
		}else if(type.equalsIgnoreCase("QUICK")) {
			return new QuickSort();
		}else if(type.equalsIgnoreCase("SELECTION")) {
			return new SelectionSort();
		}
		
		return null;
	}
}
