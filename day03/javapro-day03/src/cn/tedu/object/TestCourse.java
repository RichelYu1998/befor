package cn.tedu.object;

public class TestCourse {
	public static void main(String[] args) {
		Course c1 = new Course();
		c1.no = 1;
		c1.name = "语文";
		
		System.out.println( c1 );
		
		Course c2 = new Course();
		c2.no = 2;
		c2.name = "数学";
		
		System.out.println( c2 );
	}
}
