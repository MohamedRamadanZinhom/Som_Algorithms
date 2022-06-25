package Sort_Algorithms;

public class Insertion_Sort {

	public static int[] Sort(int arr[]) {
		
		int len =arr.length;
	
		
		
		for(int i= 1;i<len;i++) {
			
		  int Key=arr[i];
		  int j=i-1;
		  
		  while (j >= 0 && Key < arr[j]) {
		        arr[j + 1] = arr[j];
		        --j;
		      }

		      // Place key at after the element just smaller than it.
		      arr[j + 1] = Key;
			
		}
		
		
		return arr;
	}
	
	
	
}
