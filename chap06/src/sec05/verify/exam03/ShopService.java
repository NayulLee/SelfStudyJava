package sec05.verify.exam03;

public class ShopService {
	private static ShopService instance;
	
	private ShopService () {
		System.out.println("객체가 생성되었습니다.");
		
	}
	
	public static ShopService getInstance() {
		if(instance == null) {
			instance = new ShopService();
		}
		return instance;
	}
}

