package p1;
import java.util.Scanner;
public class Practica1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// ################################
		// 2.8
		System.out.println("Ejercicio 2.8");
		// ################################
		
		// a)
		System.out.print("Escriba un entero");
		
		// b)
		int a = 0, b = 10, c = 10;
		c = b * c; 
		
		// ################################
		// 2.9
		System.out.println("\n\nEjercicio 2.9");
		// ################################
		
		// a) Los operadores en Java se evalúan de izquierda a derecha
		int j = 1 + 3 * 4;
		System.out.println(j);
		//  == Verdadero == ya que primero hace la multiplicación y despues la suma
		 
		// b) 
		int _barra_inferior;
		int m928134;
		int t5;
		int j7;
		int sus_ventas$;
		int su_$cuenta_total;
		//int a; Si es valida marca error por haberla declarado antes.
		int b$;
		//int c; Si es valida marca error por haberla declarado antes.
		int z;
		int z2;
		// == Verdadero == todas las variables son validas
		
		// d)
		/*int 3g;
		int 87;
		int 67h2;
		int h22;
		int 2h;*/
		// == Falso  == ya que no puede iniciar con un numero
		
		// ################################
		// 2.10
		System.out.println("\nEjercicio 2.10");
		// ################################
		
		int x=2,y=3;
		//a)Resultado  x=2
		System.out.printf("x=%d\n",x);
		//b) Resultado El valor de 2 + 2 es 4
		System.out.printf("El valor de %d + %d es %d\n",x,x,(x+x));
		//c) Resultado x=
		System.out.println("x=");
		//d)Resultado 5=5
		System.out.printf("%d=%d\n",(x+y),(y+x));
		
		// ################################
		// 2.11
		System.out.println("\nEjercicio 2.11");
		// ################################
		
		//¿Cuales de las siguientes instrucciones contiene variables, cuyo valores se modifican?
		// a) p=i+j+k+7; <-- La variable "p" es modificada
		// b) System.out.println("variables cuyos valores se modifican") <-- Solo imprime texto
		// c) System.out.println("a=5"); <-- Solo muestra el texto
		// d) valor = entrada.nextInt(); <-- La variable "valor" recibe una entrada
				
		// Resultado inciso a) y d)
		
		
		// ################################
		// 2.12
		System.out.println("\nEjercicio 2.12");
		// ################################
		
		int xx = 2;
		a = 1;
		System.out.println(a * xx * xx * xx + 7 + " "+ "Correcta");
		System.out.println(a * xx * xx * (xx + 7));
		System.out.println((a * xx) * xx * (xx + 7));
		System.out.println((a * xx) * xx * xx + 7 + " "+ "Correcta");
		System.out.println(a * (xx * xx * xx) + 7 + " "+ "Correcta");
		System.out.println(a * xx * (xx * xx + 7));
		// a, d, e ya no le dan prioridad a la suma
		
		// ################################
		// 2.13
		System.out.println("\nEjercicio 2.13");
		// ################################
		
		int x0=0,x1=0,x2=0;
		
		x0 = 7 + 3 * 6 / 2 - 1; //<-- inicia *,/, + y -
		x1 = 2 % 2 + 2 * 2 - 2 / 2;// inicia *,/,+ y -,%
		x2 = (3*9 * (3+ (9*3/(3))));
		
		System.out.println(x0);
		System.out.println(x1);
		System.out.println(x2);
		
		//Resultado a= 15 b=3 c=324;
		
		// ################################
		// 2.14
		System.out.println("\nEjercicio 2.14");
		// ################################
		
		// Mediante una instrucción println()
	    System.out.println("1 2 3 4");
	    // Mediante 4 instrucciones print()
	    System.out.print("1 ");
	    System.out.print("2 ");
	    System.out.print("3 ");
	    System.out.print("4");
	    // Mediante una instrucción printf
	    System.out.printf("\n1 2 3 4");
	    
	    // ################################
	    // 2.15
	    System.out.println("\n\nEjercicio 2.15");
	    // ################################
	   
	    System.out.println("Ingresa el primer número:");
	    float num1 = in.nextFloat();
	    System.out.println("Ingresa el segundo número:");
	    float num2 = in.nextFloat();
	    
	    System.out.println("Suma: " + num1 + " + " + num2 + " = " + (num1 + num2));
	    System.out.println("Diferencia: " + num1 + " - " + num2 + " = " + (num1 - num2));
	    System.out.println("Producto: " + num1 + " * " + num2 + " = " + num1 * num2);
	    System.out.println("cociente: " + num1 + " / " + num2 + " = " + num1 / num2);
		
	}

}
