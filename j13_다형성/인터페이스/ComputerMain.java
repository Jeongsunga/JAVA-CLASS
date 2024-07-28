package j13_다형성.인터페이스;

public class ComputerMain {

	public static void main(String[] args) {

		Moniter monitor = new Moniter();
		Computer computer = new Computer(monitor);
		
		computer.powerOn();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		computer.powerOff();
		
		/*
		 * Mouse 만들고 마우스를 연결하시오
		 */
		Mouse mouse = new Mouse();
		Computer computer2 = new Computer(mouse);
		
		computer2.powerOn();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		computer2.powerOff();
	}

}
