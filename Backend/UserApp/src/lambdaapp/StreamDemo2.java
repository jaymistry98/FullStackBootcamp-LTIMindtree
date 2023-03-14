package lambdaapp;

import java.util.Arrays;
import java.util.List;

public class StreamDemo2 {

	static List<String> names = Arrays.asList("amit", "shekar", "ana", "sam", "yani");
	
	public static void main(String[] args) {
		
		names.stream().filter((s) -> s.startsWith("a")).map(String :: toUpperCase).forEach(System.out::println);
		
	}

}
