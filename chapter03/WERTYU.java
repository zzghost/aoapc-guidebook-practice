/*
 * 例3-2 WETYU
 * @POJ 2538
 */
import java.util.Scanner;

public class WERTYU {
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    final char[] LINE = {'`','1','2','3','4','5','6','7','8','9','0','-','=',
        'Q','W','E','R','T','Y','U','I','O','P','[',']','\\','A','S','D','F','G','H','J','K','L',';','\'','Z','X','C','V','B','N','M',',','.','/'};
    Scanner in = new Scanner(System.in);
    while(in.hasNext()){
      String input = in.nextLine();
      char[] alpha = input.toCharArray();
      int n = input.length();
      for(int i = 0; i < n; i++){
        int j = 0;
        while(j < LINE.length && LINE[j] != alpha[i])
          j++;
        if(j < LINE.length && j > 0)
          System.out.print(LINE[j - 1]);
        else
          System.out.print(alpha[i]);
      }
      System.out.println();
    }
  }
}
