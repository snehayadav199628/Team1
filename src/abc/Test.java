package abc;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
public static void main(String[] args) {
	List<List<String>> ex = Arrays.asList(Arrays.asList("Hello", "test"));
	Set<String> set=new HashSet<>();

	List<String> ss=Arrays.asList("abc","pqr");
	System.out.println(ss);
	Set<String> s=ss.stream().collect(Collectors.toSet());
	System.out.println(s);
	
	List<List<String>> aa=Arrays.asList(Arrays.asList("ABC","PQR"));
	aa.stream().distinct().
	
	
//	Set<String> uppercase=ss.stream().map(s1->s1.toUpperCase()).collect(Collectors.toSet());
//	uppercase.forEach( i -> System.out.println(i));
}
}
