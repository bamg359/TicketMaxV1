package app.ui;

import app.persistence.dbconnection.DataBaseConnection;
import app.service.validators.DataTypeValidator;
import app.view.PlaceView;
import app.view.SeatView;
import app.view.UserView;

import java.sql.Connection;

public class CliUserInterface {

    Connection connection = DataBaseConnection.getInstance().getConnection();

    private final UserView userView;
    private final SeatView seatView;
    private final PlaceView placeView;

    public CliUserInterface(UserView userView , SeatView seatView , PlaceView placeView){
        this.userView = userView;
        this.seatView = seatView;
        this.placeView = placeView;

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
                    menuPrincipal();
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

    public void menuPrincipal(){

        while(true){

            int opt = DataTypeValidator.validateInt("""
                    Seleccione:
                    1. Menu de Usuarios
                    2. Menu de Eventos
                    3. Menu Lugares
                    4. Menu Sillas 
                    5. Menu Artistas
                    """);
            switch (opt){
                case 1:
                    System.out.println("Usuarios");
                    userMenu();
                    break;
                case 2:
                    System.out.println("Eventos");
                    break;
                case 3:
                    System.out.println("Lugares");
                    placeMenu();
                    break;
                case 4:
                    System.out.println("Sillas");
                    seatMenu();
                    break;

                default:
                    System.out.println("Seleccione una opcion valida");
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


    public void placeMenu(){

        int option = DataTypeValidator.validateInt("Seleccione 1. registrar lugares " +
                "2. Consultar lugares por id" +
                "3. Consultar todos los Lugares");
        switch (option){
            case 1:
                System.out.println("Registrar Lugares");
                placeView.registerPlace();
                break;
            case 2:
                System.out.println("Consultar Lugares por id");
                int id = DataTypeValidator.validateInt("Ingrese el id del usuario a consultar");
                placeView.showPlaceById();
                break;
            case 3:
                System.out.println("Consultar todos los Lugares");
                placeView.showAllPlaces();
                break;
            default:
                System.out.println("Ingrese una opción valida");
        }
    }

    public void seatMenu(){

        int option = DataTypeValidator.validateInt("Seleccione 1. registrar Silla " +
                "2. Consultar Silla por id" +
                "3. Consultar todos las Sillas");
        switch (option){
            case 1:
                System.out.println("Registrar Silla");
                seatView.createSeat();
                break;
            case 2:
                System.out.println("Consultar Silla por id");
                seatView.selectSeatById();
                break;
            case 3:
                System.out.println("Consultar todos lss Sillas");
                seatView.selectAllSeats();
                break;
            default:
                System.out.println("Ingrese una opción valida");
        }
    }






}
