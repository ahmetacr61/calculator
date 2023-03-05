import java.util.Scanner;

//Code from ahmetacr61

public class calculator {
    public static void main(String args[]) {
        //Variables
        double firstInput = 0;
        double secondInput = 0;
        double output = 0;
        String operator;

        //Scanner
        Scanner scan = new Scanner(System.in);

        //Print out the Questions and save the operator and inputs
        System.out.println("Choose an operator (+ - * /)");
        operator = scan.nextLine().toLowerCase();
        System.out.println("Enter the first Number:");
        firstInput = scan.nextDouble();
        System.out.println("Enter the second Number:");
        secondInput = scan.nextDouble();

        //The actual Calculation
        switch(operator) {
            case "+":
            output = firstInput + secondInput;
            System.out.println("Your answer is " + output);
            break;

            case "-":
            output = firstInput - secondInput;
            System.out.println("Your answer is " + output);
            break;

            case "*":
            output = firstInput * secondInput;
            System.out.println("Your answer is " + output);
            break;

            case "/":
            output = firstInput / secondInput;
            System.out.println("Your answer is " + output);
            break;

            default:
            System.out.println("You didn't coose an real operator\n");
            break;
        }
        scan.close();
    }
}