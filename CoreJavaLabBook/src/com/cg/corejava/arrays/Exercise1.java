package com.cg.corejava.arrays;

import java.util.Arrays;

public class Exercise1 {
	
	public int getSecondSmallest(int[] ar) {
		Arrays.parallelSort(ar);
		return ar[1];
	}
	
}
