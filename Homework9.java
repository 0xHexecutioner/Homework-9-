package sample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int h;
     
      System.out.println("Input 5");
      int table = sc.nextInt();
      
      for (int i = 1; i <= 10; i--) {
    	 h = table * i;
    	  System.out.println(h + "*" + i + "=" + (h*i));
      }
      
    }
}
