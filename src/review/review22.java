package review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import common.MyUtil;
import common.MyUtilsImpl;

public class review22 {
	/**
	 * 1.设计一个interface MyUtil，该接口有两个抽象方法 
	    创建一个类实现MyUtil接口并按以下要求实现两个抽象方法
	    public abstract void sort(ArrayList<Integer> list);
	    public abstract void filterChars(ArrayList<String> list);
	    a.ArrayList集合排序方法：将传入的ArrayList集合元素进行进行排序（不能直接用Collections.sort()方法）
	    //冒泡
	    b.字符串过滤字母：将传入的ArrayList<String>集合中的每个元素中的字母过滤掉,比如（传入 hello123java，返回123）
	    //字符串转数组       遍历条件符合[0-9]的添加
	 * @author Administrator
	 *
	 */
	public static void main(String args[]) {
		String str1=  " hello123jad232va";
		String str2=  " he3s2sa3o12dsa3java";
		ArrayList<String>  list = new ArrayList<>();
		list.add(str1);
		list.add(str2);
		MyUtil u  = new MyUtilsImpl();
		u.filterChars(list);
		for(String str:list) {
			System.out.println(str);
		}
		ArrayList<Integer>  list1 = new ArrayList<>();
		Collections.addAll(list1, 5,8,10,1,20,4,7,9);
		u.sort(list1);
		for(Integer str:list1) {
			System.out.print(str+" ");
		}
	}
}
