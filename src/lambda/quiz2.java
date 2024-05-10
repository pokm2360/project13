package lambda;

public class quiz2 {

	public static void main(String[] args) {
		
//		구현 클래스
		Hello hello = new helloImp1();
		hello.helloPrint();
		
//		익명 클래스
		Hello hello2 = new Hello() {
			
			@Override
			public void helloPrint() {
				System.out.println("Hello");
			}
		};
			hello2.helloPrint();
			
//		람다식
			Hello hello3 = () -> System.out.println("Hello");
			hello3.helloPrint();
	}

}

interface Hello {
//	안녕하세요를 출력하는 메소드
	void helloPrint();
	
}

//q.Hello의 구현 클래스 만들기
	class helloImp1 implements Hello {

	@Override
	public void helloPrint() {
		System.out.println("Hello");
		
	}
		
	}