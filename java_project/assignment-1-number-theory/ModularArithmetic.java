import java.util.Scanner;
public class ModularArithmetic {
 public static void main(String[] args){ Scanner sc=new Scanner(System.in); System.out.print("Enter a: "); long a=sc.nextLong(); System.out.print("Enter b: "); long b=sc.nextLong(); System.out.print("Enter n: "); long n=sc.nextLong(); if(n<=0){System.out.println("Modulus must be positive.");return;} if(Math.floorMod(a-b,n)==0)System.out.println(a+", "+b+" are congruent");else System.out.println(a+", "+b+" are not congruent"); }
}
