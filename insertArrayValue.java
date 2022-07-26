package array;

import java.util.Scanner;
public class insertArrayValue {
		public static int[] removeTheElement(int[] arr, int index,int val)
		{
			if (arr == null || index < 0 || index >= arr.length) {
				return arr;
			}
			int[] anotherArray = new int[arr.length +1];
			int k=0;
			for (int i = 0; i < arr.length-1; i++) {
				
				if (i == index) {
					anotherArray[i]=val;
					k++;
					i-=1;
//					continue;
				}
				anotherArray[k] = arr[i];
				k++;
			}
			return anotherArray;
		}
        static	Scanner scan = new Scanner (System.in);
		public static void main(String[] args){
			System.out.println("enter the size of the array :");
//			int a= scan.nextInt();
			int arr[]= {2,4,3,6,7,9};
//			for(int i =0;i<a;i++){
//				arr[]=scan.nextInt();
//			}
			
			System.out.println("enter the index of the element :");
			int in= scan.nextInt();		
			System.out.println("enter the value of the element :");
			int val= scan.nextInt();
			System.out.println("Index to be removed: " + in);
			arr = removeTheElement(arr, in,val);
			for(int i=0;i<arr.length;i++){
				System.out.println(arr[i]);
			}
		}
	
}
