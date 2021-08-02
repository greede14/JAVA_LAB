
/*
Anawin Athawong
630510606
*/

import java.util.Scanner;

class Matrix {
    private int size;
    private int[][] data = new int[50][50];
    boolean identityStatus;

    ///////////////

    public void setData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input size : ");
        size = input.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("Input nember [%d][%d] : ", i, j);
                data[i][j] = input.nextInt();
            }
            System.out.println();
        }
    }

    public void checkIdentity() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j && data[i][j] != 1) {
                    identityStatus = false;
                    break;
                } else if (i != j && data[i][j] != 0) {
                    identityStatus = false;
                    break;
                } else {
                    identityStatus = true;
                }
            }
        }
    }

    public void showIdentity() {
        if (identityStatus) {
            System.out.print("This matrix is identity matrix.");
        } else {
            System.out.print("This matrix is not identity matrix.");
        }
    }

}

public class Lab04_1_630510606 {

    public static void main(String[] args) {
        Matrix m = new Matrix();
        //m.setSize();
        m.setData();
        m.checkIdentity();
        m.showIdentity();
    }
}