package chapter03;
/*
 * Brute Force or Just count the max element on each position.
 * @UVa 1368, Accepted
 */
import java.util.Scanner;

public class DNAConsensusString {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int T = in.nextInt();
    for(int i = 0; i < T; i++){
      //input
      int m = in.nextInt(), n = in.nextInt();
      char[][] dna = new char[m][n];
      for(int j = 0; j < m; j++)
        dna[j] = in.next().toCharArray();
      
      int[] count = new int[n];
      int distance = 0;
      StringBuilder sb = new StringBuilder();
      for(int x = 0; x < n; x++){ 
        int a = 0, c = 0, g = 0, t = 0;
        for(int y = 0; y < m; y++){
          switch(dna[y][x]){
            case 'A' : a++; break;
            case 'C' : c++; break;
            case 'G' : g++; break;
            case 'T' : t++; break;
          }
        }
        int max = a;
        max = Math.max(max, c);
        max = Math.max(max, g);
        max = Math.max(max, t);
        if(max == a){
          sb.append('A');
          distance += (c + g + t);
        }
        else if(max == c){
          sb.append('C');
          distance += (a + g + t);
         }
        else if(max == g){
          sb.append('G');
          distance += (a + c + t);
        }
        else{
          sb.append('T');
          distance += (a + g + c);
        }
      }//each column
      System.out.println(sb.toString());
      System.out.println(distance);
      
    }
  }
}
