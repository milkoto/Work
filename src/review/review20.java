package review;

public class review20 implements Runnable{
	private int i =0;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			while(i<=100) {
				synchronized (this) {
					
					if(i%2 !=0) {
						System.out.println(Thread.currentThread().getName()+" "+i);
					}
					i++;
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
		}
	
		public static void main(String args[]) {
			review20 r = new review20();
			Thread t1 = new Thread(r,"a");
			Thread t2 = new Thread(r,"b");
			t1.start();
			t2.start();
		}
	
	
	
	}
	/**
	 * 3.同时开启两个线程，共同输出1-100之间的所有数字，并且将输出奇数的线程名称打印出来
	 * if(i%2!=0){
	 *         syso
	 * }
	 * @author Administrator
	 *
	 */
	

