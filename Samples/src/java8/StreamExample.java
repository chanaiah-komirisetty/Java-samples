/**
 * @author Chanaiah
 *
 * 
 */
package java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Chanaiah
 *
 */
public class StreamExample {
	public static void main(String[] args) {
		List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
		Map<String, Long> result = items.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result);
		Map<String, Long> finalMap = new LinkedHashMap<>();
		result.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
				.forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

		System.out.println(finalMap);
		Stream<String> ex = Stream.of("chandu", "vasantha", null);
		List<String> ls = ex.filter(x -> x != null).collect(Collectors.toList());
		ls.forEach(System.out::println);
		String[] array = { "a", "b", "c", "d", "e" };

		Stream<String> sm = Arrays.stream(array);
		sm.forEach(x -> System.out.println(x));
		
		Stream<Integer> intlst=Stream.of(2,5,1,8,9);
		
		Stream<Integer> dd=intlst.filter(x->x>5);
	Integer sum=dd.filter(x->x>5).mapToInt(x->x).sum();
System.out.println(sum);
	}
}
