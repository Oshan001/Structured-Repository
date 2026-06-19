package countVowels;
import java.util.Scanner;

public class countVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String string = sc.nextLine();
		
		System.out.print("No. of vowels in given sentence: "+countVowelss(string));
		sc.close();
	}
	
	public static int countVowelss(String sentence) {
		int count = 0;
		char[] chars = sentence.toCharArray();
		for(int i=0;i<chars.length;i++) {
			if(chars[i]=='a' || chars[i]=='e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u' || chars[i]=='A' || chars[i]=='E' || chars[i] == 'I' || chars[i] == 'O' || chars[i] == 'U') {
				count++;
			}
		}
		return count;
	}
}
