import java.util.*;
public class mergeSort implements Runnable
{
  public static Integer[] data;
  public static Integer[] combined;
  public int left, right;
  public mergeSort( Integer[] array) {
    this.data = array;
    this.combined = new Integer[data.length];
    left = 0;
    right = array.length - 1;
  }

  public mergeSort( Integer[] array, int left, int right) {
    this.data = array;
    this.combined = new Integer[data.length];
    this.left = left;
    this.right = right;
  }

  public void run() {
    if( left < right) {
      int middle1 = (left + right)/2;
      int middle2 = middle1+1;
      mergeSort ms1 = new mergeSort(data, left, middle1);
      mergeSort ms2 = new mergeSort(data, middle2, right);
      System.out.println("\n PID: " + Thread.currentThread().getId() + " Hilo 1");
      System.out.println("\n PID: " + Thread.currentThread().getId() + " Hilo 2");
      Thread hilo1 = new Thread(ms1);
      Thread hilo2 = new Thread(ms2);
      hilo1.start();
      hilo2.start();
      try{
        hilo1.join();
        hilo2.join();
      }
      catch(InterruptedException e){}
      merge(left, middle2, right);
    }
  }
  public void result() {
    for(int k=0; k < data.length ; k++ ){
      System.out.print( data[k] + " ");
    }
  }
  private static void merge(int left, int middle, int right) {
    int leftEnd = middle - 1;
    int k = left;
    int num = right - left + 1;
    while(left <= leftEnd && middle <= right) {
      if(data[left].compareTo(data[middle]) <= 0) {
        combined[k++] = data[left++];
      }
      else {
        combined[k++] = data[middle++];
      }
    }
    while(left <= leftEnd) {
      combined[k++] = data[left++];
    }
    while(middle <= right){
      combined[k++] = data[middle++];
    }
    for(int i = 0; i < num; i++, right--) {
      data[right] = combined[right];
    }
  }
  public String subarray( int low, int high) {
    StringBuilder temporary = new StringBuilder();
    for( int i=0; i < low; i++){
      temporary.append(" ");
    }
    for( int i = low; i <= high; i++){
      temporary.append("  " + data[i]);
    }
    return temporary.toString();
  }
  public String toString(){
    return subarray(0, data.length-1);
  }

  public static void main (String[] args)
  {
    Integer[] data = new Integer [7];
    int longitud = data.length;
    Random generator = new Random();
    for(int i=0; i < longitud; i++){
      data[i] = 10 + generator.nextInt(90);
    }
    System.out.println("Desordenado: " );
    for(int k=0; k < longitud ; k++ ){
      System.out.print( data[k] + " ");
    }
    mergeSort merge = new mergeSort(data);
    merge.run();
    System.out.print("\nOrdenado: ");
    merge.result();
  }
}
