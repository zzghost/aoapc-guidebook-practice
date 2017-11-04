import java.util.Scanner;
/*
 * DigitGenerator.
 * Just record the answers.
 * @UVa 1583
 * @Accepted
 */
public class DigitGenerator {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] record = new int[100001];
    for(int i = 0; i <= 100000; i++){
      int sum = i, num = i;
      while(num != 0){
        sum += (num % 10);
        num /= 10;
      }
      if(sum <= 100000 && record[sum] == 0)
        record[sum] = i;
    }
    for(int i = 0; i < n; i++){
      int nums = in.nextInt();
      System.out.println(record[nums]);
    }
  }
}
