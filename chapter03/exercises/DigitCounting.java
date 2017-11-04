package exercises;
/*
 * Digit Counting.
 * Bit manipulation.
 * @UVa 1225
 * @Accpeted
 */
import java.util.Scanner;

public class DigitCounting {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int T = in.nextInt();
  while(T != 0){
    int n = in.nextInt();
    int[] count = new int[10];
    for(int i = 1; i <= n; i++){
      int num = i;
      while(num != 0){
        count[num % 10]++;
        num /= 10;
      }
    }
    for(int i = 0; i < 10; i++){
      System.out.print(count[i]);
      if(i != 9)
        System.out.print(" ");
    }
    System.out.println();
    
    T--;
  }
  
}
}
