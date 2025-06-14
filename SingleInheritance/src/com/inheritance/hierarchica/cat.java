     package com.inheritance.hierarchica;

     public class cat extends Animal{
	 void meow() {
		System.out.println("cat meows");
	 }
     public static void main(String[] args) {
	 cat c = new cat();
	 c.eat();
	 c.meow();
     }
   }
  