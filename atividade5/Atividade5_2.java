package atividade5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class Atividade5_2 {

	public static void main(String[] args) {

		Set<Integer> valores = new HashSet<Integer>();

		Scanner leia = new Scanner(System.in);

		for (int qtd = 0; qtd < 10; qtd++) {
			System.out.println("Escreva um número inteiro (Atenção! Não repita os números):");
			valores.add(leia.nextInt());
		}

		leia.close();

		Iterator<Integer> iValores = valores.iterator();

		System.out.println("\n");

		while (iValores.hasNext()) {
			System.out.println(iValores.next());

		}
	}

}