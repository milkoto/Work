package review;

import java.lang.reflect.Field;

public class review27 {
	/**
	 *6.定义一个标准的JavaBean，名叫Person，包含属性name、age。
	    使用反射的方式创建一个实例、调用构造函数初始化name、age，使用反射方式调用setName方法对名称进行设置，
	    不使用setAge方法直接使用反射方式对age赋值。
	 * @author Administrator
	 * @throws ClassNotFoundException 
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
	 *
	 */
	
	    
	 
	 
	 public static void main(String args[]) throws Exception {
		 Class clazz =Class.forName("review.Person");
		 Person p =(Person) clazz.newInstance();
		
		 Field filed1 = clazz.getDeclaredField("name");
		 filed1.setAccessible(true);
		 filed1.set(p, "hi");
		 Field filed2 = clazz.getDeclaredField("age");
		 filed2.setAccessible(true);
		 filed2.set(p, "nihao");
		 System.out.println(p);
	 }
	 
}


class Person{
	private String name;
	private String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}