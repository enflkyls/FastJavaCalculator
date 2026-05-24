package org.enflky;

import java.util.Scanner;

public class GetUserInput {
    public enum dataType { //getDataTypes
        Integer,
        Long,
        Decimal,
        BigInteger,
        String,
    }
    public String getInput(String message, dataType type) {
        Scanner input = new Scanner(System.in);
        if(!(message == null || message.isEmpty())){
            System.out.println(message);
        }
        switch (type) {
            case Integer:
                while (true) {
                    if (input.hasNextInt()) {
                        return String.valueOf(input.nextInt());
                    } else {
                        System.out.println("Wrong input, Please enter a valid input");
                        input.nextLine();
                    }
                }
            case Long:
                while (true) {
                    if (input.hasNextLong()) {
                        return String.valueOf(input.nextLong());
                    } else {
                        System.out.println("Wrong input, Please enter a valid input");
                        input.nextLine();
                    }
                }
            case Decimal:
                while (true) {
                    if (input.hasNextDouble()) {
                        return String.valueOf(input.nextDouble());
                    } else {
                        System.out.println("Wrong input, Please enter a valid input");
                        input.nextLine();
                    }
                }
            case String:
                return input.next();
            default:
                throw new IllegalArgumentException("Please select a int, decimal or string");
        }
    }
}