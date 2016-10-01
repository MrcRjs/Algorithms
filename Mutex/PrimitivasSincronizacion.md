## Primitivas de sincronización

Todas las soluciones previas al problema de exclusión mutua fueron o tuvieron algún tipo de *deperdicio*. Si un proceso es incapaz de entrar a la CR, este verific repetidamente a que la condición de entrada sea **verdadera**. Lo cual implica trabajo inútil.

A esta forma de esperar se le conoce como **espera activa**. ( busy-wait ). En lugar de verifica la condición de entrada repetidamente, si el proceso verifica la condición sólo cuado esta puede ser verdadera, este podría **no** desperdiciar ciclos de CPU. Realizar esto requiere de soporte del SO.

Por l tanto, las primitivas de sincronización existen para **anular** la espera actica. Por ende, las primitivas de sincronización son utilizadas en el problema mutex así como para proporcionar **orden** entre las operaciones de varios hilos.

Aunque existen ucho tipos de sincronización (construidos en varios lenguajes) dos de ella son las mas prevaecientes:
1.  Semáforos
2.  Monitores

##### Semáforos

Dijkstra propuso el concepto de semáforo que soluciona el problema de espera activa. Un semáforo tiene dos campos: **su valor y una cola de procesos** bloqueado, asi como dos operaciones asociadas, **P()** y **V()**.

La semántica de un semáforo binario se muestra mejor en el siguiente programa:

```java
public class semaforoBinario{
	boolean value;
    SemaforoBinario( boolean initValue ){
    	value = initValue;
    }
	public synchronized void P( void ) {
    	while( value == false )
       		Util.myWait( this );
		value = false;
    }
    public sinchronized void V( void ){
    	value = true;
        notify();
    }
}
```

El contenido de **value** de un semáforo (o semáforo binario) sólo puede ser *falso* o *verdadero*. La cola de proceos bloqueados está vacía inicialmente y un proceso puede añadirse a sí mismo a la cola cuando éste realiza una llamada a **P()**.
Cuando un proceso llama a **P()** y **value** es *verdadero*, entonces el valor de **value** se convierte en *falso*. Sin embargo, si **value** del semáforo es *falso,* entonces el proceso se bloquea hasta que este llega a ser *verdadero*:

La invocación a **Util.myWait()**(linea 11) consigue esto. La clase **Util** se muestra a continuación, pero por ahora se asume que esta llamada inserta al proceso que la invocó a la cola de procesos bloqueados.

```java
import java.Util.*;
public class Util{
	public static int max( int a, int b ){
    	if( a > b)
        	return a;
        return b;
    }
    public static void mySleep( int time ){
    	try{
        Thread.sleep( time );
        }
        catch( InterruptedException e){//msg}
    }
    public static void myWait( Objectobj ){
    	System.out.println("waiting");
        try{
        obj.wait();
        }
        catch(InterruptedException e){//msg}
    }
}
```


Cuando **value** se hace *verdadero*, el proceso puede hacerlo *falso* en la línea 12 y regresar la llamada a **V()** hace a **value** *verdadero* y al mismo tiempo le notifica al proceso si la cola de procesos en espera en dicho semáforo es **no vacía**. Ahora implementar la exclusión mutua es casi trivial:

```java
SemaforoBinario mutex = new SemaforoBinario();
mutex.P();
criticarSection();
mutex.V();
```

_ _ _

Otra variante del semáforo le permite a este tomar un entero arbitrario para value. Éstos semáforos son llamados "Semáforos de Conteo", su semántica se muestra a continuación:

```java
public class SemaforoContador{
	int value;
    public SemaforoContador( int initValue ){
    	value = initValue;
    }
    public sychronizezd void P(){
    value--;
    if( value < 0 )
    	Util.myWait( this );
    }
    public synchronized void V(){
    	value++;
        if( value <= 0 )
        	notify();
    }
    public satic void myWait( Object obj ){
        System.out.println("waiting");
        try{
        obj.wait();
        }
        catch( InterruptedException e){}
	}
}
```

**Nota:** *Java no proporciona semáforos como parte del lenguaje base, pero pueden ser implementados fácilmente usando la idea de monitores, de los que se hablará mas adelante.*
