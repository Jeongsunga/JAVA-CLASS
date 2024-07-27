package j09_클래스.생성자;

public class ConstructorEx1 {
	
	String name;
	int age;
	
	// 생성자 오버로딩 전부 하기
	
	// NoArgsConstructor
	public ConstructorEx1() {
		
	}
	
	// RequireArgsConstructor
	public ConstructorEx1(int age) {
		this.age = age;
	}
	
	// RequireArgsConstructor
	public ConstructorEx1(String name) {
		this.name = name;
	}
	
	// AllArgsConstructor
	public ConstructorEx1(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
