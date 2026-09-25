package app.repository;

import app.domain.User;
import app.service.outputports.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImplCollection implements UserRepository {

    List<User> users = new ArrayList<>();

    @Override
    public User save(User user) {

        users.add(user);

        /*
        users.add(String.valueOf(user.getId()));
        users.add(user.getName());
        users.add(user.getLastName());
        users.add(user.getEmail());
        users.add(user.getPhone());
        users.add(user.getPassword());
        users.add(String.valueOf(user.isState()));
        users.add(user.getCity());
        users.add(user.getPreferences());*/

        return user;
    }

    @Override
    public User selectById(int id) {
        return null;
    }

    @Override
    public List<User> selectAll() {

        for(User user : users){
            System.out.println(user.getId() + "" +
                    " " + user.getName() + "" + user.getLastName() + " " + user.getEmail() + " "
                    + user.getPhone() + "" + user.getPassword() + "" + user.isState() +
                    "" + user.getCity() + "" + user.getPreferences());
        }

        return users;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }
}
