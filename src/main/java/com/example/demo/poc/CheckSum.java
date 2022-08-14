package com.example.demo.poc;


public class CheckSum {
    public static void main(String[] args) {
//        System.out.println("Test !!");
        reverseString("Alok");
        
    }

    public static void reverseString(String string) {
        char ch[] = string.toCharArray();
        StringBuilder str = new StringBuilder();
        for(int i =ch.length-1; i > -1; i--) {
            str.append(ch[i]);
        }
        System.out.println(str);
    }

    public static void countSecondString(String str) {

    }

    

    // @GetMapping("/employee/${id}")
    // public Empployee getE


    //         employees.stream().filter(emp -> emp.sal > 10000).toCollect(emp);

    // difference between
}
