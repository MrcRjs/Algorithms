package Pi;
import java.util.Random;

public class Secuencial {
	
	float circle_count=0;
	public float getRandom() {
		float rand=new Random().nextFloat();
		return rand;
	}
	private boolean checkIfInsideCircle(float x,float y) {
		//(x-centro_x)^2 + (y-centro_y)^2 < radio^2
		return ((x-0.5)*(x-0.5)+(y-0.5)*(y-0.5))<0.25;
	}
	public float calculatePi(float _nPoints) {
		float circle_count = countInsideCircle(_nPoints);
		return 4*circle_count/_nPoints;
	}
	public float countInsideCircle(float _nPoints) {
		for(int i=1; i<_nPoints; i++ ) {
			float p1= getRandom();
			float p2= getRandom();
			//System.out.println("("+p1+","+p2+")");
			if(checkIfInsideCircle(p1,p2))
				circle_count++;
		}
		//System.out.println(circle_count);
		return circle_count;
	}
}