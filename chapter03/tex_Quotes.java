import java.util.Scanner;
/*
 * example3-1: Tex Quotes.
 * @POJ 1488
 * 
 */
public class tex_Quotes {
	public static void main(String[] args){
		//input
		Scanner in = new Scanner(System.in);
		int n = 0;
		while(in.hasNext()){
			String input = in.nextLine();
			char[] alpha = input.toCharArray();
			for(int i = 0; i < input.length(); i++){
				if(alpha[i] == '\"'){
					if(n % 2 == 0){
						System.out.print("``");
					}
					else{
						System.out.print("''");
					}
					n++;
				}
				else
					System.out.print(alpha[i]);
			}
			System.out.println();
		}
	}
}
