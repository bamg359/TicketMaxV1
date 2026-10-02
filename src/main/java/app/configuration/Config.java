package app.configuration;

import app.repository.SeatRepositoryAdapter;
import app.repository.UserRepositoryImplCollection;
import app.service.SeatServiceAdapter;
import app.service.UserServiceImpl;
import app.service.inputports.SeatServiceInterface;
import app.service.inputports.UserService;
import app.service.outputports.SeatRepositoryPort;
import app.service.outputports.UserRepository;
import app.ui.CliUserInterface;
import app.view.SeatView;
import app.view.UserView;

public class Config {

    public static CliUserInterface getCliUserInterface() {

        UserRepository userRepository = new UserRepositoryImplCollection();
        UserService userService = new UserServiceImpl(userRepository);
        UserView userView = new UserView(userService);

        SeatRepositoryPort seatRepositoryPort = new SeatRepositoryAdapter();
        SeatServiceInterface seatServiceInterface = new SeatServiceAdapter(seatRepositoryPort);
        SeatView seatView = new SeatView(seatServiceInterface);

        return new CliUserInterface(userView,seatView);
    }

}
