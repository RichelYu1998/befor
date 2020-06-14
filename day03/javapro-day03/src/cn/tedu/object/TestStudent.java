package cn.tedu.object;

public class TestStudent {
	public static void main(String[] args) {
		//创建对象
		Student stu1 = new Student();
		
		//初始化值
		stu1.id = 100;	//调用stu对象的id属性
		stu1.name = "tony";
		stu1.age = 18;
		
		//访问
		System.out.println(stu1.id);
		System.out.println(stu1.name);
		System.out.println(stu1.age);
		
		System.out.println(stu1);  //对象地址：cn.tedu.object.Student@659e0bfd
		
		//一个类，可以创建多个对象，n个！
		Student stu3 = new Student();
		stu3.id = 200;
		stu3.name = "jenny";
		stu3.age = 16;
		
		System.out.println(stu3);	//如果加了toString()，就直接打印内容
	}
}
