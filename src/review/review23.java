package review;

import common.Company;
import common.door;

public class review23 {
	/**
	 * 2.某公司组织年会,会议入场时有两个入口,在入场时每位员工都能获取一张双色球彩票,假设公司有100个员工,
	 * 利用多线程模拟年会入场过程,
	    并分别统计每个入口入场的人数,以及每个员工拿到的彩票的号码。线程运行后打印格式如下：
	    编号为: 2 的员工 从后门 入场! 拿到的双色球彩票号码是: [17, 24, 29, 30, 31, 32, 07]
	    编号为: 1 的员工 从后门 入场! 拿到的双色球彩票号码是: [06, 11, 14, 22, 29, 32, 15]
	    //.....
	    从后门入场的员工总共: 13 位员工
	    从前门入场的员工总共: 87 位员工
	 * @author Administrator
	 * 双色就的号码不重复    建立一个产生7位不重复整数的方法  hashset不重复   list接收
	 * 集合长度为条件    往集合中添加  如果集合已经包含就不添加
	 */
	public static void main(String args[]) {
		Company c = new Company();
		door fd = new door(c);
		door bd = new door(c);
		Thread t1 = new Thread(fd,"frontDoor");
		Thread t2 = new Thread(bd,"backDoor");
		t1.start();
		t2.start();
	}
}
