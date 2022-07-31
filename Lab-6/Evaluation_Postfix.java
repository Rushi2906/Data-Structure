import java.util.Scanner;

class Evaluation_Postfix {
    static Evaluation_Postfix e1 = new Evaluation_Postfix();
    int[] arr1 = new int[100];
    static int top = -1;

    public void push(int n) {
        if (top >= 99) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            arr1[top] = n;
        }
    }

    public int pop() {
        if (top < -1) {
            System.out.println("Stack Underflow");
        }
        return arr1[top--];
    }

    public static int op(String Postfix) {

        for (int i = 0; i < Postfix.length(); i++) {
            char n = Postfix.charAt(i);
            if (Character.isDigit(n)) {
                int m = (int) n - 48;
                e1.push(m);
            } else {
                int value1 = e1.pop();
                int value2 = e1.pop();
                switch (n) {
                    case '+':
                        e1.push(value1 + value2);
                        break;
                    case '-':
                        e1.push(value1 - value2);
                        break;
                    case '*':
                        e1.push(value1 * value2);
                        break;
                    case '/':
                        e1.push(value1 / value2);
                        break;
                }
            }
        }

        return e1.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PostFix Expression : ");
        String Postfix = sc.nextLine();
        System.out.println("Evalution : " + op(Postfix));
    }
}