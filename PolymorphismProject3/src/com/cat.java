  package com;

   public class cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat Meows");
    }

    public static void main(String[] args) {
        Animal obj = new cat(); 
        obj.sound();            
      }
   }
