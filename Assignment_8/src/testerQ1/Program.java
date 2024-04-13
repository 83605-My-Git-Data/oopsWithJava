package testerQ1;

import java.util.Comparator;

import com.sunbeam.question2.GenericSort;

public class Program {
	
	
//public static <T> void selectionSort(T[] arr,Comparator<T> c){
//		
//		for(int i = 0; i< arr.length-1;i++) {
//			for(int j = i+1; j<arr.length; j++) {
//				if(c.compare(arr[i], arr[j]) >0){
//					
//					T temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//					
//				}
//			}
//		}
//	}


	public static void main(String[] args) {
		
		Integer []arr = {5,4,3,2,1};
		
		
		
		
		class Test implements Comparator<Integer>{

			@Override
			public int compare(Integer o1, Integer o2) {
				int val = Integer.compare(o1, o2);
				
				return val;
			}
			
			
			
			
			
		}
		
		Comparator<Integer> cmp = new Test();
		
		System.out.println("Before sort");
		
		for(Integer i :arr) {
			System.out.println(i);
		}
		
		GenericSort.selectionSort(arr,cmp);
		
System.out.println("After sort");
		
		for(Integer i :arr) {
			System.out.println(i);
		}
		
		
	
	}

}
