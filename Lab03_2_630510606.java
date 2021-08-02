import java.util.Scanner;

/*

import java.util.Scanner;
Anawin Athawong
630510606
*/
class ParkingRecord{
    private int ParkingTime;
    private double cost=0;
    private char vehicle;

    public void setData() {
        Scanner keyboard = new Scanner(System.in);
        do{
            System.out.print("Enter vehicle type: ");
            vehicle = Character.toLowerCase(keyboard.nextLine().charAt(0));

        }while(vehicle != 'c' && vehicle != 'm');

        System.out.print("Enter minute: ");
        ParkingTime = keyboard.nextInt();
    }
    public void calCost() {
        if(vehicle == 'c'){
            if(ParkingTime>240){
                cost += (ParkingTime - 240) *0.25;
                ParkingTime -= ParkingTime -240;
            }
            if(ParkingTime<=240 && ParkingTime >=121){
                cost += (ParkingTime- 120) *0.5;
                ParkingTime -= ParkingTime - 120;
        
            }
            if(ParkingTime <=120&&ParkingTime>=61){
                cost += (ParkingTime- 60) *0.75;
                ParkingTime -= ParkingTime - 60;
            }
            if(ParkingTime <=60){
                
                cost += ParkingTime;
            }
        }
        else{
            cost = Math.ceil((double)ParkingTime/60)*5;
        }


    }

    public void printCost() {
        System.out.println("Cost = "+cost+" baht(s)");
    }
}

public class Lab03_2_630510606 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter number of vehicle(s): ");
        int cars = x.nextInt();
        ParkingRecord[] v = new ParkingRecord[cars];
        for(int i=0;i<cars;i++){
            System.out.printf("Enter data for vehicle parking #%d\n",i+1);
            v[i] = new ParkingRecord();
            v[i].setData();
            v[i].calCost();
            v[i].printCost();
        }
    }

}
