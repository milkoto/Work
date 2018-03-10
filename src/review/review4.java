package review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 * 3.一个数据库stu,用户名为admin 密码为123456 已存在一个表中有五个学生的信息,姓名,性别,年龄,分数.
    id       name      sex     score
     1       李少荣    女      80
     2       邵凯      男      75
     3       周强      男      95
     4       王晓婷    女      55
     5       张秀花    女      68
     6       顾会      女      50
     7       赵天一    男      32
    (1)查询女性,成绩80以上
    (2)将姓张的男同学的的成绩改为100
    (3)查询年龄大于20的女性,显示姓名,性别,年龄
 * @author Administrator
 *
 */
public class review4 {
	public static void main(String args[]) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con  =  DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "123");
		//find the girls who's score bigger than 80
		String sql = "select *  from stu where score > 50 and sex = 0 ";
		PreparedStatement pst =  con.prepareStatement(sql);
		pst.executeQuery();
		ResultSet result = pst.getResultSet();
		while(result.next()) {
			System.out.println(result.getString("name")+result.getInt("score"));
		}
		sql = "UPDATE stu SET score =100 WHERE NAME LIKE '张%'  ";
		pst.executeUpdate(sql);
		result.close();
		pst.close();
		con.close();
		
	}
	
	
}
