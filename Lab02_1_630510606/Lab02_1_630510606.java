/*
Anawin Athawong
630510606
*/
import java.util.*;
import java.lang.*;
public class Lab02_1_630510606{
    public static void main(String[] args) {
        char ch;
        int number;
        Scanner inputt = new Scanner(System.in);
        System.out.print("Input character: ");
        ch=inputt.nextLine().charAt(0);
        do{
            System.out.print("Input Number (between 2 and 10) : ");
            number = inputt.nextInt();    
        }while(number<2 || number>10);

        if(Character.toLowerCase(ch)=='a'){
            printStarA(number);
        }
        else if(Character.toLowerCase(ch)=='b'){
            printStarB(number);
        }
        else{
            System.out.println("Good bye");
        }



    }
    public static void printStarA(int x){
        int row,col;
        for(row =x;row>=1;row--){
            for(col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printStarB(int x){
        int row,col;
        for(row =1;row<=x;row++){
            for(int i=0;i<x-row;i++){
                System.out.print(" ");
            }
            for(col=0;col<row;col++){
                
                System.out.print("*");
            }
            System.out.println();
        }
    }

}