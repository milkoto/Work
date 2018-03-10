package review;

import java.util.HashMap;

public class review32 {
	public static void main(String args[]) {
		Long ahead = System.currentTimeMillis();
		Runtime run = Runtime.getRuntime();
		String strs = "qyqqewyery23tdd";
		String s = cal(strs);
		System.out.println(s);
		Long after = System.currentTimeMillis();
		long max = run.maxMemory();
		long total = run.totalMemory();
		long free = run.freeMemory();
		long usable = max - total + free;
		System.out.println("最大内存 = " + max);
		System.out.println("已分配内存 = " + total);
		System.out.println("已分配内存中的剩余空间 = " + free);
		System.out.println("最大可用内存 = " + usable);
		Long use = after-ahead;
		System.out.println(use);
	}
	
	
	public static String cal(String strs) {
		String c ="";
		if(strs==null&&strs.equals("")) {
			return null;
		}
		else {
			char[] cha=strs.toCharArray();
			HashMap<Character,Integer> map = new HashMap<Character,Integer>();
			for(int i =0;i<cha.length;i++) {
				if(!map.containsKey(cha[i])){
					map.put(cha[i], 1);
				}else {
					int num = map.get(cha[i]);
					map.put(cha[i], ++num);
					if(num>=3) {
						c=String.valueOf(cha[i]);
						break;
					}
				}
			}
			
		}
		return c;
	}
}
