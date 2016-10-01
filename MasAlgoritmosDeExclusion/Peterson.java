public class Peterson implements Lock
{
	volatile boolean needCR[]={false,false};
	int cambio = 0;

	@Override
	public void requestCS(int i)
	{
		int j= 1-i;
		needCR[i]=true;
		cambio=j;
		while(needCR[j] && cambio==j);
	}

	@Override
	public void releaseCS(int i)
	{
		needCR[i]=false;
	}

}
