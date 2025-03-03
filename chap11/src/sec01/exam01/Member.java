package sec01.exam01;

public class Member{	// 기존의 문자열 객체를 저장할 필드
	public String id;
	
	public Member(String id) {	// 생성자, 문자열을 받아  Member 객체를 생성한다.
		this.id = id;
	}
	
	@Override	// object 클래스의 equals()를 재정의하여 사용한다.
	public boolean equals(Object obj) {
		if(obj instanceof Member) { // 비교대상인 객체 obj가 Member형인지 먼저 확인해야한다.
			Member member = (Member) obj;
			// obj는 Object타입이므로 Member클래스의 id필드를 직접 사용할 수 없다.
			// 따라서 Member 타입으로 변환해야 Member클래스의 id필드에 접근할 수 있다.
			// 우리가 비교하려는 대상은 Member클래스의 id필드이기 때문이다.
			if(id.equals(member.id)) { 
				return true;
			}
		}
		return false;
	}
}

