package cn.tedu.object;

import java.util.Date;

public class TestTeacher {
	public static void main(String[] args) {
		Teacher chen = new Teacher();
		chen.id = 666;
		chen.name = "tony";
		chen.birthday = new Date();		//当前日期
		chen.company = "达内";
		
		System.out.println( chen );
	}
}
