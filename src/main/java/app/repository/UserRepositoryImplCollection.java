package app.repository;

import app.domain.User;
import app.service.outputports.UserRepository;

import java.util.List;

public class UserRepositoryImplCollection implements UserRepository {

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public User selectById(int id) {
        return null;
    }

    @Override
    public List<User> selectAll() {
        return List.of();
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }
}
