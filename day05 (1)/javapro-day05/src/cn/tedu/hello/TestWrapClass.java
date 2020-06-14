package cn.tedu.hello;

//八个包装类的父类（超类）是谁？
public class TestWrapClass {
	public static void main(String[] args) {
		Byte b = 10;
		System.out.println(b.getClass().getName()+"的父亲是：" +  b.getClass().getSuperclass());
		System.out.println(b.getClass().getName()+"的爷爷是：" +  b.getClass().getSuperclass().getSuperclass());
		System.out.println(b.getClass().getName()+"的祖宗是：" +  b.getClass().getSuperclass().getSuperclass().getSuperclass());
		
		//Byte它的父类Number类，Number它的父类是Object类
		
		Short s = 0;
		System.out.println( "Short的父类："+s.getClass().getSuperclass());
		
		Integer i = 0;
		System.out.println( "Integer的父类："+i.getClass().getSuperclass() );
		
		Long x = 0L;
		System.out.println( "Long的父类："+x.getClass().getSuperclass() );
		
		Float f = 0.0f;
		System.out.println( "Float的父类："+f.getClass().getSuperclass() );
		
		Double d = 0.0d;
		System.out.println( "Double的父类："+d.getClass().getSuperclass() );
		
		Character c = 'a';
		System.out.println( "Character的父类："+c.getClass().getSuperclass() );
		
		Boolean bn = true;
		System.out.println( "Boolean的父类："+bn.getClass().getSuperclass() );
	}
	
	
	
	
	
	
	
}
