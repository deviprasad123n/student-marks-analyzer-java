import java.util.*;
public class PrimeNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        boolean isPrime=true;
        for(int c=2;c*c <= number;c++){
            if(number % c == 0){
                isPrime=false;
                break;
            }
           
        }
        if(number <= 1){
            System.out.println("Not a prime or composite number.");
        }
        else if(isPrime){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
}