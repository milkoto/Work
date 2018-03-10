package review;

import java.awt.image.BufferedImageFilter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class review26 {
	/**
	 * 3.    有一个数组 String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};
	    a.    创建一个ArrayList，将数组里面的元素添加进去，但元素不能重复 (该数组不变)
	        //判断是否包含
	    b.    创建一个 TreeSet，将数组里面的元素按升序序存入该集合里，并且不能去重
	    c.  将数组里面的所有元素存入到项目根目录下的String.txt文件中
	 * @author Administrator
	 *
	 */
	public static void main(String args[]){
		String[] arr = {"abc","bad","abc","aab","bad","cef","jhi"};
		List<String>  list = new ArrayList<String>();
		for(int i = 0; i <arr.length;i++) {
			if(!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}
		System.out.println(list);
		String temp="";
		TreeSet<String> set = new TreeSet<String>(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				String str1 = (String) o1;
				String str2 = (String) o2;
				if( str1.compareTo(str2)>0)
					return -1;
				else 
					return 1;
				
			}
			
		});
		  for (int i = 0; i < list.size(); i++) {
	            set.add(list.get(i));
	        }
		  System.out.println(set);
	
		
		try {
		BufferedWriter bw = new BufferedWriter(new FileWriter("G:\\123.txt"));
			for (int i = 0; i <arr.length;i++) {
				bw.write(arr[i]);
				}
			bw.close();
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
