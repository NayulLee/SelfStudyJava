package chapter04.exam04;

public class Rectangle {
	// 사각형을 구성하는 점과 크기 정보
	int x;
	int y;
	int width;
	int height;
	
	Rectangle(int x, int y, int w, int h){
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
	}
	
	public int squre() {	// 사각형 넓이 리턴
		return width * height;
	}
	
	public void show() {
		System.out.println("(" + x + ", " + y + ")에서 크기가 "
				+ width +"x" + height+ "인 사각형");
	}
	boolean contains(Rectangle r) {
		// r의 시작좌표 (r.x, r.y)는 각각 x, x+width, y, y+height 사이에 존재해야한다.
		if((r.x > this.x && r.x < this.x + this.width) &&
				(r.y > this.y && r.y < this.y + this.height)){
			// r의 끝좌표도 사각형 안에 존재해야한다.
			if((r.x + r.width > this.x && r.x + r.width < this.x + this.width) &&
					(r.y + r.height > this.y && r.y + r.height < this.y + this.height)){
				return true;
			}
			return false;	// 내부 if문에 return문이 실행되면 해당 메소드나 함수의 실행이 즉시 종료
		}
		else return false;
	}
}
