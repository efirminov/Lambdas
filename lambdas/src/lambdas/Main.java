/**
 * 
 */
package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Evandro
 *
 */
public class Main {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = Arrays.asList(new Pessoa("Evandro", 44),
				new Pessoa("Debora", 18),
				new Pessoa("Pedro", 24));
		
		pessoas.stream()
		.filter(p -> p.getIdade() > 18)
		.forEach(System.out::println);
		
		/*List<Integer> values = Arrays.asList(12,4,22,32,11,23,45,65,90);
		
		List<Integer> result = values.stream()
		.filter(v -> v > 20)
		.map(v -> v * 3)
		.collect(Collectors.toList());
		
		result.forEach(System.out::println);
		
		Optional<Integer> results = values.stream()
				.filter(v -> v > 20)
				.map(v -> v * 3)
				.findFirst();
		
		System.out.println(results);*/
		
		/*
		List<String> nomes = 
				Arrays.asList("Carlos","Evandro", "João", "Maria","Chico", "Carol");
		
		
		// Streams Programação funcional : Retorna uma lista
		
		List<String> result = nomes.stream()
				.filter(nome -> nome.startsWith("C"))
				.collect(Collectors.toList());
		
		//result.forEach(n -> System.out.println(n));
		
		// Streams Programação funcional
		
		/*String result = nomes.stream()
				.filter(nome -> nome.startsWith("C"))
				.collect(Collectors.joining(", "));
		
		System.out.println(result);*/
		
		//Method References
		
		//result.forEach(System.out::println);
		
		//Optional - NullPointException
		
		/*Optional<String> result2 = nomes.stream()
				.filter(n -> n.startsWith("K"))
				.findAny();
		
		if(!result2.isPresent()) {
			System.out.println("Nome não localizado");}*/
		
		/*try {
			String result2 = nomes.stream()
					.filter(n -> n.startsWith("K"))
					.findAny()
					.orElseThrow(AttributeNotFoundException::new);
		} catch (AttributeNotFoundException e) {
			e.printStackTrace();
		}*/
		
		
		}
}
