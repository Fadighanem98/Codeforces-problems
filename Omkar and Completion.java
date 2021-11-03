import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();
		while (t-- > 0) {
			int n = input.nextInt();
			int m[] = new int[n];

			for (int i = 0; i < m.length; i++) {
				m[i] = 5;
				System.out.print(m[i] + " ");

			}
			System.out.println();

		}

	}
}
