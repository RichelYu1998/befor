package cn.tedu.hello;

public class TestSelf {
	public static void main(String[] args) {
		int count = 10;
		
		System.out.println( count++ );		//先打印后加，打印：10，count=11
		System.out.println( ++count );		//先加后打印，12，打印：12，count=12
		
		System.out.println( count-- );		//先打印后减，打印：12, 11，count=11
		System.out.println( --count );		//先减后打印，10，打印：10
	}
}
