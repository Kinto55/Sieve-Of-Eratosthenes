//Digits.java - Program that tasks to break a number into its individual digits
// Author:Markintus Morris
// Date: 26-July-2021


public static void numToDigits(){

    //what it does:method is used to push an element into the Stack
    //how it works: implements the Java List interface

    Scanner sc = new Scanner(System.in); 
    System.out.print("Enter number: ");
    int number = sc.nextInt();

    LinkedList<Integer> stack = new LinkedList<Integer>();
    while(number > 0){
        stack.push(number % 10);
        number = number / 10;
    }
    while (!stack.isEmpty()){
        System.out.print(stack.pop() + " ");
         // 15.9
    numToDigits();
    }
  }