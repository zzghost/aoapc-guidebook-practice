package exercises;
/*
 * Periodict Strings.
 * enum the period and check if the string satisfies the condition.
 * @UVa 455,Accepted
 */
import java.util.Scanner;

public class PeriodicStrings {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int N = in.nextInt();
  for(int m = 0; m < N; m++){
    String input = in.next();
    int len = input.length(), period = len;
    for(int k = 1; k < len; k++){
        int j = k;
        //must compare till the end of the string.otherwise, like "abababababababbababababab" will get the wrong answer.
        for(; j < len && input.charAt(j) == input.charAt(j % k); j++);
        if(j == len && j % k == 0){
          period = k;
          break;
        }
    } 
    if(m != 0)
      System.out.println();
    System.out.println(period);
  }
}
}
