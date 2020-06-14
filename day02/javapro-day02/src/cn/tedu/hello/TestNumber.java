package cn.tedu.hello;

public class TestNumber {
	public static void main(String[] args) {
		//需求：判断奇数还是偶数？
		//分析：数字n对2进行取余，如果余数0，偶数；如果余数1，奇数。
		int n = 9;
		int r = n % 2;		//n对2取余
		System.out.println(n+"%2 结果是："+r);
		
		//分支判断语句
		if(r == 1) {		//r等不等于1，是true，否false
			System.out.println("奇数："+n);		//true就执行这句话
		}else {
			System.out.println("偶数："+n);		//false就执行这句话
		}
	}
}
