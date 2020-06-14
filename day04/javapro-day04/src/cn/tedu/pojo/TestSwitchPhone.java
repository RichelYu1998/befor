package cn.tedu.pojo;

//多分支
public class TestSwitchPhone {
	public static void main(String[] args) {
		//需求：电话号码
		int phone = 120;
		
		if( phone==110) {
			System.out.println("我是警察");
		}else if(phone == 120) {
			System.out.println("我是医生");
		}else if(phone == 119) {
			System.out.println("我是火警");
		}else {
			System.out.println("电话号码非法");
		}
		
		System.out.println();
		
		switch( phone ) {
		case 110 :
			System.out.println("我是警察");
			break;		//跳出switch语句，结束
		case 120 :
			System.out.println("我是医生");
			break;
		case 119 :
			System.out.println("我是火警");
			break;
		default :
			System.out.println("电话号码非法");
			break;		//加不加都可以，习惯写上
		}
		
	}
}
