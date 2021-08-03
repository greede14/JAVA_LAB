
/*
Anawin Athawong
630510606
*/
import java.util.Scanner;

class Menu {
    private static int choice;

    public static void setChoice() {
        Scanner input = new Scanner(System.in);
        System.out.printf("**********\n1.push\n2.pop\n3.show\n4.exit\n**********\nPlease select choice : ");
        do {
            choice = input.nextInt();
        } while (choice > 4 && choice < 1);

    }

    public static int getChoice() {
        return choice;
    }
}

class Stack {
    private static int item[] = new int[5];// ;
    private static int top = -1;

    public Stack() {
        top = -1;
    }

    public static void push(int x) {
        if (!isFull()) {

            item[++top] = x;

        } else {
            System.out.printf("stack is full.\n");
        }
    }

    public static void pop() {
        if (!isEmpty()) {
            System.out.printf("pop %d\n", item[top--]);
        } else {
            System.out.printf("stack is empty.\n");
        }
    }

    public static void show() {
        if (!isEmpty()) {
            for (int i = 0; i <= top; i++) {
                System.out.print(item[i]);
                System.out.print(" ");
            }
            System.out.println();

        } else {
            System.out.printf("stack is empty.\n");
        }
    }

    private static boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isFull() {
        if (top == 4) {
            return true;
        } else {
            return false;
        }
    }

    public static int gettop() {
        return top;
    }
}

public class Lab05_3_630510606 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        do {
            Menu.setChoice();
            switch (Menu.getChoice()) {
                case 1:
                    if (Stack.gettop() == 4) {
                        System.out.printf("stack is full.\n");
                        break;
                    } else {
                        System.out.print("Enter data: ");
                        Stack.push(keyboard.nextInt());
                        break;
                    }
                case 2:
                    Stack.pop();
                    break;
                case 3:
                    Stack.show();
                    break;
                default:
                    System.out.println("Bye bye");
                    break;

            }
        } while (Menu.getChoice() != 4);

    }
}