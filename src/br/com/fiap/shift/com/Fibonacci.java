package br.com.fiap.shift.com;

import java.util.Scanner;

public class Fibonacci {

	static int n;
	static long[] cache;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual posição da Sequência Fibonacci que você deseja consultar?");
		int n = scanner.nextInt();
		long[] fibos = new long[n];
		cache = new long[n];

		for (int i = 0; i < n; i++) {
			fibos[i] = fibo(i);
			System.out.print("[" + fibos[i] + "] ");
		}

		scanner.close();
	}

	private static long fibo(int n) {
		if (n < 2)
			return n;

		if (cache[n] != 0)
			return cache[n];

		long result = fibo(n - 1) + fibo(n - 2);
		cache[n] = result;
		return result;

	}
}

// CALCULO FIBONACCI "IMATURO"
// if (n < 2) {
//	return n;
// } else {
//	return fibo(n - 1) + fibo(n - 2);
// }