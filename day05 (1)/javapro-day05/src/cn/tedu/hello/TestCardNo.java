package cn.tedu.hello;

//案例：身份证号处理
public class TestCardNo {
	/*
	 * 需求：
	 * 公民身份号码是特征组合码，由十七位数字本体码和一位校验码组成，共计18位。
	 * 排列顺序从左至右依次为：
	 * 六位数字地址码，
	 * 八位数字出生日期码，
	 * 三位数字顺序码，最后一位识别男女，如果奇数代表男，如果偶数代表女
	 * 和一位校验码。
	 */
	
	public static void main(String[] args) {
		String cardNo = "610113198006052193";
		//1、给的身份证号是否正确，长度为18位
		if( cardNo.length() == 18) {
			//2、获取：地址码（前6位）
			String addressNo = cardNo.substring(0, 6);
			System.out.println( "地址码："+addressNo );
			
			//3、获取：出生年月
			String birthday = cardNo.substring(6, 14);
			System.out.println("出生年月：" + birthday);
			
			//4、获取：性别（奇数男，偶数女），倒数第二位
			String sex = cardNo.substring( cardNo.length()-2, cardNo.length()-1);
			int n = Integer.valueOf(sex);		//把字符串转换数字
			if(n % 2 == 0) {		//通过取余运算，判断余数就可以知道是偶数还是奇数
				System.out.println("性别：女");
			}else {
				System.out.println("性别：男");
			}
		}else {
			System.out.println("输入的身份证号码错误！");
		}
		
	}
	
}
