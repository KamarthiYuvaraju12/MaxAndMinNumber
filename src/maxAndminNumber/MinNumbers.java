package maxAndminNumber;

import java.util.Arrays;

public class MinNumbers {
public static void main(String[]args) {
	int a[] = {23,5,7,87,8,3,9};
	int min = a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]<min) {
			min = a[i];
		}
	}
	System.out.println("Minmum number.."+min);
	Arrays.sort(a);
	int res = a[0];
	System.out.println(""+res);
       }
   }
