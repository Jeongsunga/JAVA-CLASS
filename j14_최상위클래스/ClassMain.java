package j14_최상위클래스;

public class ClassMain {

	public static void main(String[] args) {

		Student student = new Student(20240001, "홍길동");
		
		Class c = student.getClass();
		Class c2 = Student.class;
		
		System.out.println("클래스명(모든 경로 포함): " + c.getName());
		System.out.println("클래스명(클래스명만): " + c.getSimpleName());
		
		java.lang.reflect.Method[] methods = c.getMethods();
		
		for(int i = 0; i < methods.length; i++) {
			System.out.println(methods[i].getName());
		}
	}

}
