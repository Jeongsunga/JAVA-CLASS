package j10_배열;

import j09_클래스.접근지정자.student.Student;

public class Array3 {

	public static void main(String[] args) {

		/*
		 * names 배열
		 * studentYears 배열
		 * scores 배열
		 * 
		 * 홍길동 3 75.9
		 * 홍길서 2 80.5
		 * 홍길남 1 85.3
		 * 홍길중 1 78.7
		 * 홍길북 3 88.5
		 * 
		 * 반복문을 통해
		 * 홍길동 학생은 3학년이고 75.9점 획득하였습니다.
		 * 홍길서 학생은 2학년이고 80.5점 획득하였습니다.
		 * ...
		 */
		
		String[] names = {"홍길동", "홍길서", "홍길남", "홍길중", "홍길북"};
		int[] studentYears = {3, 2, 1, 1, 3};
		double[] scores = {75.9, 80.5, 85.3, 78.7, 88.5};
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "학생은 " + studentYears[i] + "학년이고 " + scores[i] + "점 획득하였습니다.");
		}
		
		System.out.println();
		
		/*
		 * 1) 홍길동, 3, 15, 부산, 010-1234-5678
		 * 2) 홍길서, 2, 14, 서울, 010-1111-2222
		 * 의 정보를 가진 객체를
		 * 
		 * students의 배열의 1)학생을 0번째 방에 넣으시오
		 * students의 배열의 2)학생을 3번째 방에 넣으시오
		 * students 배열의 크기는 5
		 * 
		 * 반복문을 돌려 학생들의 정보를 출력하시오
		 */
		
		Student[] students = new Student[5];
		
		Student student = new Student("홍길동", 3, 15, "부산", "010-1234-5678");
		Student student2 = new Student("홍길서", 2, 14, "서울", "010-1111-2222");
		
		students[0] = student;
		students[3] = student2;
		
		for(int i = 0; i < students.length; i++) {
			if(students[i] == null) continue;
			System.out.println(students[i].getName());
			System.out.println(students[i].getStudentYear());
			System.out.println(students[i].getAge());
			System.out.println(students[i].getAddress());
			System.out.println(students[i].getPhone());
			System.out.println();
		}
	}

}
