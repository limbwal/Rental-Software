
public class SearchInventoryByName {
	public static int searchArray(String[][] array, String value, int high, int low){
		int buffer = high;
		high = (high+low)/2;
		if (value.equals(array[high][1])){
			
			return high;
		}
		if (high <=low){
			
			return -1;
		}
		else if (value.compareTo(array[high][1])<=0){
			return (searchArray(array, value, high, low));
		}
		else{	
			low = high;
			high = buffer;
			return (searchArray(array, value, high, low));
		}	
	}
}
