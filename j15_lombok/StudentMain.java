package j15_lombok;

public class StudentMain {

	public static void main(String[] args) {

		Student student = new Student();
		Student student2 = new Student(20240001, "홍길동", 1, 18);
		
		System.out.println(student2);
		System.out.println(student2.getName());
		student2.setName("홍길서");
		System.out.println(student2.getName());
	}

}
