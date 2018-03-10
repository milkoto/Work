package common;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Company {
	private static int menber_num =120;
	public Lock lock = new ReentrantLock();
	public static int getMenber_num() {
		return menber_num;
	}

	public static void setMenber_num(int menber_num) {
		Company.menber_num = menber_num;
	}
	
	public Menber entry(){
		menber_num--;
		Menber  m  = new Menber();
		return m;
	}
	
	
	
	
	
	
	public class Menber{
		
		public Menber() {
			super();
			Random r = new Random();
			int i  = r.nextInt(49);
			ticket.add(i);
			while(ticket.size()<7) {
				
				i  = r.nextInt(49);
				ticket.add(i);
				
			}
		}
		
		
		private HashSet<Integer>ticket =  new HashSet<>();

		public HashSet<Integer> getTicket() {
			return ticket;
		}

		public void setTicket(HashSet<Integer> ticket) {
			
			this.ticket = ticket;
		}

		@Override
		public String toString() {
			String str="";
			for(int t  :ticket) {
				str += t+" ";
			}
			return str;
		}
		
		
		
	}
}
