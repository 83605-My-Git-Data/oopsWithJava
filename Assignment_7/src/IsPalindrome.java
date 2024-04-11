import java.util.Scanner;

public class IsPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		
		boolean is = isPalin(s);
		System.out.println(is);
		
		
		
	}
	
	public static boolean isPalin(String s) {
		char[] str = s.toCharArray();
		
		int start = 0;
		int end = s.length()-1;
		
		
		while(start<=end) {
			if(str[start] != str[end] ) {
				return false;
			}
			start++;
			end--;
			
		}
		return true;
	}
	

}
