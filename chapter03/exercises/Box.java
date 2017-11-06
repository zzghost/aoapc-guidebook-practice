package exercises;
/*
 * Box
 * not-so-clever solution
 * @Uva 1587, Accepeted
 */
import java.util.Scanner;

public class Box {
  public static boolean solve(int[] w, int[] l){
    boolean possible = true;
    int a = w[0], b = l[0], c = 0;
    w[0] = -w[0];
    l[0] = -l[0];
    //find a, b
    for(int i = 1; i < 6; i++){
      if(w[i] == a && l[i] == b){
        w[i]= -w[i]; l[i] = -l[i];
        break;
      }
    }
    
    //find a, c
    for(int i = 1; i < 6; i++){
      if(w[i] == a || l[i] == a){
        c = (w[i] == a) ? l[i] : w[i];
        break;
      }
    }//find c
    int count = 0;
    for(int i = 1; i < 6 && count < 2; i++){
      if(w[i] == a && l[i] == c || w[i] == c && l[i] == a){
        w[i]= -w[i]; l[i] = -l[i];
        count++;
      }
    }
    //find b,c
    count = 0;
    for(int i = 1; i < 6 && count < 2; i++){
      if(w[i] == b && l[i] == c || w[i] == c && l[i] == b){
        w[i]= -w[i]; l[i] = -l[i];
        count++;
      }
    }
    
    //check
    for(int i = 0; i < 6; i++)
      if(w[i] > 0 || l[i] > 0){
        possible = false;
        break;
      }
    return possible;
  }
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner in = new Scanner(System.in);
    while(in.hasNext()){
      int[] w = new int[6];
      int[] l = new int[6];
      //input
      for(int i = 0; i < 6; i++){
        int a = in.nextInt(), b = in.nextInt();
        w[i] = Math.min(a, b);
        l[i] = Math.max(a, b);
      }
      
      boolean possible = solve(w, l);
      
      if(possible)
        System.out.println("POSSIBLE");
      else
        System.out.println("IMPOSSIBLE");
    }
  }

}
