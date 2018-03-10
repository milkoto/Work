package review;

import java.util.Scanner;

public class review13 {
	/*
	 * 1.编写一个校验用户名的程序,检测键盘录入的用户名是否合法
	     要求:用户名必须是6-10位之间的字母并且不能以数字开头
	 */
	
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		String string = sc.next();
		String regx= "[a-zA-Z][0-9]{1,2}[a-zA-Z0-9]{5,9}+";
		if(string.matches(regx)) {
			System.out.println("yes");
		}else
			System.out.println("no");
	}
}
