package cn.tedu.pojo;

import java.util.Date;	//日期必须使用util包下的

//一个对象
public class Cat {
	//1. 属性（成员变量）
	private String name;
	private Date birthday;
	private String color;
	
	//2. 行为（方法）
	public void eat() {
		System.out.println("我是小猫，我喜欢吃小鱼");
	}
	
	public void run() {
		System.out.println("我是小猫，我活蹦乱跳");
	}
	
	public static void main(String[] args) {
		//好的习惯：对象是类的首字母小写
		Cat cat = new Cat();		//默认构造方法
		cat.eat();
		cat.run();
	}
}
