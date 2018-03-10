package common;

import java.util.ArrayList;

public class MyUtilsImpl implements MyUtil{
	/**	
	    a.ArrayList集合排序方法：将传入的ArrayList集合元素进行进行排序（不能直接用Collections.sort()方法）
	    //冒泡
	    b.字符串过滤字母：将传入的ArrayList<String>集合中的每个元素中的字母过滤掉,比如（传入 hello123java，返回123）
	    //字符串转数组       遍历条件符合[0-9]的添加
	 * @author Administrator
	 *
	 */
	
	
	
	@Override
	public void sort(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		int temp = 0;
		for(int i =0;i<list.size();i++) {
			for(int j = i+1;j<list.size();j++) {
				if(list.get(i)>list.get(j)) {
					temp = list.get(j);
					list.set(j, list.get(i));
					list.set(i, temp);
				}
			}
		}
		
	}

	@Override
	public void filterChars(ArrayList<String> list) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
			String[] strs  =list.get(i).split("[a-zA-Z]+");
			String str ="";
			for(String number:strs) {
				str+=number;
			}
			list.set(i, str);
		}
		
	}

}
