package calculator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char oper;
        double num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the operator (+, -, *, /, ^)");
        oper = input.next().charAt(0);

        System.out.println("Enter two numbers");
        num1 = input.nextDouble();
        num2 = input.nextDouble();

        input.close();

        switch(oper) {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", num1, num2, (num1+num2));
                break;

            case '-':
                System.out.printf("%.2f - %.2f = %.2f", num1, num2, (num1-num2));
                break;

            case '*':
                System.out.printf("%.2f * %.2f = %.2f", num1, num2, (num1*num2));
                break;

            case '/':
                if(num2 != 0)
                    System.out.printf("%.2f / %.2f = %.2f", num1, num2, (num1/num2));
                else
                    System.out.println("Divide by zero");
                break;

            case '^':
                for(int i = 1; i < num1; i++){
                    num2 = num2 * num2;
                }
                System.out.println(num2);
                break;

            default:
                System.out.printf("%c is an invalid operator",oper);
        }
    }
}