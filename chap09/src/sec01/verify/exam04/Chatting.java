package sec01.verify.exam04;

public class Chatting {
	
	private String nickName = null;
	
	void startChat(String chatId) {
		this.nickName = chatId;
	
		class Chat{
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
					
				}
			}
			
			void sendMessage(String message) {
				System.out.println(message);
			}
		}
		
		Chat chat = new Chat();
		chat.start();
	}
	
	public static void main(String[] args) {
		Chatting chatting = new Chatting();
		chatting.startChat("Nayul");
	}
}
