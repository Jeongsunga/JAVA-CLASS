package j11_상속.factory;

public class FactoryMain4 {

	public static void main(String[] args) {

		/*
		 * 크기가 6인 팩토리 공장을 만들자
		 * 
		 * 팩토리 공장에는
		 * 삼성1
		 * 엘지1
		 * 엘지2
		 * 엘지3
		 * 삼성2
		 * 삼성3
		 * 공장이 있다.
		 * 
		 * 모든 공장을 가동하고
		 * 각각의 공장에서 생산할 수 있는 물품을 생산하시오
		 * 모든 공장을 중지하시오
		 */
		
		Factory[] factories = new Factory[6];
		factories[0] = new SamsungFactory(1);
		factories[1] = new LGFactory(1);
		factories[2] = new LGFactory(2);
		factories[3] = new LGFactory(3);
		factories[4] = new SamsungFactory(2);
		factories[5] = new SamsungFactory(3);
		
		for(int i = 0; i < factories.length; i++) {
			factories[i].start();
		}
		
		for(int i = 0; i < factories.length; i++) {
			if(factories[i] instanceof SamsungFactory) {
				((SamsungFactory)factories[i]).produceSmartPhone();
			} else if(factories[i] instanceof LGFactory) {
				((LGFactory)factories[i]).produceSmartTV();
			} else {
				System.out.println("생산할 제품이 없습니다.");
			}
		}
		
		for(int i = 0; i < factories.length; i++) {
			factories[i].stop();
		}
	}

}
