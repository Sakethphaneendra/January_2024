package Basics;
import java.util.*;
public class foreachLoop {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			
			 arr[i] = in.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
	}
	
	

}
