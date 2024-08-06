package chalengers;

import java.util.Scanner;

public class SequenciaEsoma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(), n = sc.nextInt(), resul = 0;

		while (m >= n) {
			System.out.print(n + " ");
			resul = n + resul;
			n++;
		}

		System.out.println("Sum=" + resul + "\n");
	}
}