package review;

import java.lang.reflect.Method;

public class review24 {
	/**
	 *编写一个类,怎加一个实例的方法用于打印一条字符串
	 *并使用反射的手段创建该类的对象,并调用该类的方法
	 * @author Administrator
	 */
	public review24() {}
	public void print() throws Exception, SecurityException {
		Class clazz = this.getClass();
		Method method = clazz.getMethod("print2", String.class);
		method.invoke(this, "dads");
	}
	
	
	
	    public static void main(String[] args) throws Exception {
	        //获取字节码对象
	       Test2 t = new Test2();
	       t.print();
	       
	    }
	}
	class Test2 extends review24{
	    public void print2(String str){
	    	
	        System.out.println(str);
	    }
	}

