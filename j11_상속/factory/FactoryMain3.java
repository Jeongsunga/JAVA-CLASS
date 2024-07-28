package j11_상속.factory;

public class FactoryMain3 {

	public static void main(String[] args) {

		SamsungFactory samsungFactory = new SamsungFactory(1);
		samsungFactory.produceSmartPhone();
		
		Factory sfactory = new SamsungFactory(1);
		System.out.println(sfactory);	// 주소 SamsungFactory, 자료형 Factory(produceSmartPhone 불가능)
		
		((SamsungFactory)sfactory).produceSmartPhone();
		
		// Factory factory = new Factory(1);
		// ((SamsungFactory)factory).produceSmartPhone();  주소 Factory(produceSmartPhone 불가능)
		
		System.out.println(sfactory instanceof SamsungFactory);
		System.out.println(sfactory instanceof LGFactory);
	}

}
