package review;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class demo30 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		String sourcefilename = sc.next();
		File sourceFile = new File(sourcefilename);
		String parentFilename = "G:\\456";
		File destFile = new File(parentFilename+"\\"+sourceFile.getName());
		if(!destFile.exists()) {
			destFile.createNewFile();
		}
		FileInputStream fi = new FileInputStream(sourceFile);
		FileOutputStream fo = new FileOutputStream(destFile);
		byte[]  buff = new byte[1024];
		int len = 0;
		while((len=fi.read(buff))!=-1){
			fo.write(buff, 0, len);
		}
		fo.close();
		fi.close();
		
		
	}
}
