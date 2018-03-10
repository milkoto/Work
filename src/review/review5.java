package review;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class review5 {
	/** 
	 *2.从控制台获取输入的文件目录然后将指定目录下的.java文件复制到D:/java文件夹中
	 * @author Administrator
	 * @throws Exception 
	 */
	public static void main(String args[]) throws Exception {
		File DestinationalFile = new File("G:\\123");
		//get the destinational file's directory
		Scanner sc = new Scanner(System.in);
		System.out.println("input the file's directory");
		String directory = sc.next();
		File file = new File(directory);
		ErgoicAndCopy(file,DestinationalFile);
		System.out.println("finish");
	}
	
	public static boolean ErgoicAndCopy(File file,File DestinationalFile ) {
		File[]  files = file.listFiles();
		//ergoic the distinational file 
		//if the files if null.break
		String file_name =file.getName();
		String distinational_path = DestinationalFile.getPath();
		String path =  distinational_path+"\\"+file_name;
		File new_DestinationalFile = new File(path);
		new_DestinationalFile.mkdir();
		if(files ==null || files.length == 0) {
			return false;
		}
	
		for(File sourceFile:files) {
			//if the file is directory.contiune ergoic 
			if(sourceFile.isDirectory()) {			
				ErgoicAndCopy(sourceFile, new_DestinationalFile);
				
			}else {
			
				copyFile(sourceFile,new_DestinationalFile);
			}
		}
		return true;
		
	}
	
	public static void copyFile(File file,File DestinationalFile) {
		try {			
			FileInputStream file_in = new FileInputStream(file);
			byte[] buff= new byte[1024];					
			String filename = file.getName();		
			String[]  names = filename.split("[.]");
			
			//if the  extension is "jpg" or directory  .copy the file
			if(names[1].equals("jpg")) {
				String path = DestinationalFile.getPath()+"\\"+filename;
				FileOutputStream out = new FileOutputStream(new File(path));
				int n = 0;
				while((n=file_in.read(buff)) !=-1) {
					out.write(buff, 0, n);
				}
				out.close();
			}
			file_in.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
}
