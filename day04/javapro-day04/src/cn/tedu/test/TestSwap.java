package cn.tedu.test;

//2个值交换位置
public class TestSwap {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("交换前：a="+a+", b="+b);
		
		//增加一个中间临时变量
		int t = 0;
		t = a;
		a = b;
		b = t;
		System.out.println("交换后：a="+a+", b="+b);
	}
}
