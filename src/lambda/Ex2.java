package lambda;

public class Ex2 {

	public static void main(String[] args) {
		
//		부모타입 변수 선언 = 람다식 함수 (추상메소드의 구현메소드를 람다식으로 표현)
		Calc calc = (num1, num2) -> num1 + num2;
		
		System.out.println(calc.add(4, 4));
		
//		람다식의 동작 원리
//		컴파일러가 람다식을 익명클래스로 변환하고, 클래스의 인스턴스를 생성함
		Calc calc2 = new Calc() {
			@Override
			public int add(int x, int y) {
				return x + y;
			}
		};
	}
}
//함수형 인터페이스
//함수형 어노테이션을 나타내는 어노테이션
//추상메소드가 한개 이상 추가되는 것을 막음
@FunctionalInterface
interface Calc {
	int add(int num1, int num2);
}