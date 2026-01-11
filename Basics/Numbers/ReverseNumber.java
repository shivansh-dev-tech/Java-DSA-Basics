// Reverse a number using loops
// Concepts used: while loop, modulo operator
public class ReverseNumber{
  public static void main(String[] args) {
    int n = 4556;
    int rev =0;
    while (n>0) {
      int lastDigit = n%10; 
      rev = (rev*10) + lastDigit;
      n /=10;
    }
    System.out.println(rev);
  }
}
