package Sort_Algorithms;



public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int arr[]=new int[5];
		arr[0]=5;
		arr[1]=3;
		arr[2]=4;
		arr[3]=1;
		arr[4]=2;
		
		
		
		int a[] =Insertion_Sort.Sort(arr);
		
		int b[] =BubbleSort.Sort(arr);
		
		for(int i=0;i<5;i++) {
			
			System.out.println(b[i]);
			
		}
		
		
	}
	
	
	
	

}
