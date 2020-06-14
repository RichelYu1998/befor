package cn.tedu.hello;

//把数字替换*
public class TestNumber2Star {
	public static void main(String[] args) {
		String str = "用户名：tony，密码：123456";
		//数字0到9，那判断如果数组0到9，就替换*
		//获取每一位内容，如果是数字就替换，如果不是就跳过
		for(int i =0; i< str.length(); i++) {
			//字符有特点，可以按整数（ascii码）值进行判断
			//0字符ascii=48,9字符ascii=57
			char c = str.charAt(i);	
			if(c>=48 && c<=57) {	//&& 与，两个条件同时成立结果true
				c = '*';
			}
			
			System.out.print( c );
		}
	}
}
