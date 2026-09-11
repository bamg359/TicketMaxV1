package app.view;

import app.domain.enums.SelectStateEnum;
import app.domain.enums.SelectPreferencesEnum;
import app.service.UserServiceImpl;
import app.service.helpers.SetUserState;

import java.util.Scanner;

public class UserView {

    Scanner sc = new Scanner(System.in);


    private final UserServiceImpl userServiceImpl;

    public UserView(UserServiceImpl userServiceImpl){
        this.userServiceImpl = userServiceImpl;
    }

    public void createUser() {

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
        String state = SetUserState.getUserState();
        System.out.println("Ingrese la ciudad del usuario: ");
        String city = sc.nextLine();
        System.out.println("Ingrese las preferencias del usuario: ");
        String preferences = setUserPreferences();

        userServiceImpl.create(id, name , lastName , email , phone , password , state, city, preferences);

    }


    public void selectById(int id) {

    }


    public void update() {

    }


    // métodos Helper




    public String setUserPreferences(){
        System.out.println("Seleccione 1. VIP 2. General 3. Preferencial");

        int option = sc.nextInt();
        String preferences = "";
        sc.nextLine();
        switch (option){

            case 1:
                preferences = SelectPreferencesEnum.VIP.getPreference();
                break;
            case 2:
                preferences = SelectPreferencesEnum.GENERAL.getPreference();
                break;
            case 3:
                preferences = SelectPreferencesEnum.PREFERENCIAL.getPreference();
                break;
            default:
                System.out.println("Opción no valida");

        }
        return preferences;
    }








}
