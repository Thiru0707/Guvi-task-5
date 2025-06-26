package Task5;
import java.util.stream.Stream;
public class UpperCaseStream {
	
	 public static void main(String[] args) {
	        Stream<String> names = Stream.of("abc", "d", "ef");

	       
	        Stream<String> upperCaseNames = names.map(String::toUpperCase);

	        upperCaseNames.forEach(System.out::println);
	 }

}
