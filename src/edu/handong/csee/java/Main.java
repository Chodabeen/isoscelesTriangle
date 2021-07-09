package edu.handong.csee.java;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Main stepE = new Main();
    stepE.e03();
  }
  void e03(){
    Scanner s = new Scanner(System.in);
    int height;
    int i, j;

    System.out.print("Enter a height of triangle > ");
    height = s.nextInt();

    for(i = 1; i <= height; i++){
      for(j = 0; j < height - i; j++)
        System.out.print(" ");
      for(j = 0; j < i*2-1; j++)
        System.out.print("*");

      System.out.println();
    }
  }
}


