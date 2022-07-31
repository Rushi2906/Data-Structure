import java.util.Scanner;

class Evaluation_Prefix {
    static Evaluation_Prefix e1 = new Evaluation_Prefix();
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

    public static int op(String Prefix) {

        for (int i = 0; i < Prefix.length(); i++) {
            char n = Prefix.charAt(i);
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
        System.out.println("Enter PreFix Expression : ");
        String Prefix1 = sc.nextLine();
        String Prefix = "";
        for (int i = Prefix1.length() - 1; i >= 0; i--) {
            Prefix += Prefix1.charAt(i);
        }
        System.out.println("Evalution : " + op(Prefix));
    }
}