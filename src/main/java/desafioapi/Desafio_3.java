package main.java.desafioapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio_3 {
	
	public static void main(String[] args) {
		//List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		List<Integer> numeros = Arrays.asList(-1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		Predicate<Integer> positivo = n -> n > 0;
		boolean resultado = numeros.stream()
				.allMatch(positivo);
		if (resultado) {
			System.out.println("Todos os numeros são positivos");
		}else{System.out.println("Há números negativos!!");}
	}
}
