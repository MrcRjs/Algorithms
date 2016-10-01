public class Peterson implements Lock
{
	volatile boolean needCR[]={false,false};
	int cambio = 0;

	@Override
	public void requestCS(int i) {
		int j = i;
		cambio=j;
		needCR[i]=true;
		while(needCR[j] && cambio==j);
	}

	@Override
	public void releaseCS(int i){
		needCR[i]=false;
	}

}
