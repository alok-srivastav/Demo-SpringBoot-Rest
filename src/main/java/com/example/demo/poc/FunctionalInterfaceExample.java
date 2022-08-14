package com.example.demo.poc;

// FunctionalInterface is optional annotation which contains only one abstract method in the interface.
// Purpose of FunctionalInterface is to use lambda expression over it, so that no ambiguity is there
// that which abstract method is called, since it has only one abstract method.
@FunctionalInterface
interface Interf {
    // public void m1();
    public static void m2() {

    }
    public void add(int a, int b);
}

class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // No need to create an implementing class for interface.
        // we can directly give implementation for the abstract method in the provided class using lambda expression
        // Length of code is reduced
        
        // Interf i = () -> System.out.println("Function Interface Example !!!!");
        // i.m1();

        Interf i = (a, b) -> System.out.println("The Sum is::::" + (a+b));
        i.add(4, 3);
    }
}

