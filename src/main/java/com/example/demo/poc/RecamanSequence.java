package com.example.demo.poc;
public class RecamanSequence {
  
    public static void main(String[] args) {
      recaman(15);
    }
  
    static void recaman(int n) {
      int numberArray[] = new int[n];
      numberArray[0] = 0;
      System.out.println(numberArray[0] + "  ");
      for (int i = 1; i < n; i ++) {
        int current = numberArray[i-1] - i;
        int j;
        for (j = 0; j < i; j++) {
          if ((numberArray[j] == current) || current < 0) {
            current = numberArray[i-1] + i;
            System.out.println("current" + i + " " + j);
            System.out.println(current);
            break;
          }
        }
        numberArray[i] = current;
        System.out.println(numberArray[i] + "  ");
      }
      
    }
  }