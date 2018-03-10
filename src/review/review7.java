package review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class review7 {

	/**
	 * 2.向list集合添加姓名{张三,李四,王五,二丫,钱六,孙七},将二丫替换为王小丫,写入到"D:\\stuinfo.txt"
	 * @author Administrator
	 *
	 */
	
	public static void main(String args[]) {
		List<String>   list =  new ArrayList<String>();	
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("二丫");
		list.add("钱六");
		list.add("孙七");
		for(int i =0;i<list.size();i++) {
			System.out.println(i);
			if(list.get(i).equals("二丫"))
			{
				list.set(i, "王小丫");
			}
		}
		System.out.println("finish");
		for(String string:list) {
			System.out.println(string);
		}
		
	}
}
