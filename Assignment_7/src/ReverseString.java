import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		
		String reversed = reverse(s);
		System.out.println(reversed);
		
		
	}
	
	public static String reverse(String s) {
		char[] str = s.toCharArray();
		
		int start = 0;
		int end = str.length-1;
		
		while(start<=end) {
			char temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			end--;
		}
		
		return new String(str);
		
	}

}
