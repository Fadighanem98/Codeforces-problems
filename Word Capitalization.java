import java.util.Scanner;
	
	public class Test {
		public static void main (String []args) {
			Scanner input = new Scanner(System.in); 
			String wort = input.next();
			String ersteBuch = wort.substring(0,1);
			ersteBuch = ersteBuch.toUpperCase();
			String rest = wort.substring(1, wort.length());
			String ans = ersteBuch.concat(rest);
			System.out.println(ans);
			
		}
	}
	
