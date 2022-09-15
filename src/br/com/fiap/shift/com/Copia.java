package br.com.fiap.shift.com;

import java.util.Random;

public class Copia {
	public static void main(String[] args) {

		Random random = new Random();
		int vetorA[] = new int[5];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = random.nextInt(50);
			System.out.print("VETOR A " + vetorA[i]);

		}

		vetorB = vetorA.clone();
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("VETOR B " + vetorB[i]);
		}

	}
}
