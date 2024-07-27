package j09_클래스;

public class Computer {
	
	/*
	 * 객체 = 기능(함수) + 데이터(변수)
	 */
	
	int year;
	String company;
	String cpu;
	int ram;
	String graphic;
	
	void showInfo() {
		System.out.println("제조년: " + year);
		System.out.println("제조사: " + company);
		System.out.println("CPU: " + cpu);
		System.out.println("RAM: " + ram);
		System.out.println("GraphicCard: " + graphic);
		System.out.println();
	}
	
	/*
	 * 기능
	 * : 메소드(함수)를 추가
	 * 
	 * addRam(16);
	 * 출력 -> 추가 되었습니다.
	 */
	
	void addRam(int gigaByte) {
		int overRam = 0;
		if(ram < 32) {
			ram += gigaByte;
			if(ram > 32) {
				overRam = ram - 32;
				System.out.println("램은 최대 32기가까지 장착 가능");
				System.out.println(overRam + "초과");
				ram = 32;
			}
		} else {
			System.out.println("더 이상 램을 추가할 수 없습니다.");
		}
	}
	
	/*
	 * removeRam(16)
	 * 
	 * 기존 램이 1보다 클 때
	 * 기존 램에서 매개변수로 받은 값 만큼 줄이기
	 * 줄인 값이 1보다 작으면 "램은 최소 1기가 바이트 이상 장착하여야 합니다."라고
	 * 출력하고 ram = 1로 고정
	 * 기존 램이 1일 때는 제거 X "램을 제거할 수 없습니다."라고 안내
	 */
	
	void removeRam(int gigaByte) {
		int overRam = 0;
		if(ram > 1) {
			ram -= gigaByte;
			if(ram < 1) {
				overRam = ram + 32;
				System.out.println("램은 최소 1기가 바이트 이상 장착하여야 합니다.");
				System.out.println(overRam + "초과");
				ram = 1;
			}
			System.out.println("줄이기 완료");
		}else {
			System.out.println("램을 더이상 줄일 수 없습니다.");
		}
	}
}
