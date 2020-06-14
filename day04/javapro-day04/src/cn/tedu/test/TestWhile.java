package cn.tedu.test;

public class TestWhile {
	public static void main(String[] args) {
		//while循环
		int i = 0;		//初始化语句
		while( i<0 ) {		//如果条件true，执行while循环体中的代码，如果条件false，结束while循环
			System.out.println(i);
			i++;			//改变判断条件
		}
		
		//do循环
		int j = 0;
		do {
			System.out.println(j);
			j++;
		}while( j<0 );
	}
}
