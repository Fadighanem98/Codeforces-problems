	import java.util.Scanner;
	
	public class Test {
		public static void main (String []args) {
			Scanner input = new Scanner(System.in); 
			String s1 = input.next();
			String s2 = input.next();
		int ans = s1.compareToIgnoreCase(s2);
		if(ans > 0)
			ans = 1;
		else if (ans < 0)
		ans = -1;
		System.out.println(ans);
			
		}
	}
	
