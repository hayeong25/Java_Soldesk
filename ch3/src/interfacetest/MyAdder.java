package interfacetest;

// interface를 구현(implements)하는 클래스

public class MyAdder implements Adder {

	@Override
	public void print() {
		System.out.println("출력");
	}

	@Override
	public int add(int x, int y) {
		return 0;
	}
	
}