package com.cg.corejava.arrays;

import java.util.Arrays;

public class Exercise3 {

	public int[] getSorted(int[] ar) {
		for(int i=0; i<ar.length; i++) {
			String temp=""+ar[i];
			ar[i]=Integer.parseInt(new StringBuffer(temp).reverse().toString());
		}
		Arrays.parallelSort(ar);
		return ar;
	}
	
}
