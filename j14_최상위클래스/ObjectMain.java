package j14_최상위클래스;

import j09_클래스.Computer;

public class ObjectMain {

	public static void main(String[] args) {

		Object object = new Object();
		
		Computer computer = new Computer();
		computer.equals(object); // object 클래스 사용 가능
	}

}
