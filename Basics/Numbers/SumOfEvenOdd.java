//Calculates sum of even odd integers in a set of integers 
import java.util.*;
public class SumOfEvenOdd{
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter how many integers you want:");
    int n = sc.nextInt();
    int evenSum =0;
    int oddSum = 0;
    for(int i=0;i<n;i++){
       int num = sc.nextInt();                  
       if(num%2==0){
         evenSum += num;
       }
       else{
         oddSum += num;
       }
    }
    System.out.println("even sum is:"+ evenSum);
    System.out.println("odd sum is:"+ oddSum);
  }
}
