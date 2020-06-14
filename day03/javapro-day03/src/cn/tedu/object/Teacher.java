package cn.tedu.object;

import java.util.Date;		//日期类型，选择其他就会报错

//老师
public class Teacher {
	public Integer id;				//编号
	public String name;			//姓名
	
	//java.lang.* 是直接使用的
	//Date不是基础类包中jar，必须导包 import
	public Date birthday;			//出生年月
	public String company;		//公司
	
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", birthday=" + birthday + ", company=" + company + "]";
	}
}
