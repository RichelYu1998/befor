package cn.tedu.object;

//创建学生类
public class Student {
	//成员变量
	public Integer id;			//编号
	public String name;		//姓名
	public Integer age;			//年龄，习惯使用Integer，不习惯使用Byte
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	//快速支持直接看对象的成员变量的每个值
	//增加toString方法即可，不用你写，自动生成
}
