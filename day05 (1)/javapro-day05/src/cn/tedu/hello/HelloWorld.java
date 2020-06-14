package cn.tedu.hello;


public class HelloWorld {
	
	public static void main(String[] args) {
		//创建对象？
		HelloWorld hw = new HelloWorld();
		System.out.println( hw );	//本质就是调用了toString方法
		
		//cn.tedu.hello.HelloWorld@659e0bfd
//	    public String toString() {
//	        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//	    }
	    
		System.out.println( hw.toString() );
		//我的类没有toString怎么来的这个方法呢？
	}
}
