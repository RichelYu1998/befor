package cn.tedu.base;

//7种基本类型默认值，
public class TestBaseType {
	//成员变量，在类的声明的下面
	byte b;			//字节类型的默认值0
	short s;
	int i;
	long x;
	
	float f;
	double d;
	
	boolean bn;
	String str; 
	
	public void print() {
		System.out.println("byte 字节类型默认值：" + b);
		System.out.println("short 短整型默认值：" + s);
		System.out.println("int 整型默认值：" + i);
		System.out.println("long 长整型默认值：" + x);

		System.out.println();   //打印加空行
		
		System.out.println("float 单精度浮点数默认值：" + f);
		System.out.println("double 双精度浮点数默认值：" + d);
		
		System.out.println();
		
		System.out.println("boolean 布尔类型的默认值：" + bn);
		
		System.out.println("String 字符串默认的值：" + str );
	}

	public static void main(String[] args) {
		TestBaseType tbt = new TestBaseType();
		tbt.print();
	}
}
