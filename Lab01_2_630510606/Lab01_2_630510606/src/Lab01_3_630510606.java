/*
Anawin Athawong
630510606
*/

import java.util.Scanner;
public class Lab01_3_630510606{
    public static void main(String[] args) {    
        int temp=0,total=0,bottle=0;   
        Scanner sc = new Scanner(System.in);
        bottle = sc.nextInt();
        total = bottle;
        while(bottle<5){
            total += (bottle/5)*2;
            temp = (bottle%5)+(bottle/5);
            bottle=temp;
        }
        System.out.println("Total number of drinking bottles = "+total+" The remaining empty bottles = "+bottle);
}

    
}