package ro.tere.todo_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.tere.todo_app.entity.User;
import ro.tere.todo_app.repository.IUserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;


    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }
}
