    package com.inheritance.hierarchica;

    public class Dog extends Animal{
	void bark() {
		System.out.println("Dog bark");
	}
    public static void main(String[] args) {
	Dog d = new Dog();
	d.eat();
	d.bark();
    }
     }
