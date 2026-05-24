package org.enflky;

import java.math.BigDecimal;
import java.math.BigInteger;

public class FastCalc {
    public static void main(String[] args) {
        calcType();
    }
    public static void calcType() {
        GetUserInput getUserInput = new GetUserInput();
        System.out.println("********************************");
        System.out.println("Please select a calculator type and write the type id");
        System.out.println("********************************");
        System.out.println("Integer Calculator: 1");
        System.out.println("Decimal Calculator: 2");
        System.out.println("SquareRoot Calculator: 3");
        System.out.println("Circle Area Calculator: 4");
        System.out.println("Factorial Calculator: 5");
        System.out.println("********************************");
        isCorrectInput:
        while (true) {
            switch (Integer.parseInt(getUserInput.getInput(null, GetUserInput.dataType.Integer))) {
                case 1: //Integer
                    IntegerCalc();
                    break isCorrectInput;
                case 2: // Decimal
                    DecimalCalc();
                    break isCorrectInput;
                case 3: //Square Root
                    SquareRootCalc();
                    break isCorrectInput;
                case 4: //Circle Area
                    CircleAreaCalc();
                    break isCorrectInput;
                case 5: //Factorial
                    FactorialCalc();
                    break isCorrectInput;
                default: //defaulty mate!
                    System.out.println("Invalid Input, Please enter a valid type id");
            }
        }
    }


    public static void IntegerCalc() {
        GetUserInput getUserInput = new GetUserInput();
        BigInteger result;
        long firstNumber = Long.parseLong(getUserInput.getInput("*******************************\nPlease enter the first integer value\n********************************", GetUserInput.dataType.Long));
        String operator = getUserInput.getInput("*******************************\nPlease enter the operator\n********************************", GetUserInput.dataType.String);
        long secondNumber = Long.parseLong(getUserInput.getInput("*******************************\nPlease enter the second integer value\n********************************", GetUserInput.dataType.Long));
        if (operator.equals("/") && secondNumber == 0) {
            System.out.println("You cant divide by zero... Please try again");
            IntegerCalc();
        }
        if (!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("^"))) {
            System.out.println("You can only use these \"+,-,*,/,^\" operators.... Please try again");
            IntegerCalc();
        }
        switch (operator) {
            case "+":
                result = BigInteger.valueOf(firstNumber + secondNumber);
                System.out.println(firstNumber + " + " + secondNumber + " = " + result);
                GoBackToMainMenu();
                break;
            case "-":
                result = BigInteger.valueOf(firstNumber - secondNumber);
                System.out.println(firstNumber + " - " + secondNumber + " = " + result);
                GoBackToMainMenu();
                break;
            case "*":
                result = BigInteger.valueOf(firstNumber * secondNumber);
                System.out.println(firstNumber + " * " + secondNumber + " = " + result);
                GoBackToMainMenu();
                break;
            case "/":
                result = BigInteger.valueOf(firstNumber / secondNumber);
                System.out.println(firstNumber + " / " + secondNumber + " = " + result);
                GoBackToMainMenu();
                break;
            case "^":
                result = BigInteger.valueOf((long) Math.pow(firstNumber, secondNumber));
                System.out.println(firstNumber + " ^ " + secondNumber + " = " + result);
                GoBackToMainMenu();
                break;
            default:
                System.out.println("Something went wrong... Please try again");
                // I dont think we can get this error but maybe we can ????!!!?!?!!!1!! 
                IntegerCalc();
        }
    }

    public static void DecimalCalc() {
        GetUserInput getUserInput = new GetUserInput();
        BigDecimal result;
        double firstNumber = Double.parseDouble(getUserInput.getInput("*******************************\nPlease enter the first integer value\n********************************", GetUserInput.dataType.Decimal));
        String operator = getUserInput.getInput("*******************************\nPlease enter the operator\n********************************", GetUserInput.dataType.String);
        double secondNumber = Double.parseDouble(getUserInput.getInput("*******************************\nPlease enter the second integer value\n********************************", GetUserInput.dataType.Decimal));
        if (operator.equals("/") && secondNumber == 0) {
            System.out.println("You cant divide by zero... Please try again");
            DecimalCalc();
        }
        if (!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("^"))) {
            System.out.println("You can only use these \"+,-,*,/,^\" operators.... Please try again");
            DecimalCalc();
        }
        switch (operator) {
            case "+":
                result = BigDecimal.valueOf(firstNumber + secondNumber);
                System.out.println(firstNumber + " + " + secondNumber + " = " + result);
                GoBackToMainMenu();
                break;
            case "-":
                result = BigDecimal.valueOf(firstNumber - secondNumber);
                System.out.println(firstNumber + " - " + secondNumber + " = " + result);
                GoBackToMainMenu();
                break;
            case "*":
                result = BigDecimal.valueOf(firstNumber * secondNumber);
                System.out.println(firstNumber + " * " + secondNumber + " = " + result);
                GoBackToMainMenu();
                break;
            case "/":
                result = BigDecimal.valueOf(firstNumber / secondNumber);
                System.out.println(firstNumber + " / " + secondNumber + " = " + result);
                GoBackToMainMenu();
                break;
            case "^":
                result = BigDecimal.valueOf(Math.pow(firstNumber, secondNumber));
                System.out.println(firstNumber + " ^ " + secondNumber + " = " + result);
                GoBackToMainMenu();
                break;
            default:
                System.out.println("Something went wrong... Please try again");
                // I dont think we can get this error but maybe we can ????!!!?!?!!!1!!
                DecimalCalc();
        }
    }
    public static void SquareRootCalc(){
        GetUserInput getUserInput = new GetUserInput();
        double input =Double.parseDouble(getUserInput.getInput("*******************************\nPlease enter the number you want to get its Square Root\n********************************", GetUserInput.dataType.Decimal));
        if (input<0){
            System.out.println("You cant find negative numbers root... Please try again");
            SquareRootCalc();
        }
        double result = Math.sqrt(input);
        System.out.println("Square Root of " + input + " is " + result);
        GoBackToMainMenu();
    }
    public static void CircleAreaCalc(){
        GetUserInput getUserInput = new GetUserInput();
        double r =Double.parseDouble(getUserInput.getInput("*******************************\nPlease enter the circle's radius to find out that circle's area\n********************************", GetUserInput.dataType.Decimal));
        if (r<=0){
            System.out.println("Radius cant be zero or lower... Please try again");
            CircleAreaCalc();
        }
        double result = Math.PI * Math.pow(r,2);
        System.out.println("If circles radius is "+r+ " then area of that circle is " + result);
        GoBackToMainMenu();
    }
    public static void FactorialCalc(){
        GetUserInput getUserInput = new GetUserInput();
        BigInteger result = BigInteger.ONE;
        long input = (Long.parseLong(getUserInput.getInput("*******************************\nPlease enter the number you want to get its Factorial\n********************************", GetUserInput.dataType.Long)));
        if (input<0){
            System.out.println("You cant find negative numbers factorial... Please try again");
            FactorialCalc();
        }
        for  (int i = 1; i <= input; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of " + input + " is " + result);
        GoBackToMainMenu();
    }
    public static void  GoBackToMainMenu(){
        GetUserInput getUserInput = new GetUserInput();
        System.out.println("Your work is done if you want to use calculator again. You should type \"1\" if you want to exit type \"2\" for exiting the calculator. ");
        int choice = Integer.parseInt(getUserInput.getInput(null, GetUserInput.dataType.Integer));
        if (choice==1){
            calcType();
        }
        else if (choice==2){
            System.exit(0);
        }
        else{
            System.out.println("You can only type 1 or 2... Please try again");
            GoBackToMainMenu();
        }
    }
}

