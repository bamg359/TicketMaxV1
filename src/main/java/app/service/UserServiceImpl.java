package app.service;

import app.domain.enums.SelectStateEnum;
import app.domain.User;
import app.repository.UserRepository;

public class UserServiceImpl {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User create(Integer id, String name, String lastName, String email, String phone, String password, String state, String city, String preferences) {

        User user = new User(id, name, lastName, email, phone, password, SelectStateEnum.valueOf(state), city, preferences);

        return userRepository.create(user);
    }


    public void selectById(int id) {

    }


    public void update() {

    }


}
