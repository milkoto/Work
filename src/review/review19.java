package review;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import common.Student;

public class review19 {
	/**
	 * 2.定义一个实体类有姓名、学号、成绩(int类型)三个属性
	    (1)在创建对象时给这些属性进行显示初始化
	    (2)将学生的信息(姓名、学号、成绩)存入到适当的集合，并且根据学生成绩按照降序打印到控制台
	    //遍历集合  拿出成绩  比较 >>冒泡排序
	 * @author Administrator
	 *
	 */
	/*public static void main(String args[]) {
		Student s1 = new Student("1","a",80);
		Student s2 = new Student("2","b",51);
		Student s3 = new Student("3","c",100);
		Student s4 = new Student("4","d",54);
		Student s5 = new Student("5","e",70);
		List<Student> list = new ArrayList<Student>();
		Collections.addAll(list, s1,s2,s3,s4,s5);
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getScore()>o2.getScore()) {
				return 1;
				}
				else if(o1.getScore()<o2.getScore())
					return -1;
				
				else
					return 0;
			}
		});
		for(Student stu:list) {
			System.out.println(stu);
		}
		
	}
	*/
}
