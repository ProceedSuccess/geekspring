package com.geekbrains.services;

import com.geekbrains.entities.Role;
import com.geekbrains.entities.User;
import com.geekbrains.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletContext;
import java.util.Collection;
import java.util.List;

public class UserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserService() {
    }

    public List<User> getAllUsersList() {
        return (List<User>)userRepository.findAll();
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public User findByUserName(String name){
        return userRepository.findOneByUserName(name);
    }

    public void removeById(Long id) {
        userRepository.deleteById(id);
    }

    public Collection<Role> getRolesByUserId(Long id) {
        return userRepository.findOneById(id).getRoles();
    }

}
