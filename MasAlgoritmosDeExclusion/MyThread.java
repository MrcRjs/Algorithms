import java.util.ArrayList;
import java.util.Random;
public class MyThread extends Thread {
    int myId;
    int objeto;
    int objTam;
    Lock lock;
    Random r;
    boolean finalizado=false;
    Procesador pro;
    static ArrayList<Long> buffer= new ArrayList<Long>();
    static ArrayList<Long> id= new ArrayList<Long>();
    
    public MyThread(int id, Lock lock, Procesador p) {
        myId = id;
        objeto=0;
        this.lock = lock;
        r= new Random();
        pro=p;
        objTam=pro.getTamano();
    }
    public void nonCriticalSection() {
        System.out.println(myId + " no esta en la CR");
        objeto++;
        if(objeto==objTam)
        {
        	finalizado=true;
        }
        //Util.mySleep(r.nextInt(2000));
    }
    public void CriticalSection() {
    	int [] arr;
        System.out.println(myId + " esta en la CR");
        // critical section code
        arr=pro.procesarObjeto(objeto);
        System.out.println("id:"+arr[0]);
        System.out.println("tiempo:"+arr[1]);
        buffer.add((long) arr[1]);
        id.add((long) arr[0]);
        //Util.mySleep(r.nextInt(2000));
    }
    public void run() {
        while (finalizado!=true) {
        	synchronized(Lock.class) {
            lock.requestCS(myId);
            CriticalSection();
            lock.releaseCS(myId);
            nonCriticalSection();}
        }
    }
    public static void main(String[] args) throws Exception {
    	
    	Objeto3d Objeto3d1 = new Objeto3d("Objeto3d 1",1, new int[] { 2, 7, 1, 5, 8, 3, 7 });
		Objeto3d Objeto3d2 = new Objeto3d("Objeto3d 2",2, new int[] { 5, 3, 5, 9, 1, 3 });
		
		long initialTime = System.currentTimeMillis();

		Procesador procesador1 = new Procesador("Procesador 1",Objeto3d1,initialTime);
		Procesador procesador2 = new Procesador("Procesador 2",Objeto3d2,initialTime);
    	
        MyThread t[];
        int N = Integer.parseInt("2");
        t = new MyThread[N];
        Lock lock = new Synch();//or any other mutex algorithm
        t[0] = new MyThread(0, lock,procesador1);
        t[1] = new MyThread(1, lock,procesador2);
        t[0].start();
        t[1].start();
        
        t[0].join();
        t[1].join();
        
        System.out.println("Buffer: " + MyThread.buffer.toString());
        System.out.println("Id's  : " + MyThread.id.toString());
    }
}
