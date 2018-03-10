package review;

public class review34 {
	/*给定已经排序的数组和目标值，如果从数组中找到目标值，则返回该索引。 如果没有找到，则按顺序插入该目标值的索引。

	您可以假设数组中没有重复项。

	这里有几个例子。
	[1,3,5,6], 5 → 2
	[1,3,5,6], 2 → 1
	[1,3,5,6], 7 → 4
	[1,3,5,6], 0 → 0*/
	public  static void main(String args[]) {
		int[]  array = {1,3,4,5,6};
		int source=0;
		int target = 5;
		for(int min = 0,max = array.length-1;min<max;) {
			int  mid = min+((max-min)>>1);
			if(target ==array[mid]) {
				source = mid;
				break;
			}
			else if(target> array[mid]) {
				min=mid+1;
				
			}else if(target<array[mid]){ 
				max=mid;
			}
		}
		System.out.println(source);
	}
}
