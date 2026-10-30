package app.configuration;

import app.persistence.dbconnection.DataBaseConnection;
import app.persistence.mappers.RowMapper;
import app.persistence.mappers.SeatMapper;
import app.persistence.repository.PlaceRepositoryAdapter;
import app.persistence.repository.SeatRepositoryAdapter;
import app.persistence.repository.SeatRepositoryAdapterDB;
import app.persistence.repository.UserRepositoryImplCollection;
import app.service.PlaceServiceAdapter;
import app.service.SeatServiceAdapter;
import app.service.UserServiceImpl;
import app.service.inputports.PlaceServiceInterface;
import app.service.inputports.SeatServiceInterface;
import app.service.inputports.UserService;
import app.service.outputports.PlaceRepositoryPort;
import app.service.outputports.SeatRepositoryPort;
import app.service.outputports.UserRepository;
import app.ui.CliUserInterface;
import app.view.PlaceView;
import app.view.SeatView;
import app.view.UserView;

import java.sql.Connection;

public class Config {

    public static CliUserInterface getCliUserInterface() {

        Connection connection = DataBaseConnection.getInstance().getConnection();
        RowMapper seatRowMapper = new SeatMapper();

        UserRepository userRepository = new UserRepositoryImplCollection();
        UserService userService = new UserServiceImpl(userRepository);
        UserView userView = new UserView(userService);

        SeatRepositoryPort seatRepositoryPort = new SeatRepositoryAdapterDB(connection ,seatRowMapper);
        SeatServiceInterface seatServiceInterface = new SeatServiceAdapter(seatRepositoryPort);
        SeatView seatView = new SeatView(seatServiceInterface);

        PlaceRepositoryPort placeRepositoryPort = new PlaceRepositoryAdapter();
        PlaceServiceInterface placeServiceInterface = new PlaceServiceAdapter(placeRepositoryPort);
        PlaceView placeView = new PlaceView(placeServiceInterface);

        return new CliUserInterface(userView,seatView, placeView);
    }

}
