package review;

import common.Busdoor;
import common.Seat;

public class review17 {
	public static void main(String args[]) {
	Seat seat = new Seat();
	Busdoor fd = new Busdoor(seat);
	Busdoor md = new Busdoor(seat);
	Busdoor bd = new Busdoor(seat);
	Thread t1 = new Thread(fd,"fd");
	Thread t2 = new Thread(md,"md");
	Thread t3 = new Thread(bd,"bd");
	t1.start();
	t2.start();
	t3.start();
	}
}
