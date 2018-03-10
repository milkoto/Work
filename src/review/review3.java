package review;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class review3 {
	/**
	 * 1.产生10个1-100的随机数，并放到一个数组中
	    (1)把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
	    (2)把数组中小于10的数字放到一个map集合中，并打印到控制台。
	    (3)把数组中的数字放到当前文件夹的number.txt文件中
	 * @throws Exception 
	 */
	public static void main(String[]  arg) throws Exception {
		int[]  array = new int[10];
		Random ron = new Random();
		List<Integer>  list  = new ArrayList<Integer>();
		Map<Integer,Integer>  map = new LinkedHashMap<>();
		int index = 1;
		for(int i =0;i<10;i++) {
			
			array[i]  = ron.nextInt(100);
			if(array[i]>=10) {
				list.add(array[i]);
			}
			else {
				map.put(index,array[i]);
				index++;
			}
		}
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("G:\\123.txt")));
		for(int i=0;i<array.length;i++) {
			writer.write(array[i]+" ");
		}
		System.out.println("finish");
		writer.close();
 	}
}
