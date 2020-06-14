package cn.tedu.base;

//数组
public class TestArray {
	public static void main(String[] args) {
		//有三个值：100,200,300，用数组如何表达？
		
		//标准写法：声明数组
		int[] arr = {100, 200, 300, 400,500,600};		//基本类型整形数组
		
		//? 数组是基本类型还是引用类型？
		//如果打印值，直接显示它的值，它就是基本类型；如果打印地址，就是引用类型
		System.out.println(arr);		//[I@659e0bfd	对象地址
		
		//访问数组，java中数组下标是从0开始，下标是个数字
		System.out.println( "第一个元素："+arr[0] );
		System.out.println( "第二个元素："+arr[1] );
		
		//数组的长度-1。		写代码原则，尽量通用，不要写死代码
		System.out.println( "最后一个元素："+arr[arr.length - 1] );
		
		//错误：数组越界，.ArrayIndex（数组的下标）OutOfBounds（超过长度值）Exception
		System.out.println("数组的长度是：" +arr.length );
		System.out.println( "最后一个元素："+arr[10] );
		
	}
}
