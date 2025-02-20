package sec02.exam03;

import sec02.exam03.Button.OnClickListener;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	// 필드 초기값으로 대입
	OnClickListener listener = new OnClickListener() { // 익명 객체 생성
		
		@Override
		public void onClick() {
			// TODO Auto-generated method stub
			System.out.println("전화를 겁니다.");
		}
	};
	
	Window(){
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("메세지를 보냅니다.");
			}
		});
	}
}
