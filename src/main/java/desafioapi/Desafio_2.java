package main.java.desafioapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Desafio_2 {
	
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		BinaryOperator<Integer> somar = (n1, n2) -> n1+n2;
		int resultado = numeros.stream()
			.filter(n -> n % 2 == 0)
			.reduce(0, somar);
		System.out.println("Soma dos números pares: " + resultado);
	}
}
