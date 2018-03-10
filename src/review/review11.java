package review;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import common.present;

public class review11 {
	public static void main(String args[]) {
		/*present p = new present();
		Thread t1 = new Thread(p,"a");
		Thread t2 = new Thread(p,"b");
		t1.start();
		t2.start();*/
		System.out.println("input a string of english");
		Scanner sc= new Scanner(System.in);
		String string = sc.nextLine();
		string.trim();
		Map<Character,Integer>   map = new HashMap<>();
		char[]  chars = string.toCharArray();
		for(char character:chars) {
			if(map.containsKey(character)) {
				map.put(character, map.get(character)+1);
			}
			else {
				map.put(character, 1);
			}
		}
		System.out.println(map);
	}
	
	

/**
 * 
 *3.取出一个字符串中字母出现的次数。如：字符串："abcdekka27qoq" ，
 * 输出格式为：a(2)b(1)k(2)...
 * @author Administrator
 *
 */
}
