package review;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterReader;

public class review28 {
	/**
	 * 1.统计各个文件的个数
	 * 2.将1中录入的文件夹包含子文件夹的所有java文件拷贝到E:\\java\\文件夹中
	    分别利用字节流，字符流，缓冲流完成
	 * @author Administrator
	 * @throws Exception 
	 *
	 */
	public static void main(String args[]) throws Exception {
		File SourceFile = new File("E:\\java\\day01");
		File DestinalFile = new File("G:\\456");
		ergodic(SourceFile,DestinalFile);
		
	}
	public static boolean ergodic(File SourceFile,File DestinalFile) throws Exception {
		File[]  files = SourceFile.listFiles();
		String file_name = SourceFile.getName();
		File newfile = new File(DestinalFile.getPath()+"\\"+file_name);
		newfile.mkdirs();
		if(files ==null ||files.length==0) {
			return false;
		}
		else {
			for(int i = 0 ;i<files.length;i++) {
				if(files[i].isDirectory()) {
					 ergodic(files[i],newfile); 
				}
				else {
					copy(files[i],DestinalFile);
				}
			}
		}
		return true;
		
	}

	
	public static void copy(File SourceFile,File DestinalFile) throws Exception {
		String file_name = SourceFile.getName();
		File newfile = new File(DestinalFile.getPath()+"\\"+file_name);
		/*FileReader fi = new FileReader(SourceFile);
		BufferedReader br = new BufferedReader(fi);
		FileWriter fw = new FileWriter(newfile);
		BufferedWriter bw = new BufferedWriter(fw);*/
		FileInputStream fi = new FileInputStream(SourceFile);
		FileOutputStream fo = new FileOutputStream(newfile);
		byte[]  bytes = new byte[1024];
		int len = 0;
		while((len=fi.read(bytes))!=-1) {
			fo.write(bytes, 0, len);
		}
		
		/*while((str=br.readLine())!= null) {
			bw.write(str);
			bw.newLine();
			bw.flush();
			
		}*/
		//bw.close();
		fo.close();
		//br.close();
		fi.close();
		
	}
}
