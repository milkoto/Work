package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class data {
	private static Connection con;
	
	public static Connection getCon() {
		return con;
	}

	public static void setCon(Connection con) {
		data.con = con;
	}

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "123");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static List<Student> getStudent() throws Exception {
		String sql  = "select * from stu";
		PreparedStatement pst = con.prepareStatement(sql);
		List<Student> list = new ArrayList<Student>();
		pst.executeQuery();
		ResultSet rs = pst.getResultSet();		
		while(rs.next()) {
			Student stu = new Student(rs.getString("id"),rs.getString("name"),rs.getInt("age"),rs.getInt("age"));
			list.add(stu);
		}
		return list;
		
	}
	
	 // (4)实现添加Student对象的方法
      public static int addStudent(Student student) throws SQLException {
    	 String sql  = "select * from stu where name = ? ";
    	 PreparedStatement pst = con.prepareStatement(sql);
    	 pst.setString(1, student.getName());
    	 ResultSet rs =  pst.executeQuery();
    	
    	 if(rs.next()) {
    		 return -1;
    	 }
    	 else {
    		 sql  = "insert into stu(name,score,age)  values (?,?,?)";
    		 pst = con.prepareStatement(sql);
    		 pst.setString(1, student.getName());
    		 pst.setInt(2, student.getScore());
    		 pst.setInt(3, student.getAge());
    		 int i=pst.executeUpdate();
    		 if(i!=0) {
    			 return 1;
    		
    		 }
    		 else {
    			 return -1;
    		 }
    		 
    		 
    	 }
          //要求传递一个Student对象,先判断该对象有没有,没有的话,添加,提示添加成功,有的话打印添加失败,并返回-1
      }
      
     
}
