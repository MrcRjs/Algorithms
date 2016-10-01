public class Intento3 implements Lock {
  int cambio = 0;
  public void requestCR( int i ) {
      while(cambio==1-i);
  }
  public void releaseCR( int i ) {
      cambio = 1-i;
  }
}