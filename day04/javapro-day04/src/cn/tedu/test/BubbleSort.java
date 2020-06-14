package cn.tedu.test;

//经典算法：冒泡排序
public class BubbleSort {
	public static void main(String[] args) {
		//定义一个数组
		//int[] arr = {10, 20, 5, 3, 88};
		int[] arr = {4, 9, 2, 99, 1, 500};
		
		for(int i=0; i< arr.length-1; i++) {		//轮数
			//获取元素进行逐一比对，当前元素和下一个相邻的原则
			for(int j=0; j< arr.length -i -1; j++) {		//i代表最后的已经不需要比较的元素个数
				//arr[j] 代表当前元素
				//arr[j+1] 下一个相邻元素
				if( arr[j]>arr[j+1] ) {			//如果前面的值大，则交换位置，否则不交换
					int t = 0;
					t = arr[j+1];			//实现数据交换
					arr[j+1] = arr[j];
					arr[j] = t;
				}
			}
		}
		
		//打印最终数据结果？
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
}
