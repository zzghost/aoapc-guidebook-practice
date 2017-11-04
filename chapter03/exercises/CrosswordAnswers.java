package exercises;
/*
 * Or we can cancel the `start` array to optimize the space complexity.
 * @UVa 232 , Accepted
 */
import java.util.Scanner;

public class CrosswordAnswers {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int r = in.nextInt(), kase = 1;
  while(r != 0){
    int c = in.nextInt();
    char[][] grid = new char[r][c];
    int[][] start = new int[r][c];
    //input
    int countStart = 0;
    for(int i = 0; i < r; i++){
      grid[i] = in.next().toCharArray();
      for(int j = 0; j < c; j++){
        if(((i == 0 || grid[i - 1][j] == '*') || (j == 0 || grid[i][j - 1] == '*')) && grid[i][j] != '*')
          start[i][j] = (++countStart);
      }
    }

    //output
    if(kase != 1)
      System.out.println();
    System.out.println("puzzle #" + kase + ":");
    System.out.println("Across");
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        if(start[i][j] > 0){
          if(start[i][j] < 10)
            System.out.print("  ");
          else
            System.out.print(" ");
          System.out.print(start[i][j] + ".");
          while(j < c && grid[i][j] != '*'){
            System.out.print(grid[i][j]);
            j++;
          }
          System.out.println();
        }
      }
    }
    System.out.println("Down");
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        if(start[i][j] > 0 && (i == 0 || grid[i - 1][j] == '*')){
          if(start[i][j] < 10)
            System.out.print("  ");
          else
            System.out.print(" ");
          System.out.print(start[i][j] + ".");
          int idx = i;
          while(idx < r && grid[idx][j] != '*'){
            System.out.print(grid[idx][j]);
            idx++;
          }
          System.out.println();
        }
      }
    }
    r = in.nextInt();
    kase++;
    
  }
  
}
}
