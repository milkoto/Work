package review;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import common.Student;
import common.data;

public class review21 {
	/**
	 * 2.按一下要求完成相应功能(12分) (不能用DBUtils等工具类)
	    (1)设计一个工具类,定义一个方法名为getConnection的方法用来获取连接,相关的参数需要用形式参数的形式传入进去(4分)
	    (2)有一个student如下
	        id    name                age                    score
	        1    zs                    18                     98
	        2    ls                    24                     89
	        3    wwk                    32                     100
	        4    anni                25                     54
	    将该表中每一条记录都封装成一个Student对象,(用a中的getConnection方法来获取连接
	    其中数据库名称,用户名和密码可以自定义)不能直接给Student赋值(不如：Student = new Student("2s",18.98)),要获取数据库
	    里面相应的内容,然后赋值给Student对象(4分)
	    (3)将(2)中得到的Student对象存到list集合中并且用两种方式遍历出来(4分)
	    (4)实现添加Student对象的方法
	        public static int addStudent(Student student) {
	            //要求传递一个Student对象,先判断该对象有没有,没有的话,添加,提示添加成功,有的话打印添加失败,并返回-1
	        }
	    (5)实现修改Student对象的方法
	        public static int updateStudent(Student student) {
	            //要求传递一个Student对象,先根据该对象id查询是否存在,有的话,进行修改操作,并提示修改成功,返回1,没有的话打印修改失败,并返回-1
	        }
	    (6)实现删除Student对象的方法
	        public static int deleteStudentById(String id) {
	            //根据id删除Student对象,删除成功返回1,删除失败返回-1
	        }
	    (7)实现获取所有Student对象的以下方法
	        public static List<Student> getAllStudent1(){
	        }
	        public static List<Object[]> getAllStudent2(){
	            //Object[]:中存储的是每个学生对象的信息,比如Object[] arr = {"zs",18,98}
	        }
	        public static List<Map<String,Object>> getAllStudent3(){
	            //List<Map<String,Object>>:中存储的是Map集合,每个Map集合中存储的是该Student对象的属性值,其中key是String类型表示属性名称,
	            //value为Object类型,代表该属性对应的值
	 * @throws Exception 
	   **/
	
	public static void main(String args[]) throws Exception {
		List<Student>  list = data.getStudent();
		for(Student stu:list) {
			System.out.println(stu);
		}
		Student s1 = new Student();
		s1.setName("b");
		s1.setScore(100);
		s1.setAge(25);
		System.out.println(data.addStudent(s1));
	}
}
