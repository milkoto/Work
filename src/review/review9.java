package review;

import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class review9 {
	
	/**
	 * 1.将用户在控制台上输出的5个数字按照大小顺序存入到D:\\xx.txt中,并读出显示在控制台上
	 * @author Administrator
	 *
	 */
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int a[]  = new int[50];
		Random r = new Random();
		for(int i =0;i<50;i++) {
			a[i] = r.nextInt(1000);
		}
		soft(a);
		for(int i :a) {
			System.out.print(i+" ");
		}
		System.out.println(a.length);
	}
	
	public static void soft(int a[]) {
		int temp = 0;
		for(int i = 0;i<a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
				
			}
		}
	}
}
