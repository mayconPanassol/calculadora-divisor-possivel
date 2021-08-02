package calculadoraDeDivisoresPossiveis;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o numero de entradas: ");
		int entrada = sc.nextInt();

		for (int i = 1; i <= entrada; i++) {

			if (entrada % i == 0) {
				System.out.println(i);
			}

		}

		sc.close();

	}

}
