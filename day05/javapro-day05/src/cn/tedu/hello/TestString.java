package cn.tedu.hello;

public class TestString {
	public static void main(String[] args) {
		String s="125030";
		
		System.out.println(s.charAt(0)+s.charAt(1));	//ascii 49+50=99  没有实际意义
		
		//之前写法两个数字相加，下面字符串连接符
		System.out.println(s.charAt(0)+""+s.charAt(1)); 

	}
}
