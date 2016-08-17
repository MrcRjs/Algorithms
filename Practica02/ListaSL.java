package Practica02;

public class ListaSL<V> {

  protected Nodo<V> head, tail;
  protected long size;

  public ListaSL() {
    head = null;
    tail = null;
    size = 0;
  } 
  
  public void addFirst(Nodo<V> Nodo) {
    if (tail == null)
      tail = Nodo;
    Nodo.setNext(head);
    head = Nodo;
    size++;
  } 

  public void addAfter(Nodo<V> currentNodo, Nodo<V> newNodo) {
    if (currentNodo == tail)
      tail = newNodo;
    newNodo.setNext(currentNodo.getNext());
    currentNodo.setNext(newNodo);
    size++;
  } 

  public void addLast(Nodo<V> Nodo) {
    Nodo.setNext(null);
    tail.setNext(Nodo);
    tail = Nodo;
    size++;
  }
  public Nodo<V> removeFirst() {
    if (head == null)
      System.err.println("Error: Lista vacía");

    Nodo<V> temp = head;

    head = head.getNext();
    temp.setNext(null);
    size--;
    return temp;
  } 

  public Nodo<V> removeLast() {
    Nodo<V> NodoBefore;
    Nodo<V> NodoToRemove;

    if (size == 0)
      System.err.println("Error: Lista vacía");

    NodoBefore = getFirst();

    for (int count = 0; count < size - 2; count++)
      NodoBefore = NodoBefore.getNext();

    NodoToRemove = tail;

    NodoBefore.setNext(null);
    tail = NodoBefore;
    size--;

    return NodoToRemove;
  } 

  public void remove(Nodo<V> NodoToRemove) {

    Nodo<V> NodoBefore, currentNodo;

    if (size == 0)
      System.err.println("Error: Lista vacía");

    currentNodo = getFirst();
    if (currentNodo == NodoToRemove)
      removeFirst();
    currentNodo = getLast();
    if (currentNodo == NodoToRemove)
      removeLast();

    if (size - 2 > 0) {
      NodoBefore = getFirst();
      currentNodo = getFirst().getNext();
      for (int count = 0; count < size - 2; count++) {
        if (currentNodo == NodoToRemove) {
          NodoBefore.setNext(currentNodo.getNext());
          size--;
          break;
        }

        NodoBefore = currentNodo;
        currentNodo = currentNodo.getNext();
      } 
    } 

  }

  public void printList(){
    // Todo-Print Nodo elements
    if (size == 0)
      System.err.println("Error: Lista vacía");
    System.out.println("// *** Lista *** //");
    Nodo nodoActual = this.getFirst();
    while(nodoActual!=null){
      System.out.println(nodoActual.getElement());
      nodoActual = nodoActual.getNext();
    }
  }

  public Nodo<V> getFirst() {
    return head;
  }

  public Nodo<V> getLast() {
    return tail;
  }

  public long getSize() {
    return size;
  }

  public static void main(String[] args) {
    System.out.println("// ********** Lista Simple ********* //");
    System.out.println();
    ListaSL lista = new ListaSL();
    Nodo<String> testNodo1 = new Nodo<String>("Elemento", null);
    Nodo<String> testNodo2 = new Nodo<String>("Otro elemento", null);
    Nodo<Integer> testNodo3 = new Nodo<Integer>(3, null);
    Nodo<String> testNodo4 = new Nodo<String>("Último elemento", null);
    //System.out.println(testNodo1.getElement());
    lista.addFirst(testNodo1);
    lista.addLast(testNodo2);
    lista.addLast(testNodo3);
    lista.addLast(testNodo4);
    lista.printList();
    lista.removeLast();
    lista.printList();
    lista.remove(testNodo3);
    lista.printList();
  }

}
