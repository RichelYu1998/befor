package cn.tedu.hello;

//测试类
public class TestVar {
	public static void main(String[] args) {
		//定义变量
		int x = 0;		//声明一个类型为int整形的变量，变量名y，初始化值0
		int y = 10;
		
		System.out.println("x的值是：" + x );//+不是数学加号，字符串连接符
		
		//java在一个方法内不能声明重名变量，在一个方法中变量：局部变量
		//int x = 2;		//Duplicate local variable x
		
		x = 2;			//再次赋值，可以非常多的次数
		y = 20;
		System.out.println("x的值是：" + x );
		
		String s = "abc";
		System.out.println(s);
		
		s = "123";		//不是数字，用双引号括起来在java中叫做字符串
		System.out.println(s);
		
		//定义常量，第一次赋值称为初始化值
		final int z = 10;		//final修饰之后，这个值只能初始化一次，就不能再次设置值！
		System.out.println(z);
		//z = 20;	//The final local variable z cannot be assigned. It must be blank and not using a compound assignment
		System.out.println(z);
		
		//习惯上常量使用全大写
		final String SYSTEM_NAME = "达内java培优核心项目-京淘电商";
		//SYSTEM_NAME = "abc";    常量不允许再次设置值
		System.out.println(SYSTEM_NAME);
	}
}
