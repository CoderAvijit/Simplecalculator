import java.util.Scanner;


public class Calculator
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int result;
        while(true)
        {
            System.out.println("Please enter an operator: ");
            char op = sc.next().charAt(0);
            if(op == '+'||op == '-'||op == '*'||op == '/')
            {
                System.out.println("Please enter two numbers :");
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
            if(op=='+')
                {
                result = n1+n2;
                System.out.println("Result is = " +result);
                }
            if(op=='-')
                {
                result = n1-n2;
                System.out.println("Result is = " +result);
                }
            if(op=='*')
                {
                result = n1*n2;
                System.out.println("Result is = " +result);
                }
            if(op=='/')
                {
                result = n1/n2;
                System.out.println("Result is = " +result);
                }

        
            
            }
            else if(op=='X'||op =='x')
            {
                System.out.println("You have closed the calculator");
                break;
            }

            
            else
            {
                System.out.println("You have entered an invalid operator");
            }
        }
           
        }     
        
    }

