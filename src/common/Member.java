package common;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Member {
	public static int menbers = 100;
	private List<Integer>  ticket =new ArrayList<Integer>();
	private Lock lock = new ReentrantLock();
	public Lock getLock() {
		return lock;
	}
	public void setLock(Lock lock) {
		this.lock = lock;
	}
	public static int getMenbers() {
		return menbers;
	}
	public static void setMenbers(int menbers) {
		Member.menbers = menbers;
	}
	public List<Integer> getTicket() {
		return ticket;
	}
	public void setTicket() {
		Random r = new Random();
		while(ticket.size()<=7) {
			int i = r.nextInt(50);
			if(!ticket.contains(i)) {
				ticket.add(i);
			}
		}
	}
	@Override
	public String toString() {
		String string = "";
		for(int i = 0;i<ticket.size();i++) {
			string  += ticket.get(i)+" ";
		}
		return string;
		
	}
	
	
}
