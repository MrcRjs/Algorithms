/*
 * CURSO:			COMPUTO DISTRIBUIDO
 * 
 * CARRERA:			Ingenieria en Tecnologias de la Informacion
 * 
 * DESCRIPCION:		Clase auxiliar que hereda o extiende a la clase 'Search' e implementa
 * 					a la interfaz 'Runnable' que administra el uso de procesos ligeros (hilos).
 */

import java.lang.Thread;
import java.util.Arrays;

public class Busqueda extends Search implements Runnable 
{
	// Atributos basicos para la busqueda
	int inicio;
	int fin;
	int A[];
	int x;
	
	// Constructor
    public Busqueda(int inicio, int fin, int A[], int x) 
    {
    	// Creacion del subobeto perteneciente a la superclase para el manejo de herencia
        super();
        
        // Manejo de la excepcion
        if( fin < inicio ) 
        {
            throw new IllegalStateException();
        }
        
        // Inicializacion de los valores de los atributos
        this.inicio = inicio;
        this.fin = fin;
        this.A = A;
        this.x = x;
    }

    // CODIGO que ejecutara cada uno de los hilos
    public void run() 
    {
    	// Recorrido del trozo del arreglo
        for( int i = inicio; i < fin; i++ ) 
        {
        	
            if (x == A[i]) 
            {
                indice = i;
                System.out.println("EN EJECUCIoN: Hilo " + Thread.currentThread().getId() + " -> posicion: " + i + "\n");
                
                // Parar cuando el primero lo encuentre
                //break;
            }
        }
    }

    // Sobre carga del metodo 'toString()' para mostrar la informacion con la que esta trabajando el Hilo (bjeto distribuido)
    public String toString() 
    {
        return "busqueda ( A =" + Arrays.toString(A) + ", tamaño  = " + A.length + ", inicio = " + inicio + ", fin = " + fin + ", x = " + x + " )";
    }

}
