package Practica03;
public class Main {
  public static void main(String[] args) {
   GatoDomestico minino = new GatoDomestico("Whiskas", 2008, "Rusia", "Ivanova Alebranov","Bobtail");
   minino.muestraGatoDomestico();
   Felino estrellaCirco = new Felino("Carne Salmón", 2007, "Egipto", "Sarah Hartwell", "Persa Negro");
   estrellaCirco.muestraFelino();
   System.out.println("*************");
   System.out.println("Dieta minino: " + minino.obtenDieta());
   System.out.println("Año y lugar de nacimiento Minino: " + minino.obtenAño() + " " + minino.obtenLugar());
   System.out.println("Año y lugar de nacimiento estrellaCirco: " + estrellaCirco.obtenAño() + " " + estrellaCirco.obtenLugar());
   System.out.println("Dueño de minino: " + minino.obtenDueño());
   System.out.println("Raza minino: " + minino.obtenRaza());
   System.out.println("Raza estrellaCirco: " + estrellaCirco.obtenRaza());
   }
}
