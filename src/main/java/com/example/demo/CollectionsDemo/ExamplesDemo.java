package com.example.demo.CollectionsDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class ExamplesDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();  
           list.add("Ravi");  
           list.add("Vijay");  
           list.add("Ajay");  
           list.add("Ravi");

        System.out.println(list);
        
        HashSet<String> hashSetString = new HashSet<String>();
        hashSetString.add("Jai");
        hashSetString.add("Ram");
        hashSetString.add("Shyam");
        System.out.println(hashSetString);


        HashSet<Employee> hashSet = new HashSet<Employee>();
        hashSet.add(new Employee("Alok", "alok@gmail.com", 45));
        hashSet.add(new Employee("Arpit", "aarpit@gmail.com", 34));
        hashSet.add(new Employee("Alok", "alok@gmail.com", 45));

        Iterator<Employee> iterable = hashSet.iterator();
        while(iterable.hasNext()) {
            System.out.println(iterable.next());
        }

        HashMapExamples();
    }
    
    static void HashMapExamples() {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "Alok");
        hashMap.put(null, "Ram");
        hashMap.put(null, "Jai");
        
        for(Map.Entry m:hashMap.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());    
           }   

    }
}

class Employee {
    String name;
    String email;
    int age;

    Employee(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee [age=" + age + ", email=" + email + ", name=" + name + "]";
    }
    
}
