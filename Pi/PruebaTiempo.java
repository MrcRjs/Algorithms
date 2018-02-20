package Pi;

public class PruebaTiempo {
	public void exeSeq(){
		long tiempoInicial = System.currentTimeMillis();
		Secuencial PiS= new Secuencial();
		System.out.println("Pi(secuencial): " + PiS.calculatePi(1000000));
		long tiempoFinal = System.currentTimeMillis(); 
		long tiempoTranscurrido = tiempoFinal - tiempoInicial; 
		System.out.println( "Ejecutado secuencialmente en " + (float)tiempoTranscurrido/100 + " segundos." );
	}
	public void exePar(){
		long tiempoInicial = System.currentTimeMillis();
		Thread paraPi = new Thread( new Paralelo( 1000000, 50) );
		paraPi.start();
		try {
			paraPi.join();
		} catch( InterruptedException e ){
			System.out.println("Interrupted Pi Calculation");
		}
		long tiempoFinal = System.currentTimeMillis(); 
		long tiempoTranscurrido = tiempoFinal - tiempoInicial; 
		System.out.println( "Ejecutado paralelamente en " + (float)tiempoTranscurrido/100 + " segundos." );
	}

	public static void main(String[] args) {
		PruebaTiempo testPi = new PruebaTiempo();
		testPi.exeSeq();
		testPi.exePar();
	}
}
