package desafio.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		Consumer<Object> print = System.out::println;
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		nums.stream()
		.map(Utility.strBinary)
		.map(Utility.strReverse)
		.map(Utility.converter)
		.map(Utility.intBinary)
		.forEach(print);
		

	}

}
