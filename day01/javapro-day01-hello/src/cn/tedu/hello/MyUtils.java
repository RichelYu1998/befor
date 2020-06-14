package cn.tedu.hello;

public class MyUtils {
	//代码缩进tab=2个空格，方法的声明，不代表使用
	public void use() {
		System.out.println("我使用了工具类");
	}
	
	public int multi(int a, int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		//1.创建对象
		MyUtils mu = new MyUtils();
		
		//2.调用
		mu.use();		//方法的调用，使用这个方法
		int z = mu.multi(10, 20);
		System.out.println("乘法结果是：" + z);	//字符串连接符+
	}
}
