package review;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class review8 {
	/**
	 * 2.给定一个list集合:{"张柏芝","刘德华","张亮","张靓颖","杨颖","黄晓明"}
	     1.编写一个方法:将list集合中所有姓张的人员写入到D:\\a.txt中
	     2.编写一个方法:将D:\\a.txt中所有姓张的人员信息读取出来并打印到控制台上
	 * @author Administrator
	 * @throws Exception 
	 *
	 */
	public  static void main(String args[]) throws Exception {
		List<String> list = new ArrayList<String>();
		Collections.addAll(list,"张靓颖","张柏芝","刘德华","张亮","杨颖","黄晓明");
		write(list);
		read(new File("G:\\123.txt"));
		
	}
	
	public static void write(List<String> list) throws Exception {
		BufferedWriter out = new BufferedWriter(new FileWriter("G:\\123.txt"));
		for(int i = 0;i<list.size();i++) {
			
			if(list.get(i).startsWith("张")) {
				
				out.write(list.get(i)+" ");
				
			}
				
			
		}
		out.close();
	}
	
	public static void read(File file) throws Exception {
		
		BufferedReader out = new BufferedReader(new FileReader(file));
		List<String> list = new ArrayList<>();
		String buff="";
		while((buff=out.readLine())!= null) {
			list.add(buff);
		}
		out.close();		
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i));
		}	
		
	
	}
}
