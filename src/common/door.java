package common;

import common.Company.Menber;

public class door implements Runnable {
	public int nums=0;
	private Company  c = new Company();
	public door(Company c) {
		this.c= c;
	}
	
	@Override
	public void run() {
		while(true) {
			c.lock.lock();
			if(c.getMenber_num()>0) {
				
				Menber m= c.entry();
				nums++;
				System.out.println(Thread.currentThread().getName()+"entry people is "+nums+"ticket is "+m.toString());
				
				
			}
			c.lock.unlock();
		}
		
	}

}
