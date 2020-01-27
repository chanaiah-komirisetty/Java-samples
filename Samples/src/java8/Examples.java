/**
 * @author Chanaiah
 *
 * 
 */
package java8;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Chanaiah
 *
 *         modified by @author Chanaiah last on 2019-11-08 11:04:23.579
 */
public class Examples {
	public static void main(String[] args) {
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		// 2. Map keys
		Consumer<String> actionOnKeys = System.out::println;

		items.keySet().forEach(actionOnKeys);

		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			entry.getKey();
		}
		items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

		items.forEach((k, v) -> {
			if ("A".equals(k)) {
				System.out.println(k);
			}
		});

		List<String> itemsList = new ArrayList<>();
		itemsList.add("A");
		itemsList.add("B");
		itemsList.add("C");
		itemsList.add("D");
		itemsList.add("E");
		itemsList.forEach(item -> System.out.println(item));
		itemsList.forEach(System.out::println);
		itemsList.forEach(item -> {
			if ("D".equals(item)) {
				System.out.println(item);
			}
		});
		itemsList.stream().filter(s -> s.equals("A")).forEach(System.out::println);

		Stream<Integer> sm = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7 });
		sm.forEach(System.out::println);
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		Stream<Integer> lst=list.stream();
		List<Integer> lst2=lst.filter(p->p%2==0).collect(Collectors.toList());
		System.out.println(lst2);
		Stream<Date> gn=Stream.generate(()->{return new Date();});
		//System.out.println(gn);
	//	gn.forEach(System.out::print);
		//gn.forEach(p -> System.out.println(p));
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		memberNames.stream().filter(s->s.startsWith("A")).forEach(System.out::println);
		memberNames.stream().map(String::toUpperCase).forEach(System.out::println);
		memberNames.stream().sorted().forEach(System.out::println);
		long count=memberNames.stream().filter(s->s.startsWith("A")).count();
		System.out.println(count);
		String ss=memberNames.stream().filter(s->s.startsWith("A")).findAny().get();
		System.out.println(ss);
		List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);
          
        List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);
        List<Integer> list4=listOfLists.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(list4);
        List<Integer> ints = IntStream.of(1,2,3,4,5).boxed().collect(Collectors.toList());
        SecureRandom secureRandomGenerator;
		try {
			secureRandomGenerator = SecureRandom.getInstance("SHA1PRNG", "SUN");
			// Get 128 random bytes
	        byte[] randomBytes = new byte[128];
	        secureRandomGenerator.nextBytes(randomBytes);
	         
	        //Get random integer
	        int r = secureRandomGenerator.nextInt();
	         
	        //Get random integer in range
	        long randInRange = secureRandomGenerator.nextLong();
	        System.out.println(randInRange);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchProviderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
	}
}
