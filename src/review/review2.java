package review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class review2 {
	public static void main(String args[]) throws Exception {
		/**
		 * 2.map中有如下数据(电话号=套餐价格)
		    [13265477888=168,15241698745=11,13699989898=20,1898686666=120]
		    在ip为127.0.0.1数据库名为stdb,连接数据库的用户名和密码为:admin和123456中有一个numinfo表相关字段为(id,iphonenum,tomoney)(15分)
		    (1)将map中的手机号码取出来打印到控制台上(3分)
		    (2)判断map中所有的手机号在numinfo表中是否存在存在则输出"该主机已登录"如果不存在将该号码及对应的套餐价格存入到numinfo表中.(12分)
		    (map中的数据不需要修改)
		 * @author Administrator
		 *
		 */
		
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		map.put("132654778821238", 168);
		map.put("1524169874312", 11);
		map.put("1369998989234", 20);
		map.put("189868666541", 120);
		showMap(map);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "123");
		String sql = "select * from numinfo where iphonenum=?";
		PreparedStatement per = null;
		ResultSet result = null;
		Set entries = map.entrySet();
		Iterator iterator = entries.iterator();
		while(iterator.hasNext()){
			Map.Entry <String,Integer>  entriesMap = (Entry<String, Integer>) iterator.next();
			String phone = entriesMap.getKey();
			per = con.prepareStatement(sql);
			per.setString(1, phone);	
			//System.out.println(phone);
			result = per.executeQuery();
			if(result.next()) 
				{
					System.out.println("yidenglu");
				}
			else 
				{
					Integer tmoney = entriesMap.getValue();
					String sql1 =" insert into numinfo(iphonenum,tomoney) values (?,?)";
					per = con.prepareStatement(sql1);
					per.setString(1, phone);
					per.setInt(2, tmoney);
					 int row = per.executeUpdate();
		                if(row!=0){                    
		                    System.out.println("注册成功");
		                }
					
				}
			
		}
		 	con.close();
		 	result.close();
	        per.close();
		
		
	}
	
	public static void showMap(Map map) {
		System.out.println(map); 
	}
}
