package app.ui;

import app.repository.UserRepositoryImplCollection;
import app.service.UserServiceImpl;
import app.service.inputports.UserService;
import app.service.outputports.UserRepository;
import app.service.validators.DataTypeValidator;
import app.view.SeatView;
import app.view.UserView;

public class CliUserInterface {



    private final UserView userView;
    private final SeatView seatView;

    public CliUserInterface(UserView userView , SeatView seatView){
        this.userView = userView;
        this.seatView = seatView;

    }

    public void applicationInit(){

        System.out.println("Bienvenido TicketMax V1");

        int init = DataTypeValidator.validateInt("Presione 1 para iniciar la aplicación");


        while(init != 0){

            int option = DataTypeValidator.validateInt("1. Registro " +
                    "2. Login" +
                    "3. Salir");

            switch (option){
                case 1:
                    userView.createUser();
                    break;
                case 2:
                    System.out.println("Login");
                    userMenu();
                    break;
                case 3:
                    System.out.println("Saliendo de la aplicación");
                    init = 0;
                    break;
                default:
                    System.out.println("Seleccione una opción valida");
                    break;
            }

        }



    }


    public void userMenu(){

        int option = DataTypeValidator.validateInt("Seleccione 1. registrar usuario " +
                "2. Consultar Usuario por id" +
                "3. Consultar todos los usuarios");

        switch (option){
            case 1:
                System.out.println("Registrar Usuario");
                userView.createUser();
                break;
            case 2:
                System.out.println("Consultar usuario por id");
                int id = DataTypeValidator.validateInt("Ingrese el id del usuario a consultar");
                userView.selectById(id);
                break;
            case 3:
                System.out.println("Consultar todos los usuarios");
                userView.selectUsers();
                break;
            default:
                System.out.println("Ingrese una opción valida");
        }





    }






}
