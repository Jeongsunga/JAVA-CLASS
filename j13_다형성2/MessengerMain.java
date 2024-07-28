package j13_다형성2;

public class MessengerMain {

	public static void main(String[] args) {
		
		Facebook facebook = new Facebook();
		KakaoTalk kakaoTalk = new KakaoTalk();
		Instagram instagram = new Instagram();
		
		Messenger messenger = facebook;
		MessengerMiddleWare messengerMiddleWare = new MessengerMiddleWare(messenger);
		
		messengerMiddleWare.sendMessage();
		messengerMiddleWare.receiveMessage();
		messengerMiddleWare.runAdds();
	}

}
