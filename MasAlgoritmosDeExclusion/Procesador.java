public class Procesador
{
	private String nombre;
	private long timeStamp;
	private Objeto3d obj; 

	public Procesador(String nombre,Objeto3d obj, long time) {
		this.nombre=nombre;
		this.obj=obj;
		timeStamp=time;
	}
	
	public int[] procesarObjeto(int i) {
		
		int [] elemento= new int[2];

		System.out.println("Tarjeta: " + this.nombre + 
				"\nComienza a procesar el objeto: " + obj.getNombre() + 
				"\nTiempo: " + (System.currentTimeMillis() - timeStamp) / 1000	+ " seg");

			this.esperarNsegundos(obj.getObjetoRender()[i]); 
			System.out.println("Objeto " + (i + 1) + " Procesado " +  
								"\nTiempo: " + obj.getObjetoRender()[i] + 
								"segundos");

		if(i==obj.getObjetoRender().length-1) {
		System.out.println("Procesador: " + this.nombre + " ha completado el procesamiento " + 
							obj.getNombre() + " en: " + 
							(System.currentTimeMillis() - timeStamp) / 1000 + " segundos");
		}
		
		elemento[0]=obj.getID();
		elemento[1]=obj.getObjetoRender()[i];
		
		return elemento;

	}
	public int getTamano() {
		return obj.getObjetoRender().length;
	}
	private void esperarNsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
}
