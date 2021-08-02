/*
Anawin Athawong
630510606
*/
import java.util.*;
public class Lab02_1_630510606{
    public static void main(String[] args) {
        char ch;
        int number;
        Scanner input=new Scanner(System.in);
        system.out.print("Input character: ");
        ch=input.nextLine().charAt(0);
        do{
            system.out.print("Input Number (between 2 and 10) : ");
            number = input.nextInt();    
        }while(number<2 || number>10);
        if(character.toLowerCase(ch)=='a'){
            printStarA(number);
        }
        else if(character.toLowerCase(ch)=='b')printStarB(number);
        else{
            println("Good bye");
        }



    }
    public static void printStarA(int x){
        int row,col;
        for(row =x;row>=1;row--){
            for(col=1;col<=row;col++){
                system.out.print("*");
            }
            system.out.println();
        }
    }
    public static void printStarB(int x){
        int row,col;
        for(row =1;row<=x;row++){
            for(col=0;col<row;col++){
                for(i=0;i<x-row;i++){
                    system.out.print(" ");
                }
                system.out.print("*");
            }
            system.out.println();
        }
    }

}