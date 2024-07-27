package j09_클래스.접근지정자.student;

public class StudentMain {

	public static void main(String[] args) {

		/*
		 * student 객체를 만들고
		 * 객체의 name에 홍길동을 넣으시오.
		 */
		
		Student student = new Student("홍길동");
		System.out.println(student.getName());
		
		student.setName("정승아");
		System.out.println(student.getName());
	}

}
