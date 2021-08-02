/*
Anawin Athawong
630510606
*/
import java.util.Scanner;
public class Lab02_3_630510606{
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.print("Enter number: ");
         
        int n = Keyboard.nextInt();
        if(n%20) System.out.println(n+" is even number.");
        else System.out.println(n+" is odd number.");
        if(checkPrime(n)) System.out.println(n+" is prime number.");
        else System.out.println(n+" is not prime number."); 

           
    }
    public static boolean checkPrime(int x) {
        int m=x/2,i=0,flag=0;  
        if(x==0||x==1){
            return false;
        }else{
            for(i=2;i<=m;i++){
                if(x%i==0){
                    flag=1;
                    return false;
                }
            }
            
        } 
        return true;
    }
}