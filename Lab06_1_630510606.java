
/*
Anawin Athawong
630510606
*/
//https://teams.microsoft.com/l/file/6B2E55FD-7C06-4652-9227-6D15429855E3?tenantId=cf81f1df-de59-4c29-91da-a2dfd04aa751&fileType=pdf&objectUrl=https%3A%2F%2Fo365cmu.sharepoint.com%2Fsites%2FSec_2196_2564_1_001-000%2FShared%20Documents%2FGeneral%2FWeek06%2FLab06.pdf&baseUrl=https%3A%2F%2Fo365cmu.sharepoint.com%2Fsites%2FSec_2196_2564_1_001-000&serviceName=teams&threadId=19:kw2-h6TJQ87Wxu8T5tcqlt3jbV9WXCwr-WZBg3XmeV01@thread.tacv2&groupId=78933d9a-af02-4237-bb18-3ed7b7461f29

import java.util.Scanner;
class Drawing{
    public void drawTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < i+1; j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
    public void drawTriangle(int n,char x){
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n-i; j++){
                System.out.print(x);

            }
            System.out.println();
        }
    }
}

public class Lab06_1_630510606{
    public static void main(String[] args) {
        
        Drawing myDrawing = new Drawing();
        Scanner input = new Scanner(System.in);
        System.out.print("Input N: ");
        int a = input.nextInt();
        System.out.print("Input X: ");
        char b = input.next().charAt(0);
        myDrawing.drawTriangle(a);
        myDrawing.drawTriangle(a,b);
    }
}