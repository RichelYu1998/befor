package cn.tedu.hello;

//利用三目表达式来实现求最大值
public class TestMax {
	public static void main(String[] args) {
		int x = 100;
		int y = 20;

		//调用方法，创建对象，通过对象来调用方法
		//类 对象名= new 类();
		TestMax obj = new TestMax();
		int max = obj.max(x, y);		//实参
		System.out.println("最大值是："+max);
	}
	
	//如何写一个方法
	public int max(int x, int y) {		//形参
		int r = (x>y) ? x : y;
		return r;					//写代码要简单易读
	}
}
