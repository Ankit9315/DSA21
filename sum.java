package DSAFUNDAMENTALS;

import java.util.Scanner;

public class sum {
public static int[] sum(int arr[],int n) {
	int start=0;
	int end=arr.length-1;
	while(end>1) {
		if(arr[start]+arr[end]>n) {
			end--;
		}
		else if(arr[start]+arr[end]<n) {
			start++;
		}
		else {
			return new int[] {start+1,end+1};
		}
	}
	return null;
}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int target=sc.nextInt();
	System.out.println(sum(arr,target));
}
}
