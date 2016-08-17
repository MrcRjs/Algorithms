package Practica02;
import java.util.Scanner;
import java.util.Locale;
public class Bmi24 {
  public static void main(String[] args) {
    Locale spanish = new Locale("es", "MX");
    Scanner in = new Scanner(System.in).useLocale(spanish);
    System.out.println("VALORES DE BMI");
    System.out.println("Bajo peso: menos de 18.5");
    System.out.println("Normal: entre 18.5 y 24.9");
    System.out.println("Sobrepeso: entre 25 y 29.9");
    System.out.println("Obeso: 30 o mas");
    System.out.println("// *** Calcula tu BMI *** //");
    System.out.println("Ingresa tu altura en metros:");
    float altura = in.nextFloat();
    System.out.println("Peso en Kg:");
    float peso = in.nextFloat();
    float bmi = peso / (altura * altura);
    if (bmi <= 18.5) {
      System.out.println("Tienes bajo peso.");
    }
    if(bmi > 18.5 && bmi <= 25) {
      System.out.println("Tienes peso normal.");
    }
    if (bmi > 25 && bmi <= 30) {
      System.out.println("Tienes sobrepeso");
    }
    if (bmi > 30) {
      System.out.println("Tienes obesidad");
    }
  }
}
