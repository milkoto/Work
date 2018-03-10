package common;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class box implements Runnable{

	public Member m;
	public int num=0;
	public box(Member m) {
		super();
		this.m=m;
	}
	public box() {}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			m.getLock().lock();
			if(m.menbers>0) {
				
				List<Integer> list  = this.setticket();
				num++;
				Member.menbers--;
				System.out.println(Thread.currentThread().getName()+" renshu:"+num+" shengyu:"+Member.menbers);
				System.out.println("haoma:"+list);
				
			}
			m.getLock().unlock();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public  List<Integer>  setticket() {
	Random r = new Random();
	List<Integer> list  = new ArrayList<Integer>();
	while(list.size()<=7) {
		int i = r.nextInt(50);
		if(!list.contains(i)) {
			list.add(i);
		}
	}
	return list;
	}
	

}
