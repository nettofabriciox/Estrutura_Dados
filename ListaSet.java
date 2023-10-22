package sets;

import java.util.HashSet;
import java.util.Set;

public class ListaSet {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("Maria");
		set.add("Luiz");
		set.add("Renato");
		set.add("Ca");

		set.removeIf(x -> x.length() >=3);
		
		for(String p: set) {
			System.out.println(p);
		}
	}
}
