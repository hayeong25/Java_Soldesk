package operation;

// 산술 연산자 : +, -, *, /, %

public class ArithmeticOperationEx1 {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		int result = v1 + v2;
		System.out.println(v1 + " + " + v2 + " = " + result);
		
		result = v1 - v2;
		System.out.println(v1 + " - " + v2 + " = " + result);
		
		result = v1 * v2;
		System.out.println(v1 + " * " + v2 + " = " + result);
		
		result = v1 / v2; // 몫
		System.out.println(v1 + " / " + v2 + " = " + result);
		
		result = v1 % v2; // 나머지
		System.out.println(v1 + " % " + v2 + " = " + result);
		
		double res = (double)v1 / v2;
		System.out.println(v1 + " / " + v2 + " = " + res);
	}
}