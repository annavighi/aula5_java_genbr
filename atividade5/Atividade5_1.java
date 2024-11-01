package atividade5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atividade5_1 {

	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);
		
		for (int qtd = 0; qtd < 5; qtd++) {
		System.out.println("Escreva uma cor: ");
		cores.add(leia.nextLine());
		}
		
		System.out.println("Cores escolhidas: " + cores);
		
		Collections.sort(cores);
		System.out.println("Ordem alfabética: " + cores);

		leia.close();
	}

}
