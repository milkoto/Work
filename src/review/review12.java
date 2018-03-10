package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class review12 {
	/**
	 * 3.从键盘接受多个int型的整数,直到用户输入end结束
	     要求:把所有的整数按倒序写到D:\\number.txt中
	 * @author Administrator
	 *
	 */
	public static void main(String args[]) {
		List<Integer> list = getlist();
		List<String> list1=soft(list);
		for(String i :list1) {
			System.out.print(i+" ");
		}
	}
	
	
	public static List<Integer>   getlist(){
		List<Integer>list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		String string = "";
		//用正则判断输入的是否是整数+号表示多个的意思
        String regex = "[0-9]+";
		while(true) {
			string = sc.next();
			if(string.equals("end")) 
			{
				return list;
			}	
			else if(string.matches(regex)){
				list.add((Integer.parseInt(string)));
			}
			else {
				System.out.println("error");
				}
			}
	}
	
	
	public static List<String> soft(List<Integer> list) {
		List<String>list1 = new ArrayList<String>();
		if(list != null ||list.size()>0) {
			Object[] array =  list.toArray();			
			Object temp = null;
			for(int i = 0;i<list.size();i++){
				for(int j = i+1;j<list.size();j++){
					int min = Integer.parseInt(array[i].toString());
					int max= Integer.parseInt(array[j].toString());
					if(min<max) {
						temp=array[i];
						array[i]=array[j];
						array[j]=temp;
						}
					}
				}
			for(int i = 0;i<array.length;i++) {
				list1.add( array[i].toString());
			}
			
			}
		return list1;
		
	}
}
