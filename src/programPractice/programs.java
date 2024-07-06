package programPractice;

public class programs {

public void m1(int a,int b) {
		System.out.println(a+b);
		
	}
public void m1(String a,int b) {
		System.out.println(a+b);
		m1(24,234);
	}
public void m1(float b) {
	System.out.println(b);
	m1("shaik karimulla",100);
	
}
public static void t1(programs p1) {
	p1.m1(45.5f);
	
}

	public static void main(String[] args) {

		programs obj=new programs();
		programs.t1(obj);
		
		
	}

}
