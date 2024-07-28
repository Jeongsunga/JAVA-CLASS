package j11_상속.factory;

public class FactoryMain2 {

	public static void main(String[] args) {
		
		// 업캐스팅
		Factory factory = new SamsungFactory(1);
		
		/*
		 * 크기가 4인 팩토리 배열 만들고
		 * 삼성1, 엘지1, 삼성2, 엘지2 공장을 넣으시오
		 */
		
		Factory[] factories = new Factory[4];
		factories[0] = new SamsungFactory(1);
		factories[1] = new LGFactory(1);
		factories[2] = new SamsungFactory(2);
		factories[3] = new LGFactory(2);
		
		for(int i = 0; i < factories.length; i++) {
			factories[i].start();
		}
		
		for(int i = 0; i < factories.length; i++) {
			factories[i].stop();
		}
	}

}
