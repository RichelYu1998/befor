package cn.tedu.hello;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		HelloWorld helloWorld = new HelloWorld();
		
		helloWorld.print();
		
		int z = helloWorld.add(10, 22);
		System.out.println("add方法的返回值是：" + z);
	}


	public void print() {
		System.out.println("print method");
	}
	

	public int add(int x, int y) {
		return x+y;
	}
}
