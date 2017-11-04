import java.util.Scanner;
/*
 * Circular Sequence.
 * Traversal
 * @UVa 1584
 * @Accepted
 */
public class CircularSequence {
  public static String recreate(String input, int idx){
    StringBuilder sb = new StringBuilder();
    int len = input.length();
    for(int i = idx; i != idx + len; i++){
      sb.append(input.charAt((i + len) % len) + "");
    }
    return sb.toString();
    
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int T = in.nextInt();
    while(T != 0){
      String input = in.next();
      String ans = new String(input);
      int len = input.length();
      for(int i = 1; i < len  ; i++){ // Start from chatAt(1)
        int j = i;
        for(; j != len + i && input.charAt((j + len) % len) <= ans.charAt(j - i); j++){
          if(input.charAt((j + len) % len) == ans.charAt(j - i))
            continue;
          if(input.charAt((j + len) % len) < ans.charAt(j - i))
            ans = recreate(input, i);
        }
      }
      System.out.println(ans);
      T--;
    }
  }
}
