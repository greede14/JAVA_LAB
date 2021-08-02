/*
Anawin Athawong
630510606
*/
import java.util.*;
public class Lab01_2_630510606{
    public static void main(String[] args) {
        List<Integer> score = new ArrayList<Integer>(); 
        Scanner Keyboard = new Scanner(System.in);
        int temp=0;
        System.out.println("Enter score between 1-100 or press 0 for stop");
        while(true){
            temp = Keyboard.nextInt();
            if(temp == 0){
                break;
            }
            else if(temp>0 && temp <=100){
                score.add(temp);
            }
            else{
                System.out.println("Enter score again(between 1-100 or press 0 for stop)");
            }
        }
        System.out.println("Maximum Score = "+ findMax(score));
        System.out.println("Minimum Score = "+ findMin(score));
        System.out.println("Average Score = "+ findMean(score));
        System.out.println("The number of students who scored below average score = "+ findBelowScore(score,findMean(score)));

    }
    static int findMax(List<Integer> temp){
        int max = 0;
        for(int i=0;i<temp.size();i++){
            if(max < temp.get(i)) max=temp.get(i);
        }
        return max;
    }
    static int findMin(List<Integer> temp){
        int min = 100;
        for(int i=0;i<temp.size();i++){
            if(min>temp.get(i)) min=temp.get(i);
        }
        return min;
    }
    static int findMean(List<Integer> temp){
        int mean = 0;
        for(int i=0;i<temp.size();i++){
            mean += temp.get(i)/temp.size();
        }
        return mean;
    }
    static int findBelowScore(List<Integer> temp,int mean){
        int x = 0;
        for(int i=0;i<temp.size();i++){
            if(temp.get(i)<mean){
                x += 1;
            }
            
        }
        return x;
    }      

}