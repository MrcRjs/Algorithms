public class Intento2 implements Lock{
  boolean abreAcceso = true;
  boolean[] needCR = {false,false};
  public void requestCR(int i){
    needCR[i]=true;
    while(needCR[1-i]){
      needCR[i] = false;
    }
  }
  public void releaseCR(int i){
    needCR[i] = false;
  }
}
