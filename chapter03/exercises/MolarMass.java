import java.util.Scanner;
/*
 * Molar mass
 * @ UVa 1586
 * @ Accepted
 */
public class MolarMass {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int n = in.nextInt();
  while(n != 0){
    double weight = 0;
    String molar = in.next();
    int len = molar.length();
    for(int i = 0; i < len; i++){
      int num = 1;
      if(i != len - 1 && molar.charAt(i + 1) >= '1' && molar.charAt(i + 1) <= '9'){
        num = molar.charAt(i + 1) - '0';
        if(i != len - 2 && molar.charAt(i + 2) >= '1' && molar.charAt(i + 2) <= '9'){
          num = num * 10 + molar.charAt(i + 2) - '0';
        }
      }  
      if(molar.charAt(i) == 'C')
        weight += num * 12.01;
      if(molar.charAt(i) == 'H')
        weight += num * 1.008;
      if(molar.charAt(i) == 'O')
        weight += num * 16.00;
      if(molar.charAt(i) == 'N')
        weight += num * 14.01;
    }
    System.out.format("%.3f\n", weight);
    n--; 
  }
}
}
