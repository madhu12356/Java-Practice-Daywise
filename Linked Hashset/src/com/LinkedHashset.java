     package com;

        import java.util.LinkedHashSet;

         public final class LinkedHashset {
    	 public static void main(String[] args) {
			LinkedHashSet<String>set = new LinkedHashSet<>();
			set.add("One");
			set.add("Two");
			set.add("Three");
			set.add("One");// Duplicate ignored
			System.out.println("LinkedHashSet(Ordered):"+set);
		}
	

     }
 