package Basics;
import java.util.Scanner;
public class FindUnique2 {

		public static void main(String args[]) {
			Scanner in = new Scanner(System.in);
			
			System.out.print("Enter the number of Elements in array : ");
			int num = in.nextInt();
		

			int arr[] = new int[num];
			for(int i=0;i<num;i++) {
				
				arr[i]=in.nextInt();

			}
			int k = unqiue(arr);
			System.out.println("The Element is : " + k);
			
		}
		
		public static int unqiue(int[] arr) {
			int k=0;
			
			
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						arr[i]=0;
						arr[j]=0;
					}
				}
			}
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=0) {
					k=arr[i];
				}
			}
			return k;
		}
	
}
