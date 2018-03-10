package common;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Shop implements Runnable{
	private int sell_nums=0;
	private Cup cup;
	Lock lock = new ReentrantLock();
	

	public  Shop(){}
	
	
	public  Shop(Cup cup){
		this.cup=cup;
	}
	
	
	
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			
			if(cup.getNums()>0) {
				lock.lock();
				cup.sells();
				this.sell_nums++;
				System.out.println(Thread.currentThread().getName()+"sells nums"+sell_nums+"---------remains"+cup.getNums());
				lock.unlock();
			}
			else {
				break;
			}
		}
	}
}
