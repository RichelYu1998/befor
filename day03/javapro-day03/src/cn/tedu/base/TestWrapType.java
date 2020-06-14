package cn.tedu.base;

//包装类型（只打印数字类型，4个整形，2个浮点）
public class TestWrapType {
	static byte a;
	static Byte y;
	
	
	public static void main(String[] args) {
		System.out.println("基本变量默认值："+a);
		System.out.println("引用对象默认值："+y);
		
		System.out.println();
		
		Byte b = 100;	//包装类型才有额外方法，基本类型是没有的！！！！
		Short s = 100;
		Integer i = 100;
		Long x = 200L;
		
		Float f = 1.2f;
		Double d = 1.2d;
		
		System.out.println("Byte 的范围：" + b.MIN_VALUE + " ~ " + b.MAX_VALUE);
		System.out.println("Short 的范围：" + s.MIN_VALUE + " ~ " + s.MAX_VALUE);
		System.out.println("Integer 的范围：" + i.MIN_VALUE + " ~ " + i.MAX_VALUE);
		System.out.println("Long 的范围：" + x.MIN_VALUE + " ~ " + x.MAX_VALUE);
		
		System.out.println();
		
		System.out.println("Float 的范围：" + f.MIN_VALUE + " ~ " + f.MAX_VALUE);
		System.out.println("Double 的范围：" + d.MIN_VALUE + " ~ " + d.MAX_VALUE);
		
		
	}
}
