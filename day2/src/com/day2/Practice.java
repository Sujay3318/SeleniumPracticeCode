package com.day2;

import java.util.HashSet;

public class Practice {
	public static void main(String[] args) {
		/*
		 * String needle = "cb"; int nlen = needle.length(); //System.out.println(nlen);
		 * String haystack = "abcb"; for (int i = 0; i < haystack.length() - nlen+1;
		 * i++) {
		 * 
		 * int cnt = 0; int indexj=0; for (int j = i; j < i+nlen; j++) {
		 * System.out.println(j); System.out.println(haystack.charAt(j)+"  "+
		 * needle.charAt(indexj));
		 * 
		 * if (haystack.charAt(j) == needle.charAt(indexj)) {
		 * 
		 * cnt++; } indexj++; } System.out.println("cnt"+cnt); if (cnt == nlen) {
		 * System.out.println("output" +( i+1)); break; } System.out.println("i->"+i); }
		 */
		
		int[] a= {1,2,3,4,5,7,7,8,9};
		HashSet<Integer>hs=new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(i);
			if(!(hs.add(a[i])))
			{
				System.out.println("Duplicated "+a[i]);
			}
		}
		
		String s="abc pqr xyz  ";
		s=s.trim();
		String[] sarr=s.split(" ");
		String result="";
		for(int i=0;i<sarr.length;i++)
		{
			result=result+sarr[i];
		}
			
		System.out.println(result);
		
		
		
		
	}
}
