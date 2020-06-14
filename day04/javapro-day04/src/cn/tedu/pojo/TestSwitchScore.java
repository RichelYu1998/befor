package cn.tedu.pojo;

public class TestSwitchScore {
	public static void main(String[] args) {
		//switch()里面的参数值不能是一个范围，是一个具体值（int,String)
		//switch语句非常死板，开发中用if-else if替代
		
		//需求：一组分数，判断等级， 
		//小于60 不及格，60~70及格，70~80一般，80~90良好，90~100优秀
		int score = 34;
		
		//System.out.println( score/10 );		//技巧：利用整除方式
		switch( score/10 ) {
		case 10 :
			System.out.println("优秀");
			break;
		case 9 :
			System.out.println("优秀");
			break;
		case 8 :
			System.out.println("良好");
			break;
		case 7 :
			System.out.println("一般");
			break;
		case 6 :
			System.out.println("及格");
			break;
		default :
			System.out.println("不及格");
		}
	}
}
