package app.view;

import app.domain.SelectStateEnum;

import java.util.Scanner;

public class UserView {

    Scanner sc = new Scanner(System.in);

    public void create() {

        System.out.println("INgrese el id del usuario: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre del usuario: ");
        String name = sc.nextLine();
        System.out.println("Ingrese el apellido del usuario: ");
        String lastName = sc.nextLine();
        System.out.println("Ingrese el correo del usuario: ");
        String email = sc.nextLine();
        System.out.println("Ingrese el telefono del usuario: ");
        String phone = sc.nextLine();
        System.out.println("Ingrese la contraseña del usuario: ");
        String password = sc.nextLine();
        System.out.println("Ingrese el estado del usuario: ");
        String state;

    }


    public void selectById(int id) {

    }


    public void update() {

    }


    // métodos Helper

    public String getUserstate(){

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
