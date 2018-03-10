package common;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Busdoor implements Runnable{
	private Seat seat;
	private int nums=0;
	public Seat getSeat() {
		return seat;
	}
	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	public int getNums() {
		return nums;
	}
	public void setNums(int nums) {
		this.nums = nums;
	}
	public Busdoor(Seat seat) {
		this.seat = seat;
		
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			seat.getLock().lock();
			
			if(seat.getnums()>0) {
				
				nums++;
				seat.sitdown();
				System.out.println(Thread.currentThread().getName()+"shangche"+nums+"shengyu"+seat.getnums());
				
				
			}
			
			seat.getLock().unlock();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
