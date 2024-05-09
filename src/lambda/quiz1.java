package lambda;

public class quiz1 {

	public static void main(String[] args) {
	
//		구현 클래스 사용하여 max() 호출
		MyNumber number1 = new MyNumberImp1();
		
		System.out.println(number1.max(10, 20));
		
//		q. 익명 클래스를 사용하여 max() 호출
		MyNumber number2 = new MyNumber() {
			@Override
			public int max(int x, int y) {
				if (x > y) { 
					return x;
				} else {
					return y;
				}		
			}
		};
//		q. 람다식 함수를 사용하여 max() 호출
		MyNumber number3 = (x, y) -> x > y ? x : y;
		System.out.println(number3.max(10, 20));
	}

}

// 함수형 인터페이스
interface MyNumber {
//	더 큰 값을 구하는 메소드
	int max(int x, int y);
}

//구현 클래스
class MyNumberImp1 implements MyNumber {

	@Override
	public int max(int x, int y) {
//		최대값을 저장할 변수
		if (x > y) { // 
			return x;
		} else {
			return y;
		}		
	}

}