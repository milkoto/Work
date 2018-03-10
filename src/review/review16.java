package review;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class review16 {
	/**
	 * 3.有一个Map集合里面存储的是学生的姓名和年龄，内容如下
	 * {张三丰=21, 灭绝师太=38, 柳岩=28, 刘德华=40, 老鬼=36, 王二麻子=38}
	    a.将里面的元素用两种遍历方式打印到控制台上
	    b.将老鬼的年龄改成66
	    c.将年龄大于24的学生姓名，存入到D:\\student.txt中
	 * @author Administrator
	 *
	 */
	public static void main(String args[]) {
        Map<String, Integer> map = new HashMap<>();
        map.put("张三丰", 21);
        map.put("灭绝师太", 38);
        map.put("柳岩", 28);
        map.put("刘德华", 40);
        map.put("老鬼", 36);
        map.put("王二麻子", 38);
        Set<Map.Entry<String, Integer>> mapen = map.entrySet();
        
        for(Map.Entry<String, Integer>Entry :mapen) {
        	System.out.println(Entry.getKey()+" "+Entry.getValue());
        }
        /**
         * 1.有一个字符串"woaijavahajavajavavahajavaaiwo"删除该字符串中所有的"java"并且统计删除了多少个“java”
         * @author Administrator
         */
        String srt = "woaijavahajavajavavahajavaaiwo";
        String regx="[j][a][v][a]";
        String[] srts  =  srt.split(regx);
        if(srts != null && srts.length>1) {
        	System.out.println(srts.length);
        }
        for(String string:srts) {
        	System.out.print(string+" ");
        }
        
        
        
	}
}
