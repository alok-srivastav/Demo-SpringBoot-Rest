package com.example.demo.poc;

public class Child  extends Parent{
    
    public static void main(String[] args) {
        Child c = new Child();
        c.display();

        AddInterface addInterface = (a, b) -> a+b;
        System.out.println( addInterface.add(20, 2));;
    }

     public void display() {
        System.out.println("Child !!");
    }
}
