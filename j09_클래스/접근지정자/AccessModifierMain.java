package j09_클래스.접근지정자;

import j09_클래스.접근지정자.a.TestA_2;

public class AccessModifierMain {

	public static void main(String[] args) {

		TestA_2 testA_2 = new TestA_2();
		testA_2.testA2();
		// 접근지정자가 명시되어 있지 않으면 default다.
	}

}
