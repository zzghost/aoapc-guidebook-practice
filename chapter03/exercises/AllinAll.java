package exercises;
/*
 * Traversal with s to match.
 * @UVa 10340, Accpeted
 */
import java.util.Scanner;

public class AllinAll {
public static boolean solve(String s, String t){
  int m = s.length(), n = t.length();
  int i = 0, j = 0;
  while(i < m && j < n){
    if(s.charAt(i) == t.charAt(j)){
      i++; j++;
    }
    else{
      j++;
    }
  }
  return (i == m);
}
  
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  while(in.hasNext()){
    String s = in.next(), t = in.next();
    boolean rst = solve(s, t);
    if(rst)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
}
