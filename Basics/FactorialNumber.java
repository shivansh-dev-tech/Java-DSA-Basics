// Program to calculate factorial of a number
// Logic: Factorial = n * (n-1) * (n-2) ... * 1
// Example: 5! = 120
public class Basic{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int fact =1;
    System.out.println("Enter any positive number");
    for(int i =1;i<=num;i++){
      fact*=i;
    }
   System.out.println(fact);
  }
}
