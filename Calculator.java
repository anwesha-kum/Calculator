import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,result;
        char operator;
        
        System.out.println("Enter the first number:");
        num1=sc.nextInt();

        System.out.println("Choose the operator (+,-,*,/,%):");
        operator=sc.next().charAt(0);

        System.out.println("Enter the second number:");
        num2=sc.nextInt();
        
        switch(operator) {
            case '+':
            result = num1 + num2;
            System.out.println("Result =" +result);
            break;

            case '-':
            result = num1 - num2;
            System.out.println("Result =" +result);
            break;

            case '*':
            result = num1 * num2;
            System.out.println("Result =" +result);
            break;

            case '/':
            if(num2 !=0){
                result = num1 / num2;
                System.out.println("Result =" +result);
            }
            else
            {
            System.out.println("Error: Division by Zero is not possible:");
            }
            break;

            case '%':
            if(num2 !=0){
                result = num1 % num2;
                System.out.println("Result= " +result);
            }
            else
            {
                System.out.println("Error: Modulo by zero is not possible:");
            }
            break;

            default:
            System.out.println("Error: Invalid Selection:");

        }
        
    }
    
}