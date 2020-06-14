package cn.tedu.hello;

public class TestVar2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		a = a*2;
		b = b*3;
		c = c*4;
		
		//如果+加号两边都是数字，+叫做累加
		System.out.println(a+b+c);	//20+60+120=200
		//特殊点：字符串，如果+加号两边有字符串，不是累加，而是字符串拼接（拼串）
		System.out.println("a="+a+", b="+b+", c="+c);	//？200
	}

}
