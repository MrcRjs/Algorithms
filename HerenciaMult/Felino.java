package Practica03;

public class Felino extends Mamifero {
  public Felino(String dieta, Integer año, String lugar, String dueño, String raza){
    super(dieta, año, lugar, dueño, raza);
  }; 
  public void muestraFelino(){
    System.out.println("*** Felino ***");
    System.out.println("Dieta: " + this.dieta);
    System.out.println("Año: " + this.año);
    System.out.println("Lugar de Nacimiento: " + this.lugarNacimiento);
    System.out.println("Dueño: " + this.dueño);
    System.out.println("Raza: " + this.raza);
  }; 
}
