<<<<<<< HEAD
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
=======
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
>>>>>>> e9616556387e1638b1f2d89f9ebbc22bd998d878
}