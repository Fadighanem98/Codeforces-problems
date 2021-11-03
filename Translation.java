import java.util.Scanner;

public class corona {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		String t = input.nextLine();
		String sr = "";
		int a = 0;
		int b = 0;
		for (int i = s.length()-1; i >= 0; i--) {
			sr = sr + s.charAt(i);
		}
		if(sr.equals(t))
			System.out.println("YES");
		else
			System.out.println("NO");

	}

}
