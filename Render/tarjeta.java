public class tarjeta extends Thread {

	private String nombre;

	private objeto3d obj;

	private long timeStamp;


	public tarjeta() {
	}

	public tarjeta(String nombre, objeto3d obj, long timeStamp) {
		this.nombre = nombre;
		this.obj = obj;
		this.timeStamp = timeStamp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long gettimeStamp() {
		return timeStamp;
	}

	public void settimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

	// Constructor, getter y setter
	
	public void run(){

		System.out.println("TARJETA: " + this.nombre + 
				"\nCOMIENZA A PROCESAR AL OBJETO: " + obj.getObjetoRender() + 
				"\nTIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000	+ "seg");

		for (int i = 0; i < obj.getObjetoRender().length; i++) 
		{ 
			this.esperarNsegundos(obj.getObjetoRender()[i]); 
			System.out.println("Objeto " + (i + 1) + " PROCESADO " +  
								"\nTiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + 
								"segundos");
		}

		System.out.println("TARJETA: " + this.nombre + " HA COMPLETADO EL PROCESAMIENTO " + 
							obj.getNombre() + " EN TIEMPO: " + 
							(System.currentTimeMillis() - timeStamp) / 1000 + " segundos");

	}


	private void esperarNsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

}
