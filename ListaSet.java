package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListaSet {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		/*set.add("Maria");
		set.add("Luiz");
		set.add("Renato");
		set.add("Ca");

		set.removeIf(x -> x.length() >=3);
		
		for(String p: set) {
			System.out.println(p);
		}*/
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		//union
		Set<Integer> c = new TreeSet<Integer>(a);
		c.addAll(b);
		System.out.println(c);
		
		//intecertion
		Set<Integer> d = new TreeSet<Integer>(a);
		d.retainAll(b);
		System.out.println(d);
		
		//diferença
		Set<Integer> e = new TreeSet<Integer>(a);
		d.removeAll(b);
		System.out.println(e);
		
	}
}
