package cn.tedu.base;

//二维数组
public class TestArray2 {
	public static void main(String[] args) {
		//二维数组声明，n一维数组的长度，m二维数组的长度
		int[][] arr2 = new int[3][2];	//3行2列
		
		//初始化值
		arr2[0][0] = 10;		//给第一个元素设置10？
		arr2[0][1] = 20;		//1行2列
		arr2[2][1] = 30;
		
		//二维数组访问
		System.out.println( arr2 );
		System.out.println( arr2[2][1] );
		
		//利用数组长度，获取最后一个元素值
		System.out.println("行数：" + arr2.length );
		System.out.println("列数：" + arr2[0].length );
		System.out.println("最后一个元素：" + arr2[ arr2.length-1][ arr2[0].length -1] );
		
		//错误：.ArrayIndex（数组的下标）OutOfBounds（超过长度值）Exception
		System.out.println( arr2[2][10] );
	}
}
