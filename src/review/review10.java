package review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class review10 {
	/**
	 * 2.现在有一个map集合如下:
	      {1="张三丰",2="周芷若",3="汪峰",4="灭绝师太"}
	      要求:
	      1.将map集合中的所有信息显示到控制台上
	      2.向该map集合中插入一个编码为5姓名为李晓红的信息
	      3.移除该map中的编号为1的信息
	      4.将map集合中编号为2的姓名信息修改为"周林"
	 * @author Administrator
	 * @throws Exception 
	 *
	 */
	 public static void main(String args[]) throws Exception {
		 Map<Integer, String> map = new LinkedHashMap<>();
		 map.put(1, "张三丰");
	     map.put(2, "周芷若");
	     map.put(3, "汪峰");
	     map.put(4, "灭绝师太");
	     System.out.println(map);
	     map.remove(1);
	     map.put(2, "周林");
	     System.out.println(map);
	     System.out.println("input your name");
	     Scanner sc= new Scanner(System.in);
	     String username = sc.next();
	     String password = sc.next();
	     Class.forName("com.mysql.jdbc.Driver");
	     Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
	     String sql = "select * from stu where name=? and score = ?";	     
	     PreparedStatement pst = con.prepareStatement(sql);
	     pst.setString(1, username);
	     pst.setInt(2, Integer.parseInt(password));
	     ResultSet result = pst.executeQuery();
	     while(result.next()) {
	     System.out.println(result.getString(2)+result.getInt(4));
	     }
	     
	 }
	
	
}
