package review;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class review18 {
	/**
	 * 1.输入一个字符串,分别统计出其中英文字母、空格、数字和其它字符的数量
	 * 正则表达式
	 * 英文  "[a-zA-Z]"
	 * 空格 "\\s"
	 * 数字 "[0-9]"
	 */
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		String string = sc.nextLine();
		char[]  chars = string.toCharArray();
		Map<String,Integer>  map = new HashMap<>();
		String srt = "";
		for(char cha:chars) {
			srt = String.valueOf(cha);
			if(srt.matches("[a-zA-Z]")) {
				if(map.get("zimu") == null || map.get("zimu") ==0) {
					map.put("zimu",1);
				}
				else {
					map.put("zimu", map.get("zimu")+1);
				}
			}else if(srt.matches("[0-9]")) {
				if(map.get("shuzi") == null || map.get("shuzi") ==0) {
					map.put("shuzi",1);
				}
				else {
					map.put("shuzi", map.get("shuzi")+1);
				}
			}else {
				System.out.println("others");
			}
		}
		System.out.println(map);
	}
}
