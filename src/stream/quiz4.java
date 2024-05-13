package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class quiz4 {

	public static void main(String[] args) {
		
		List<Customer> list = new ArrayList<>();
		
		list.add(new Customer("둘리", 40, 100));
		list.add(new Customer("또치", 13, 50));
		list.add(new Customer("도우너", 25, 70));
		
//		고객 명단
		list.stream()
			.map(s -> s.name)
			.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
//		총 비용
		Stream<Customer> stream = list.stream();
		int sum = stream
				.map(s -> s.cost)
				.mapToInt(s -> s)
				.sum();
		System.out.println("총 비용 : " + sum);
		
//		20세 이상 고객
		list.stream()
			.filter(s -> s.age >= 20)
			.sorted((o1, o2) -> { // 기준점을 만들어줘야함
			if(o1.age < o2.age) { 
				return 1;
			} else {
				return -1;
				}
			})
			.forEach(s -> System.out.println(s.name + ", "  + s.age));
			
//		순정렬
//		int compare (T o1, T o2) {
//			if(o1.age < o2.age) {
//				return 1;
//			} else {
//				return -1;
//			}
//		}
//		list.stream()
//			.filter(s -> s.age >= 20)
//			.map(s -> s.name)
//			.sorted()
//			.forEach(s -> System.out.print(s + " "));
	}

}

class Customer {
	String name;
	int age;
	int cost;
	
	public Customer(String name, int age, int cost) {
		super();
		this.name = name;
		this.age = age;
		this.cost = cost;
	}
	
	
}