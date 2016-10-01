package Practica02;
import java.util.Scanner;
public class Aritmetica21 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("// Aritmética 2.1 //");
    System.out.println("Ingresa el primer número:");
    float num1 = in.nextFloat();
    System.out.println("Ingresa el segundo número:");
    float num2 = in.nextFloat();
    // Resultados aritméticos
    float suma = num1 + num2;
    float diferencia = num1 - num2;
    float producto = num1 * num2;
    float cociente = num1 / num2;
    System.out.println("***** Resultados *****");
    System.out.println("Suma: " + num1 + " + " + num2 + " = " + suma);
    System.out.println("Diferencia: " + num1 + " - " + num2 + " = " + diferencia);
    System.out.println("Producto: " + num1 + " * " + num2 + " = " + producto);
    System.out.println("cociente: " + num1 + " / " + num2 + " = " + cociente);
  }
}
