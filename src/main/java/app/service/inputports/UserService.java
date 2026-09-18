package app.service.inputports;

import app.domain.User;

import java.util.List;

public interface UserService {


    public User create(Integer id, String name, String lastName, String email, String phone, String password, String state, String city, String preferences);
    public void selectById(int id);
    public List<User> selectUsers();
    public void update();
    public void deleteUser(int id);





}
