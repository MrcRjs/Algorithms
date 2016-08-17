package Practica02;
import java.util.Scanner;
public class MayorQue22 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("// Mayor que 2.1 //");
    System.out.println("Ingresa un número:");
    float num1 = in.nextFloat();
    System.out.println("Ingresa otro número:");
    float num2 = in.nextFloat();
    if (num1 > num2) {
      System.out.println(num1 + " es mayor que " + num2 + ".");
    }
    if (num2 > num1) {    
      System.out.println(num2 + " es mayor que " + num1 + ".");
    }else {
      System.out.println("Los números son iguales.");
    }
  }
}
