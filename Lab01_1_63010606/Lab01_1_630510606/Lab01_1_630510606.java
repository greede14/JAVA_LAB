/*
Anawin Athawong
630510606
*/
import java.util.Scanner;
public class Lab01_1_630510606{
    public static void main(String[] args) {
        int a,b,c,temp=0;
        Scanner Keyboard = new Scanner(System.in);
        System.out.print("Enter A: ");
        a = Keyboard.nextInt();
        System.out.print("Enter B: ");
        b = Keyboard.nextInt();
        System.out.print("Enter C: ");
        c = Keyboard.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(a<c && b<c && temp<=c){
            
            
            temp = a*a + b*b;
            a = b;
            if(temp>=c) break;
            
            
            System.out.print(temp+" ");
            b = temp;
        }
    }
}