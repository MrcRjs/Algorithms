class Intento4 implements Lock
{
  volatile boolean needCR[] = {false,false};
  int turno = 0;
  public void requestCR( int i ) {
    int x = 1 - i;
    needCR[i]=true;
    turno = x;
    while( needCR[x] && turno == x);
  }
  public void releaseCR( int i ) {
    needCR[i] = false;
  }
}