public class Intento1 implements Lock{
  boolean abreAcceso = true;
  public void requestCR(int i){
      while(!abreAcceso){
          abreAcceso = false;
      }
  }
  public void releaseCR(int i){
      abreAcceso = true;
  }
}
