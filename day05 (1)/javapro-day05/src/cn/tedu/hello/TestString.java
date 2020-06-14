package cn.tedu.hello;

public class TestString {		//不要关键字String作为类名
	public static void main(String[] args) {
		//转义的例子，不可见字符，格式对齐，TAB键；
		System.out.println("aaa\t\t\t\t\t\tbbb");	//\t，斜杠是转义意思，t TAB键
		System.out.println("aaa\nbbb");	//\n，转义字符，代表回车
		
		//这是eclipse自作聪明！它给你翻译了
		String path = "D:\\java\\ws\\2004\\javapro-day05\\src\\cn\\tedu\\hello\\TestString.java";
		System.out.println(path);		//真正底层操作是没有转义字符的
		
		path = path.replace("\\", "/");		//把\写个替换成/。\\第一个是转义，第二个参数\
		
		//split起到作用，把上面字符串分割成7个部分，把每个部分内容放入数组
		String[] ps = path.split("/");		//参数是一个正则表达式
		System.out.println("数组长度：" + ps.length );
		
		//遍历数组
		for(int i=0; i< ps.length; i++) {
			System.out.println( ps[i] );
		}
		
		//获取上面路径中的文件名？
		String fileName = ps[ ps.length -1 ];		//最后一个元素
		System.out.println(fileName);
	}
}
