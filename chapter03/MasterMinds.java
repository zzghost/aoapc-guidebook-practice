import java.util.Scanner;
/*
 * @UVa 340 Master-mind Hints
 * @Accepted
 */
public class MasterMinds {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(), kase = 1;
    while(n != 0){
      int[] ans = new int[n];
      int[] guess = new int[n];
      int A = 0, B = 0;
      for(int i = 0; i < n; i++)
        ans[i] = in.nextInt();
      System.out.println("Game " + kase + ":");
     for(int j = 1;; j++){
       for(int i = 0; i < n; i++){
         guess[i] = in.nextInt();
         if(guess[i] == ans[i])
           A++;
       }
       //There's no zero, so we just judge the first element
       if(guess[0] == 0)
         break;
       for(int b = 1; b <= 9; b++){
         int countA = 0, countB = 0;
         for(int i = 0; i < n; i++){
           if(ans[i] == b)
             countA++;
           if(guess[i] == b)
             countB++;
         }
         if(countA != 0 && countB != 0)
           B += Math.min(countA, countB);
         //System.out.println("countA = " + countA + ", countB = " + countB + ", B =" + B);
       }
       System.out.println("    (" + A + "," + (B - A) + ")");
       A = 0; 
       B = 0;
     }
      kase++;
      n = in.nextInt();
    }
  }
}
