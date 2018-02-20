package Pi;

public class Paralelo implements Runnable{
	float nPoints;
	int nTasks;
	float pointsPerTask;
	float circle_count = 0;
	Paralelo(float _npoints, int _nTasks){
		nPoints = _npoints;
		nTasks = _nTasks;
		pointsPerTask = nPoints / nTasks;
		
	}
	public void run( ) {
		for( int i = 0; i < nTasks; i++ ) {
			Secuencial secPi = new Secuencial();
			circle_count += secPi.countInsideCircle(pointsPerTask);
			
		}
		float Pi = 4 * circle_count/nPoints;
		System.out.println( "Pi(paralelo): " + Pi );
	}

}
