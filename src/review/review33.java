package review;

public class review33 {
	public static void main(String args[]) {
	       boolean flag = false; 
		for ( int i = 0; i < 2147483647L + 1; i ++ ) {  
		    if( Integer.MAX_VALUE == i ) {  
		        flag = true;  
		    }  
		     
		    if( flag ) {  
		        System.out.println( i );  
		    }  
	}
}
}
