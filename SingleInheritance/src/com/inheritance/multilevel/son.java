     package com.inheritance.multilevel;

      public class son extends Father {
	  void dream( ) {
		  System.out.println("son's dream");
	  }
	  public static void main(String[] args) {
		son s= new son();
		s.legacy();
		s.advice();
		s.dream();
	  }

     }
