package com.day6;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class incrementdecrement {

	public static void main(String[] args) {
		int i=0;
		System.out.println(i++);
		System.out.println(i);
		
		System.out.println(++i);
		System.out.println(i);
		
		System.out.println(i--);
		System.out.println(i);
		
		System.out.println(--i);
		System.out.println(i);
		
		//1 + 0 + 0+ 1=2
		int a=++i + --i + i++ + i;
		System.out.println(a);

	}

}
