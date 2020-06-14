package cn.tedu.pojo;

public class TestIf {
	public static void main(String[] args) {
		//多分支，分支条件互斥，不可能交叉，不可能重复
		//需求：一组分数，判断等级， 
		//小于60 不及格，60~70及格，70~80一般，80~90良好，90~100优秀
		
		int score = 100;
//		if( score>=60) {
//			System.out.println("及格");
//		}else {
//			System.out.println("不及格");
//		}
		
		//一个条件成立，其他的条件就不判断了
		if( score>=90 ) {
			System.out.println("优秀");
		}else if( score>=80) {
			System.out.println("良好");
		}else if( score>=70) {
			System.out.println("一般");
		}else if( score>=60) {
			System.out.println("及格");
		}else {
			System.out.println("不及格");
		}
		
	}
}
