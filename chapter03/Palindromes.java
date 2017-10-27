import java.io.BufferedInputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Palindromes {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		while(in.hasNext()){
			String input = in.nextLine();
			char[] alpha = input.toCharArray();
			int size = alpha.length;
			int p = 1, m = 1;
			HashMap<Character, Character> map = new HashMap<Character, Character>();
			map.put('A', 'A');map.put('E', '3');map.put('H', 'H');
			map.put('I', 'I');map.put('J', 'L');map.put('L', 'J');
			map.put('M', 'M');map.put('O', 'O');map.put('S', '2');
			map.put('T', 'T');map.put('U', 'U');map.put('V', 'V');
			map.put('W', 'W');map.put('X', 'X');map.put('Y', 'Y');
			map.put('Z', '5');map.put('1', '1');map.put('2', 'S');
			map.put('3', 'E');map.put('5', 'Z');map.put('8', '8');
			for(int i = 0; i < size/ 2; i++)
				if(alpha[i] != alpha[size - i - 1]){
					p = 0;
					break;
				}
			for(int i = 0; i <= size / 2; i++){
				Character ch = (Character)map.get(map.get(alpha[size - i - 1]));
				if(ch == null || alpha[i] != (Character)map.get(ch))
					m = 0;
			}
			switch(2 * m + p){
				case 0 : System.out.println(input + " -- is not a palindrome.");break;
				case 1 : System.out.println(input + " -- is a regular palindrome.");break;
				case 2 : System.out.println(input + " -- is a mirrored string.");break;
				case 3 : System.out.println(input + " -- is a mirrored palindrome.");break;
			}
			System.out.println();
		}
	}
}