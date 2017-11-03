import java.util.Scanner;
/*
 * 3-1 Score
 * @UVa 1585
 * @Accepted
 */
public class Score {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    while(n != 0){
      String input = in.next();
      int score = 0, count = 0;
      int len = input.length();
      for(int i = 0; i < len; i++){
        if(input.charAt(i) == 'O')
          score += (++count);
        if(input.charAt(i) == 'X')
          count = 0;
      }
      System.out.println(score);
      n--;
      score = 0;
    }
  }
}
