package common;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ticket implements Runnable{

	private static int ticket_num = 100;
	
	private Lock safe = new ReentrantLock();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			
			safe.lock();
				if(ticket_num>0) {
					
						
						System.out.println(Thread.currentThread().getName()+"剩余票数为"+ticket_num);
						ticket_num--;	
								
								
				}	
			
			safe.unlock();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	

}
