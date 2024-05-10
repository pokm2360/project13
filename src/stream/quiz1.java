package stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class quiz1 {

	public static void main(String[] args) {
		
		String[] arr = {"aaa", "aaa", "b", "b", "ccccc"};

		Stream<String> strArr = Arrays.stream(arr);
		
//		문자열 목록 중 길이가 2보다 큰 요소의 개수
		Stream<String> stream1 = Arrays.stream(arr);
		long count = stream1
				.filter(s -> s.length() > 2)
				.count();
		System.out.println(count);
		
//		모든 문자열의 길이를 더한 합
		Stream<String> stream2 = Arrays.stream(arr);
		
		int sum = stream2
				.mapToInt(s -> s.length())
				.sum();
		System.out.println(sum);
				
//		가장 길이가 짧은 문자열의 길이
//		strArr.map(s -> s.length())
//				.sorted()
//				.limit(1)
//				.forEach(s -> System.out.print(s + " "));
//		System.out.println();
		
		OptionalInt min = Arrays.stream(arr)
				.mapToInt(s -> s.length())
				.min();
		System.out.println(min.getAsInt());
		
//		중복을 제거한 리스트
		Stream<String> stream5 = Arrays.stream(arr);
		List<String> list = stream5.distinct().collect(Collectors.toList());
		System.out.println(list);
				
							
	}

}
