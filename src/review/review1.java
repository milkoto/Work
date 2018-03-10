package review;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1.键盘输入10个数，放到数组中
    a.    去除该数组中大于10的数
    b.    将该数组中的数字写入到本地文件number.txt中
    
 * @author Administrator
 *
 */

public class review1 {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int array[]  = new int[10] ;
		System.out.println("START");
		int num = 0;
		while(num<10) {
			int i = sc.nextInt();
			array[num]  = i;
			num++;
		}
		List<Integer>  list = new ArrayList<Integer>();
		for(int i =0;i<array.length;i++) {
			if(array[i]<10) {
				list.add(array[i]);
				
			}
		}
		
		
		
		BufferedWriter buff = new BufferedWriter(new FileWriter("G:\\123.txt"));
		for(int i = 0;i<list.size();i++) {
			buff.write(list.get(i)+" ");
			System.out.println(list.get(i));
		}
		System.out.println("finish");
		buff.close();
		
		
	}
}
