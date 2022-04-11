import java.util.*;
import java.lang.Math;
import java.util.Scanner;

// SieveOfEratosthenes.java -  a method for computing prime numbers, known to the ancient Greeks. This method will compute all prime numbers 
// Author:Markintus Morris
// Date: 26-July-2021


public static void sieveOfEratosthenes(int n){
    //what it does: method computed all prime numbers
    //how it works: returns the square root of a value of type double passed to it as argument. 
    Set<Integer> set = new HashSet<Integer>();
    for(int i = 2; i < n; i++){
      set.add(i);
    }

    for(int i = 2; i < Math.sqrt(n); i++){
      int start = i*i;
      for(int j = start; j < n; j = j + i) {
          set.remove(j);
      }
    }

    System.out.println("Set: " + set);
       // 15.3
       sieveOfEratosthenes(50);
  }