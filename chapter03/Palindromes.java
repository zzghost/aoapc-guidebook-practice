import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String input = in.nextLine();
            char[] alpha = input.trim().toCharArray();
            int size = input.length();
            int p = 1, m = 1;
            char[] REVERSE = {'A', ' ', ' ', ' ', '3', ' ', ' ', 'H', 'I', 'L', ' ', 
                'J', 'M', ' ', 'O', ' ', ' ', ' ', '2', 'T', 'U', 'V', 'W', 'X', 'Y', '5', 
                '1', 'S', 'E', ' ', 'Z', ' ', ' ', '8', ' '};
            for(int i = 0; i < (size + 1) / 2; i++){
                if(alpha[i] != alpha[size - i - 1])
                    p = 0;
                char ch = (alpha[i] >= 'A' && alpha[i] <= 'Z') ? REVERSE[alpha[i] - 'A'] : REVERSE[alpha[i] - '0' + 25];
                if(ch != alpha[size - i - 1])
                    m = 0;
            }
            final String[] MESG = {" -- is not a palindrome.", " -- is a regular palindrome.", 
                " -- is a mirrored string.", " -- is a mirrored palindrome."};
            System.out.println(input + MESG[2 * m + p]);
            System.out.println();
        }
    }
}
