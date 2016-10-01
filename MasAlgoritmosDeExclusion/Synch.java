public class Synch implements Lock{
	
	public static synchronized void swap(boolean m1, boolean m2) {
		boolean temp=m1;
		m1=m2;
		m2=temp;
	}
	public void requestCS(int i) {
		swap(true, false);
	}
	public void releaseCS(int i) {
		swap(false, true);
	}
}
