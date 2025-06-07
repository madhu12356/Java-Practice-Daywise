   package com;

   import java.util.HashSet;

   public class Hashset {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("Apple");
		set.add("Banana");
		set.add("Orange");
		set.add("Apple");//duplicate ignored
		System.out.println("HashSet:"+ set);
		
	}

   }
