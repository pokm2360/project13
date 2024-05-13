package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class quiz2 {
	
//	filter 함수의 인자는 Predicate
//	Predicate 인터페이스를 람다식 함수로 구현하기
//	1.추상메소드 구현한다 2. 람다식함수로 바꾼다
//	boolean test(S s) {
//		return s.endsWith(".txt");
//	};
	
	public static void main(String[] args) {
		
		String[] arr = {"file1.txt", "file2.pdf", "file3.txt", "file4.img", "file5.txt", "file6.img"};
		
		Stream<String> strArr = Arrays.stream(arr);
		
//		파일 목록 중 txt파일만 찾으세요
//		결과: file1.txt file3.txt file5.txt
//		endsWith - 해당 문자로 끝나면 true 아니면 false를 반환
		Stream<String> stream1 = Arrays.stream(arr);
		
		stream1.filter(s -> s.endsWith(".txt")).forEach(s -> System.out.print(s + " "));
		System.out.println();
		
//		확장자별로 파일 개수를 구하세요
		Stream<String> stream2 = Arrays.stream(arr);
		
		long count = stream2
					.filter(s -> s.endsWith(".txt"))
					.count();
					System.out.println("txt파일의 개수: " + count);
					
		Stream<String> stream3 = Arrays.stream(arr);
					
		long count1 = stream3
					.filter(s -> s.endsWith(".pdf"))
					.count();
					System.out.println("txt파일의 개수: " + count1);
					
		Stream<String> stream4 = Arrays.stream(arr);
					
		long count2 = stream4
					.filter(s -> s.endsWith(".img"))
					.count();
					System.out.println("img파일의 개수: " + count2);
					
		
		
//		파일의 확장자만 추출하여 출력
//		(.)은 (\\으로 표현)		
		Stream<String> stream5 = Arrays.stream(arr);
					
//		stream5.map(s -> s.substring(6,9))
		stream5.map(s -> {String[] newArr = s.split("\\.");
							return newArr[1];
							})
				.distinct()
				.forEach(s -> System.out.print(s + " "));
		
	
	}

}
