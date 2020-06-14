package cn.tedu.test;

public class TestFor {
	public static void main(String[] args) {

		//for可以嵌套，不能交叉
		for(int j=0; j<5; j++) {			//外层循环
			System.out.println("行数："+j);	//换行
			for(int i=0; i<10; i++) {		//内层循环
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
