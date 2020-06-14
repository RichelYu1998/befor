package cn.tedu.test;

//经典死循环结构
public class TestDeadLoop {
	public static void main(String[] args) {
		
		int i = 0;
		while( true ) {
			i++;
			if( i==3 ) {
				continue;	//进入下一次循环
			}
			if( i==10 ) {
				break;		//跳出while循环
			}
			System.out.println(i);
		}
		
	}
}
