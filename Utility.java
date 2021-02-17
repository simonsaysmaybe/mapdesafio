package desafio.map;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Utility {
	public static final Function<Integer, String> strBinary = 
			(num) -> Integer.toBinaryString(num);
	
	public static final Function<String, StringBuilder> strReverse = 
			(str) -> new StringBuilder(str).reverse();
			
	public static final Function<StringBuilder, String> converter = 
			(strB) -> strB.toString();
	
	public static final Function<String, Integer> intBinary = 
			(intB) -> Integer.parseInt(intB, 2);
}
