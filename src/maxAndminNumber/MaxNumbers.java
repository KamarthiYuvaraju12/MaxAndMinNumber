 package maxAndminNumber;

import java.util.Arrays;

public class MaxNumbers {
	public static void main(String[]args) {
	int a[] = {12,34,56,7,23,10};
	int max = a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			max = a[i];
		}
	}
	System.out.println("maxmum number:"+max);
	Arrays.sort(a);
	int res = a[5];
	System.out.println(res);
	
	}
}