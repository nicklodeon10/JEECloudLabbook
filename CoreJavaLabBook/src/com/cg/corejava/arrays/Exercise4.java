package com.cg.corejava.arrays;

public class Exercise4 {
	
	public void getCount(char[] ar) {
		int indexBig[]=new int[26];
		int indexSmall[]=new int[26];
		for(int i=0; i<ar.length; i++) {
			if(Character.isUpperCase(ar[i]))
				indexBig[ar[i]-65]++;
			if(Character.isLowerCase(ar[i]))
				indexSmall[ar[i]-97]++;
		}
		for(int i=0; i<26; i++) {
			if(indexBig[i]!=0) {
				System.out.println("Index Of "+(char)(65+i)+" is "+indexBig[i]);
			}
			if(indexSmall[i]!=0) {
				System.out.println("Index Of "+(char)(97+i)+" is "+indexSmall[i]);
			}
		}
	}
	
}
