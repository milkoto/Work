package review;

import java.util.Scanner;

public class review14 {
	/**
	 * 1.将"goOd gooD stUdy dAy dAy up"每个单词的首字母转换成大写其余还是小写字母
	 * (不许直接输出good good study day day up 要用代码实现)
	 * @author Administrator
	 *
	 */
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		String[] strings = string.split(" +");
		String out = "";
		for(String str:strings) {
			 String head = str.substring(0, 1).toUpperCase();
			 String end = str.substring(1).toLowerCase()+" ";
			 out+=head+end;
		}
		System.out.println(out);
	}
}
