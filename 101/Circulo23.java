package Practica02;
import java.util.Scanner;
import static java.lang.Math.PI;
public class Circulo23 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("// Círculo 2.3 //");
    System.out.println("Ingresa el radio del círculo:");
    int radio = in.nextInt();
    System.out.println("El diámetro del círculo es: " + radio * 2);
    System.out.println("Es perímetro deĺ círculo es: " + radio * 2 * Math.PI);
    System.out.println("El área del círculo es: " + Math.PI * radio * radio);
  }
}
