package app.service.validators;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataTypeValidator {

    static Scanner sc = new Scanner(System.in);

    public static Integer validateInt(String prompt){
    while(true) {
            try {
                int value = sc.nextInt();
                sc.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Solo se aceptan numeros enteros" + e.getMessage());
            }
        }
    }


    public static Double validateDouble(String prompt){
        while(true) {
            try {
                Double value = sc.nextDouble();
                sc.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Solo se aceptan numeros decimales" + e.getMessage());
            }
        }
    }


    public static Float validateFloat(String prompt){
        while(true) {
            try {
                Float value = sc.nextFloat();
                sc.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Solo se aceptan numeros decimal flotante" + e.getMessage());
            }
        }
    }

    public static String validateString(String prompt){
        while(true) {

            String value = sc.nextLine().trim();
            if(!value.isEmpty()){
                return value;
            }
        }
    }
}
