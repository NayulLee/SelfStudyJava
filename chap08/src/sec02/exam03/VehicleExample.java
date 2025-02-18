package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		// vehicle.checkFare(); 업캐스팅 상태이기 때문에 구현클래스의 독자적인 메소드는 사용불가능
		
		Bus bus = (Bus)vehicle;
		
		bus.run();
		bus.checkFare();
	}

}
