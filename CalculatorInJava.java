import java.util.Scanner;
public class CalculatorInJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);//Take input of Operator
            //trim()= will remove extra space
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter two numbers: ");
                //Taking input of No.
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } 
            //if user gave 'X' or 'x' as input in op then operation will be terminated
            else if (op == 'x' || op == 'X') {
                System.out.println("Operation is Terminated");
                break;
            } 
            else {
                System.out.println("Invalid operation!!");
            }
            System.out.println("Answer="+ans);
        }
    }
}