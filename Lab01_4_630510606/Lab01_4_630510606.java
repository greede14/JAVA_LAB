/*
Anawin Athawong
630510606
*/

import java.util.Scanner;
public class Lab01_4_630510606{
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[10];
        int j =0;

        System.out.println("Enter Array A");
        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Array B");
        for(int i=0;i<5;i++){
            b[i] = sc.nextInt();
        }

        for(int i=0;i<10;i=i+2){
            if(a[j]<=b[j]){
                c[i] = a[j];
                c[i+1] = b[j];
            }
            else{
                c[i] = b[j];
                c[i+1] = a[j];
            }
            j+=1;
        }
        while(true){
            boolean isSwap=false;
            for(int i=0;i<10;i++){
                if(i==9){continue;}
                if(c[i]>c[i+1]){
                    int temp = c[i];
                    c[i] = c[i+1];
                    c[i+1]=temp;
                    isSwap=true;
                }else isSwap=false;
            }
            if(isSwap==false){ break;}
        }
        for (int element: c) {
            System.out.print(element+" ");
        }

    }
}