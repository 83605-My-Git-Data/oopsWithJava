import java.util.Scanner;

public class CountW {
	public static void main(String[] args) {
		
		
         Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		
		int ans = countWords(s);
		
		System.out.println(ans);
	}
	
	public static int countWords(String s) {
		int words;
		
		String[] arr = s.trim().split(" ");
		
		return words = arr.length;
		
		
	}

}
