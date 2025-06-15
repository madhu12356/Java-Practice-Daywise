     package com;

    public class LambdaExpression {
	public static void main(String[] args) {
		Thread t = new Thread(()-> System.out.println("Thread using Lambda Expression"));
		t.start();
	        }

           }
