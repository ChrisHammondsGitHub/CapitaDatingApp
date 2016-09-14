package com.novus.dater.business;

public class RandomRecord {
	
	public static int randomNo(){ 
	int random = (int)(Math.random()*1000);
	System.out.println("Randomly selected record number: " + random);
	System.out.println();
	return random;
	}
}
