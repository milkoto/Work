package common;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class present implements Runnable{
	static int present_num = 100;
	Lock lock = new ReentrantLock();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			lock.lock();
			if(present_num>10) {
				present_num--;			
				System.out.println(Thread.currentThread().getName()+" remaind ticket number is"+present_num);
			}
			lock.unlock();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
}
