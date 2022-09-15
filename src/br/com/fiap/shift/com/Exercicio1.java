package br.com.fiap.shift.com;

import java.util.Random;

public class Exercicio1 {
	public static void main(String[] args) {
		Random random = new Random();
		int vetorA[] = new int[5];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = random.nextInt(50);
			System.out.println("VETOR A " + vetorA[i]);

		}

		vetorB = vetorA.clone();

		for (int i = vetorB.length - 1; i >= 0; i--) {
			System.out.println("VETOR B " + vetorB[i]);
		}
	}
}
