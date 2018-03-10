package common;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Seat {
	private static int seat_nums=  80;
	private Lock lock = new ReentrantLock();
	public int getnums() {
		return seat_nums;
	}
	public void sitdown() {
		seat_nums--;
	}
	public Lock getLock() {
		return lock;
	}
	public void setLock(Lock lock) {
		this.lock = lock;
	}
	
}
