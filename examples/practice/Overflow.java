//: operators/Overflow.java
// Surprise! Java lets you overflow.

public class Overflow {
  public static void main(String[] args) {
    int big = Integer.MAX_VALUE;
    System.out.println("big = " + big);
    System.out.println("big = " + Integer.toBinaryString(big));
    System.out.println("big.length() = " + Integer.toBinaryString(big).length());
    int bigger = big * 4;
    System.out.println("bigger = " + bigger);
    System.out.println("bigger = " + Integer.toBinaryString(bigger));  
    System.out.println("bigger.length() = " + Integer.toBinaryString(bigger).length());
  }
} /* Output:
big = 2147483647
bigger = -4
*///:~
