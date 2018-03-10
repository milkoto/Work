package review;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String namecalss = sc.nextLine();
        Class clazz = Class.forName(namecalss);
        
       // Class[] clazz1 = clazz.getDeclaredClasses();
        //Constructor con1 = clazz1[0].getConstructor(clazz);
       // con1.setAccessible(true);
       // Test2 t = (Test2) con1.newInstance(clazz.newInstance());
       // Method method = clazz1[0].getMethod("showString", null);    
        Method method = clazz.getMethod("showString", null); 
        
        method.invoke(clazz.newInstance());
    }
    
    private class Test2{
    	public Test2() {}
    	public void showString(){
        System.out.println("showString");
    	}
    }
}
class test{
	public void showString(){
        System.out.println("showString");
    	}
}
	


