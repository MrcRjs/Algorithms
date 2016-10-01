public class principal {

	public static void main(String[] args) {

		objeto3d objeto3d1 = new objeto3d("Objeto3d 1", new int[] { 10, 20, 5, 5, 2, 3 });
		objeto3d objeto3d2 = new objeto3d("Objeto3d 2", new int[] { 12, 3, 5, 17, 1 });

		// Tiempo inicial de referencia
		long timeStamp = System.currentTimeMillis();
		tarjeta tarjeta1 = new tarjeta("tarjeta 1", objeto3d1, timeStamp);
		tarjeta tarjeta2 = new tarjeta("tarjeta 2", objeto3d2, timeStamp);

		tarjeta1.start();
		tarjeta2.start();
	}
}
