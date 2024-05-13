package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class quiz3 {

//	map 함수의 인자는 function
//	인터페이스를 구현하는 방법은 3가지
//	함수형 인터페이스는 람다식 함수로 구현 가능
//	function 인터페이스를 람다식 함수로 구현
//	1. 추상메소드 2. 람다식함수
	
//	추상메소드의 기능은 해당 연산자의 기능과 같다
//	이 함수는 요소를 다른값으로 바꿔서 반환하는 함수
//	리턴타입 R 제네릭 타입. 내가 정하면 됨
//	R apply (T t) { //t는 주문 객체
//		return t.orderNo; //주문번호로 바꿔서 반환
//	}
	
//	추상메소드의 기능은 filter 함수의 기능과 같음
//	주문일자가 2022년도면 true를 반환
//	boolean test(T t) { // T는 주문 객체
//		if(t.year == 2022) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	
	public static void main(String[] args) {

		List<Shopping> list = new ArrayList<>();

		list.add(new Shopping(1001, 2022, 300));
		list.add(new Shopping(1002, 2022, 150));
		list.add(new Shopping(1003, 2022, 200));
		list.add(new Shopping(1004, 2023, 500));
		list.add(new Shopping(1005, 2023, 400));
		list.add(new Shopping(1006, 2023, 600));
		list.add(new Shopping(1007, 2023, 650));

		for (int i=0;i<list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}
		System.out.println(list.toArray());
		
//		모든 거래번호 한줄로 나열
		list.stream().map(s -> s.orderNo).forEach(s -> System.out.print(s + " "));
		System.out.println();
//		2022년도 거래 총금액과 건수 출력
//		총금액:650, 거래건수:3
		Stream<Shopping> stream1 = list.stream();

		int sum = stream1.filter(s -> s.year == 2022).mapToInt(s -> s.price).sum();
		System.out.print("총금액 : " + sum + " ");

		Stream<Shopping> stream2 = list.stream();
		long count = stream2.filter(s -> s.year == 2022).count();
		System.out.print("거래건수: " + count);
		System.out.println();
//		2023년도 거래 총금액과 건수 출력
//		총금액:2150, 거래건수:4

		Stream<Shopping> stream3 = list.stream();

		int sum1 = stream3.filter(s -> s.year == 2023).mapToInt(s -> s.price).sum();
		System.out.print("총금액 : " + sum1 + " ");

		Stream<Shopping> stream4 = list.stream();
		long count1 = stream4.filter(s -> s.year == 2023).count();
		System.out.print("거래건수: " + count1);
		
	}

}

class Shopping {
	int orderNo;
	int year;
	int price;

	public Shopping(int orderNo, int year, int price) {
		super();
		this.orderNo = orderNo;
		this.year = year;
		this.price = price;
	}

};