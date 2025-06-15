        package com.synchronization;

        public class SafeCounter {
        int count = 0;

        synchronized void increment() {
            count++;
           }
         }