/*
 * CURSO:			COMPUTO DISTRIBUIDO
 * 
 * CARRERA:			Ingenieria en Tecnologias de la Informacion
 * 
 * DESCRIPCION:		Clase principal que implementa la busqueda paralela de un numero
 * 					en un vector dividido entre el numero de hilos (objetos) creados.
 */

import java.lang.Thread;
import java.util.Arrays;

public class Search 
{
	static int indice;
	
	public Search(){	indice = -1;	}
	
	
	public static int parallelSearch( int x, int A[], int numThreads)
	{
		// Tamano de la particion
		int tam = A.length / numThreads;
		int inicio = 0, fin = 0;
		
		// Arreglo de hilos
		Thread[] threads = new Thread[numThreads];
		
		// Asignacion de los trozos para la busqueda
		for( int i = 0; i < numThreads; i++ ) 
		{
			// se establece el 'fin' del trozo segun el tamano maximo
			fin = inicio + tam;
			
			// si se trata del ultimo hilo o si 'fin' excede el tamano del arreglo
			if (i == numThreads - 1 || fin > A.length) 
			    fin = A.length;
			
			// se crea el "Objeto Distribuido Multi-hilo" que se encargra de la busqueda (secuencial)
			// asignandole su trozo del arreglo
			Busqueda res = new Busqueda(inicio, fin, A, x);
			
			// se crea y se lanza el i-esimo Hilo
			threads[i] = new Thread(res);
			threads[i].start();
			
			// se muestra la informacion del Hilo vinculado al Objeto de la clase Busqueda
			System.out.println( res );
			System.out.println( "Hilo: " + i + " PID: " + threads[i].getId() );
			
			// se actualiza el valor de inicio
			inicio = fin;
		}
		
		return indice;
	}

	public static void main(String[] args) 
	{
		// Se crea aleatoriamente un arreglo de enteros
		int[] arreglo = new int[20];
		
        for( int i = 0; i<arreglo.length; i++ ) 
        {
            arreglo[i] = (int)( Math.random()*10 );
        }
        
        // Se muestra el contenido del arreglo creado
        System.out.println( Arrays.toString(arreglo) );
        
        // Se establecen los parametros basicos para la busqueda
        int num = 3;
        int pos = parallelSearch( num, arreglo, 7 );
        
        // Se muestra el resultado
        if ( pos == -1 )
        {
            System.out.println( "El numero " + num + " no se encontro en el Arreglo" );
        }
        else
        {
            System.out.println( "El numero " + num + " se encuentra en la posicion " + pos );
        }
	}

}
