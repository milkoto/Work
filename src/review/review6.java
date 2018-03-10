package review;

import common.ticket;

public class review6 {
	/**
	 * 1.写一个卖票的程序,
	     1.写一个类,该类实现了Runnable接口.有一个私有类型的int作为参数tickets.
	       票的总数为100,完成run方法,输出结果的格式如下:
	       当前窗口为:窗口a,剩余票数为19,其中窗口a为线程的名字
	     2.开启四个卖票窗口(开始四个线程),同时执行卖票的程序
	 * @author Administrator
	 *
	 */
	public static void main(String args[]) {
		ticket t1 = new ticket();
		Thread thread1 = new Thread(t1,"A");
		Thread thread2 = new Thread(t1,"b");
		Thread thread3 = new Thread(t1,"c");
		Thread thread4 = new Thread(t1,"d");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
}
