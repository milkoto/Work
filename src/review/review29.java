package review;

public class review29 {
	public static void main(String args[]) {
		String s1 ="programming";//bide shi neicun 
		String s2 = new String("programming");//
		String s3 = "program";
		String s4="ming";
		String s5 = "program"+"ming";
		String s6=s3+s4;//chuan jian xin duixiang
		System.out.println(s1==s2);//false bide shi neicun 
		System.out.println(s1==s5);//true
		System.out.println(s1==s6);//false
		System.out.println(s1==s6.intern());
		System.out.println(s1==s2.intern());		
	}
}
