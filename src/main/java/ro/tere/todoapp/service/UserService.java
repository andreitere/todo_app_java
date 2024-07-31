package ro.tere.todoapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.tere.todoapp.entity.User;
import ro.tere.todoapp.repository.IUserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;



    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }
}
