package app.service.helpers;

import app.domain.enums.SelectStateEnum;

import java.util.Scanner;

public class SetUserState {

    static Scanner sc = new Scanner(System.in);


    public static String getUserState(){

        System.out.println("Seleccione 1. Activo 2. Inactivo 3. Bloqueado");
        int option = sc.nextInt();
        String state = "";
        sc.nextLine();
        switch (option){
            case 1:
                state = SelectStateEnum.ACTIVE.getState();
                break;
            case 2:
                state =  SelectStateEnum.INACTIVE.getState();
                break;
            case 3:
                state = SelectStateEnum.BLOCKED.getState();
                break;
            default:
                System.out.println("Opción no valida");
        }

        return state;
    }


}
