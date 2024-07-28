package j11_상속.factory;

public class FactoryMain {

	public static void main(String[] args) {

		/*
		 * 크기가 3인 삼성배열을 만들고
		 * 1, 2, 3 공장을 넣으시오
		 * 
		 * 크기가 3인 엘지배열을 만들고
		 * 1, 2, 3 공장을 넣으시오
		 */
		
		SamsungFactory[] samsungFactories = new SamsungFactory[3];
		LGFactory[] lgFactories = new LGFactory[3];
		
		for(int i = 0; i < samsungFactories.length; i++) {
			samsungFactories[i] = new SamsungFactory(i + 1);
		}
		
		for(int i = 0; i < lgFactories.length; i++) {
			lgFactories[i] = new LGFactory(i + 1);
		}
		
		System.out.println("삼성공장 가동");
		for(int i = 0; i < samsungFactories.length; i++) {
			samsungFactories[i].start();
		}
		
		System.out.println("삼성공장 중지");
		for(int i = 0; i < samsungFactories.length; i++) {
			samsungFactories[i].stop();
		}
		
		System.out.println("엘지공장 가동");
		for(int i = 0; i < lgFactories.length; i++) {
			lgFactories[i].start();
		}
		
		System.out.println("엘지공장 중지");
		for(int i = 0; i < lgFactories.length; i++) {
			lgFactories[i].stop();
		}
	}

}
