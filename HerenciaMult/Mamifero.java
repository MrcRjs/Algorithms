package Practica03;

public abstract class Mamifero {

  public String dieta;
  public Integer año;
  public String lugarNacimiento;
  public String dueño;
  public String raza;
  
  public Mamifero(String dieta, Integer año, String lugar, String dueño, String raza){
    this.dieta = dieta;
    this.año = año;
    this.lugarNacimiento = lugar;
    this.dueño = dueño;
    this.raza = raza;
  }
  
  public void setDieta(String dieta){
    this.dieta = dieta;
  };
  public String obtenDieta(){
    return dieta;
  };
  
  public void setDueño(String dueño){
    this.dueño = dueño;
  };
  public String obtenDueño(){
    return dueño;
  };
  
  public void setAño(Integer año){
    this.año = año;
  };
  public Integer obtenAño(){
    return año;
  };
  
  public void setLugar(String lugar){
    this.lugarNacimiento = lugar;
  };
  public String obtenLugar(){
    return lugarNacimiento;
  };
  public void setRaza(String raza){
    this.raza = raza;
  };
  public String obtenRaza(){
    return raza;
  };
  
  
//Muestra
  public void muestraMamifero(){
    System.out.println("*** Mamifero ***");
    System.out.println("Dieta: " + dieta);
    System.out.println("Año: " + año);
    System.out.println("Lugar de Nacimiento: " + lugarNacimiento);
    System.out.println("Dueño: " + dueño);
    System.out.println("Raza: " + raza);
  };
}
