package DSAFUNDAMENTALS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class intersection {
public static int[] intersectionofarraay(int[] arr,int[] arr1) {
	Set<Integer> a=new HashSet<>();
	for(int i=0;i<arr.length;i++) {
		a.add(arr[i]);
	}
	Set<Integer> b=new HashSet<>();
	for(int i=0;i<arr1.length;i++) {
		b.add(arr1[i]);
	}
	List<Integer> c=new ArrayList<Integer>();
	Iterator<Integer> d=a.iterator();
	while(d.hasNext()) {
		Integer i=d.next();
		if(b.contains(i)) {
		c.add(i);
		}
	}
	return c.stream().mapToInt(i->i).toArray();
}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr1[]=new int[n];
	for(int i=0;i<n;i++) {
		arr1[i]=sc.nextInt();
	}
	int m=sc.nextInt();
	int arr2[]=new int[m];
	for(int i=0;i<n;i++) {
		arr2[i]=sc.nextInt();
	}
	intersectionofarraay(arr1,arr2);
}
	
}
