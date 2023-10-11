import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int result=0;
        System.out.println("input your operation bro :");
        char op = in.next().charAt(0);
            switch (op){
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b != 0) {
                        result = a / b;
                    } else {
                        System.out.println("Error: Division by zero!");
                        return;
                    }
                    break;
                default:
                    System.out.println("Invalid operation!");
                    return;
            }
        System.out.println("Result: "+ a+ " " + op+ " " +b +" = " + result);
            }
    }

