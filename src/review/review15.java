package review;

import common.Cup;
import common.Shop;

public class review15 {
	/**
	 * 2.有100个限量版的水杯，但是只能通过实体店和官网才能进行购买，并且分别统计卖了多少。
	 *   请用线程进行模拟并设置线程名称用来代表售出途径，再将信息打印出来。
	    比如（实体店卖出第1个，总共剩余n个..）
	 * @author Administrator
	 *
	 */
	public static void main(String args[]) {
		Cup cup = new Cup();
		Shop shop1 = new Shop(cup);
		Shop shop2 = new Shop(cup);
		Thread t1 = new Thread(shop1,"a");
		Thread t2 = new Thread(shop2,"b");
		t1.start();
		t2.start();
	}
	
}
