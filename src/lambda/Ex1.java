package lambda;

public class Ex1 {

	public static void main(String[] args) {
		
//		클래스로 인터페이스 구현하기
		StringConcat concat1 = new StringConcatImp1();
		concat1.makeString("Hello", "World");
		
//		람다식으로 인터페이스 구현하기
		StringConcat concat2 = (s1, s2) -> System.out.println(s1 + "," + s2);
		concat2.makeString("Hello", "World");
	}

}

//함수형 인터페이스
interface StringConcat {
	
//	두 문자열을 연결하는 추상 메소드
	public void makeString(String s1, String s2);
}

//구현클래스 만들기
class StringConcatImp1 implements StringConcat {

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + "," + s2);
		
	}
	
}