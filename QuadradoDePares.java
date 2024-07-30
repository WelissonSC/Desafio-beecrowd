package chalengers;

import java.util.Scanner;

public class QuadradoDePares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1, n = sc.nextInt();

		while (i <= n) {
			if (i % 2 == 0) {
				System.out.println(i + "^2" + " = " + (i * i));
			}
			i++;
			sc.close();
		}
	}
}
