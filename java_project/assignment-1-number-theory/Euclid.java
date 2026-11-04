import java.util.Scanner;
public class Euclid {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the dividend: "); long x=sc.nextLong();
  System.out.print("Enter the divisor: "); long y=sc.nextLong();
  if(y==0){System.out.println("GCD is: "+Math.abs(x)); return;}
  while(y!=0){ long q=x/y, r=x%y; System.out.println(x+" = "+y+" x "+q+" + "+r); x=y; y=r; }
  System.out.println("GCD is: "+Math.abs(x));
 }
}
