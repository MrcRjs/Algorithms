public class TestAndSet implements Lock{
	int myValue = -1;
	public synchronized int testAndSet(int newValue) {
		int oldValue = myValue;
		myValue = newValue;
		return oldValue;
	}
	public void requestCS(int i) {
		while(testAndSet(i) == 1);
	}
	public void releaseCS(int i) {
		testAndSet(0);
	}
}
