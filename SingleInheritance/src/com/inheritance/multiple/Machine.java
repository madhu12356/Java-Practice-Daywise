        package com.inheritance.multiple;

        public class Machine implements Printer, Scanner {
        public void print() {
        System.out.println("Printing document...");
        }

        public void scan() {
        System.out.println("Scanning document...");
       }

        public static void main(String[] args) {
        Machine m = new Machine();
        m.print();
        m.scan();
        }
       }