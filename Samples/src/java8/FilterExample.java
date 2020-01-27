/**
 * @author Chanaiah
 *
 * 
 */
package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author Chanaiah
 *
 */
public class FilterExample {
public static void main(String[] args) {
	List<String> lines = Arrays.asList("spring", "node", "mkyong");
	lines= lines.stream().filter(tmp->"mkyong".equals(tmp)).collect(Collectors.toList());
	lines.forEach(System.out::println);
	List<Person> persons = Arrays.asList(
            new Person("mkyong", 30),
            new Person("jack", 20),
            new Person("lawrence", 40)
    );
	
	Person p1=persons.stream().filter(x->"lawrence".equals(x.getName())).findAny().orElse(null);
	System.out.println(p1);
	String name=persons.stream().filter(x->"node".equals(x.getName())).map(Person::getName).findAny().orElse(null);
	System.out.println(name);
	List<String> persons2=persons.stream().map(Person::getName).collect(Collectors.toList());

	List<Person> persons4=persons.stream().map(x->{
	    	 Person p3=new Person();
	    	 if("node".equals(x.getName())){
	    		 p3.setAge(90);
	    	 }
	    	 return p3;
	     }).collect(Collectors.toList());
	System.out.println(persons4);
}
}
