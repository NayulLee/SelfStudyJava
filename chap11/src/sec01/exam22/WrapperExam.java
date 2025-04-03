package sec01.exam22;

public class WrapperExam {
	int i = 5; // int i 는 그냥 기본형 int형 변수 
	Integer i2 = new Integer(5); // i2는 int를 객체로 바꿔주는 wrapper클래스 중 하나인 Integer클래스
	
	Integer i3 = 5; // 기본 데이터타입 5를 넣었는데 문제없이 작동
					// 숫자 5는 원래 기본형이지만 자동으로 Integer로 형변환 된 것 "AutoBoxing"
					// java는 = 5;를 new Integer(5);로 자동으로 변환해서 컴파일
	
	int i4 = i3.intValue(); // 객체로 감싸져 있는 것을 벗겨내고 int타입으로 사용할 수 있다
	int i5 = i3; // java5부터는 intValue()메서드를 사용하지 않아도 자동 변환 "AutoUnboxing"
}
