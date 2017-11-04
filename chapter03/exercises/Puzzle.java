package exercises;
/*
 * 
 * Puzzle.
 * Just find and swap.
 * @UVa 227, Accepted
 */
import java.util.Scanner;

public class Puzzle {
public static void swap(char[][] grid, int m, int n, int idx, boolean horizontal){
  char tmp = grid[m][n];
  if(horizontal){
    grid[m][n] = grid[m][idx];
    grid[m][idx] = tmp;
  }
  else{
    grid[m][n] = grid[idx][n];
    grid[idx][n] = tmp;
  }
}
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  char[][] grid;
  boolean end = false;
  int kase = 1;
  while(!end){
    int m = 0, n = 0;
    grid = new char[5][5];
    //input the grid
    for(int i = 0; i < 5; i++){
      String tmp = in.nextLine();
      grid[i] = tmp.toCharArray();
      if(i == 0 && grid[0][0] == 'Z'){
        end = true;
        break;
      }
      //get the start position
      if(tmp.indexOf(' ') >= 0){
        m = i; n = tmp.indexOf(' ');
      }
    }
    //move
    if(!end){
      //input instruction till it ends with '0'
      StringBuilder sb = new StringBuilder();
      sb.append(in.nextLine());
      while(sb.charAt(sb.length() - 1) != '0')
        sb.append(in.nextLine());
      String instr = sb.toString();
      int len = instr.length();
      
      boolean noAws = false, horizontal = true;
      for(int i = 0; i < len; i++){
        if(instr.charAt(i) == 'A'){
          if(m - 1 >= 0){
            swap(grid, m, n, m - 1, !horizontal);
            m = m - 1;
          }
          else{
            noAws = true;
            break;
          }
        }
        else if(instr.charAt(i) == 'B'){
          if(m + 1 < 5){
            swap(grid, m, n, m + 1, !horizontal);
            m = m + 1;
          }
          else{
              noAws = true;
              break;
          }
        }
        else if(instr.charAt(i) == 'L'){
          if(n - 1 >= 0){
            swap(grid, m, n, n - 1, horizontal);
            n = n - 1;
          }
          else{
              noAws = true;
              break;
          }
        }
        else if(instr.charAt(i) == 'R'){
          if(n + 1 < 5){
            swap(grid, m, n, n + 1, horizontal);
            n = n + 1;
          }
          else{
              noAws = true;
              break;
            }
        }
        else if(instr.charAt(i) == '0' && i == len - 1){
          break;
        }
        else{
          noAws = true;
          break;
        }
      }
      
      //output
      if(kase != 1)
        System.out.println();
      System.out.println("Puzzle #"+kase + ":");
      if(!noAws){
        for(int i = 0; i < 5; i++){
          for(int j = 0; j < 5; j++){
            System.out.print(grid[i][j]);
            if(j != 4)
              System.out.print(" ");
          }
          System.out.println();
        }
      }
      else{
        System.out.println("This puzzle has no final configuration.");
      }
      kase++;
    }
  }
  }
}
