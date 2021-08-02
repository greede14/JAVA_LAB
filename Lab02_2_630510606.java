/*
Anawin Athawong
630510606
*/
import java.util.*;
public class Lab02_2_630510606{
    public static void main(String[] args) {
        Scanner Keyboard  = new Scanner(System.in);
        int n=0,x=0,y=0;
        int[] Quadrant= {0,0,0,0,0,0,0};//Quadrant1,Quadrant2,Quadrant3,Quadrant4,On X,On Y,Origin
        System.out.print("Enter N: ");
        n = Keyboard.nextInt();
        for(int i=0;i<n;i++){
            System.out.printf("Enter point #%d: ",i+1);
            x=Keyboard.nextInt();
            y=Keyboard.nextInt();
            
            switch(checkQuadrant(x, y)){
                case 1:
                    Quadrant[0] += 1;
                    break;
                case 2:
                    Quadrant[1] += 1;
                    break;
                case 3:
                    Quadrant[2] += 1;
                    break;
                case 4:
                    Quadrant[3] += 1;
                    break;
                case 5:
                    Quadrant[4] += 1;
                    break;
                case 6:
                    Quadrant[5] += 1;
                    break;
                case 7:
                    Quadrant[6] += 1;
                    break;
            }
            

            
        }
        System.out.println("Number of points in Qaudrant 1 = " +Quadrant[0]);
        System.out.println("Number of points in Qaudrant 2 = " +Quadrant[1]);
        System.out.println("Number of points in Qaudrant 3 = " +Quadrant[2]);
        System.out.println("Number of points in Qaudrant 4 = " +Quadrant[3]);
        System.out.println("Number of points on X axis  = " +Quadrant[4]);
        System.out.println("Number of points on Y axis  = " +Quadrant[5]);
        System.out.println("Number of points on origin point = " +Quadrant[6]);
        

    }
    static int checkQuadrant(int a,int b){
            if(a==0&&b==0) return 7;
            else if(a>0&&b>0) return 1;
            else if(a<0&&b>0) return 2;
            else if(a<0&&b<0) return 3;
            else if(a>0&&b<0) return 4;
            else if(a==0) return 5;
            else return 6;
        }
}