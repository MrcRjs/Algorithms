package Practica03;

public class GatoDomestico extends Felino {
  public GatoDomestico(String dieta, Integer año, String lugar, String dueño, String raza){
    super(dieta, año, lugar, dueño, raza);
  };
  public void muestraGatoDomestico(){
    System.out.println("*** Gato Doméstico ***");
    System.out.println("Dieta: " + this.dieta);
    System.out.println("Año: " + this.año);
    System.out.println("Lugar de Nacimiento: " + this.lugarNacimiento);
    System.out.println("Dueño: " + this.dueño);
    System.out.println("Raza: " + this.raza);
  };
}
